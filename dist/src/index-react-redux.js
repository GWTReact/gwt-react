'use strict';

import React from "react";
import ReactDOM from "react-dom";

//If you don't need rendering to strings comment out the following line
import ReactDOMServer from "react-dom/server";

//If you don't use Redux comment out the following lines
import * as ReactRedux from "react-redux";
import * as Redux from "redux";
import undoable, {ActionCreators} from "redux-undo";

//Export the base React packages to the Window object for GWT to access
window.React = React;
window.ReactDOM = ReactDOM;

//If you don't need rendering to strings comment out the following line
window.ReactDOMServer = ReactDOMServer;

//If you don't use Redux comment out the following lines
window.Redux = Redux;
window.ReactRedux = ReactRedux;
window.ReduxUndo = {"ActionCreators": ActionCreators, "undoable": undoable};

//*****************************************************************************
// Support JS required for GWT React
//*****************************************************************************

var GWTReact = {};

GWTReact.makeSpec = function(componentObj) {
    var prototype = componentObj.__proto__;
    var spec = {
        getState: function() {
            return this.state;
        }
        ,getProps: function() {
            return this.props;
        },
        getRef: function(refId) {
            return this.refs[refId];
        }
    };

    for (var p in prototype) {
        if (p != 'constructor' && prototype.hasOwnProperty(p)) {
            spec[p] = prototype[p];
            // console.log("proto fn " + p);
        }
    }

    for (p in componentObj) {
        if (p != 'constructor' && componentObj.hasOwnProperty(p)) {
            spec[p] = componentObj[p];
            //console.log("obj prop " + p);
        }
    }
    //console.log("");
    return spec;
};

GWTReact.cast = function(obj) {
    return obj;
};

window.GWTReact = GWTReact;


