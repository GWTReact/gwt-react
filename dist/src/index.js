'use strict';

import React from "react";
import ReactDOM from "react-dom";

//If you don't need rendering to strings comment out the following line
import ReactDOMServer from "react-dom/server";

//If you don't use Redux comment out the following lines
import * as ReactRedux from "react-redux";
import * as Redux from "redux";
import undoable, {ActionCreators} from "redux-undo";

//If you don't use React Router comment out the following line
import * as ReactRouter from "react-router";

//If you don't MobX comment out the following line
import * as MobX from "mobx";

//Export the base React packages to the Window object for GWT to access
window.React = React;
window.ReactDOM = ReactDOM;

//If you don't need rendering to strings comment out the following line
window.ReactDOMServer = ReactDOMServer;

//If you don't use Redux comment out the following lines
window.Redux = Redux;
window.ReactRedux = ReactRedux;
window.ReduxUndo = {"ActionCreators": ActionCreators, "undoable": undoable};

//If you don't use React Router comment out the following line
window.ReactRouter = ReactRouter;

//If you don't use MobX comment out the following line
window.MobX = MobX;

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

GWTReact.g = function(obj, field) {
    return obj[field];
};

GWTReact.s = function(obj, field, val) {
    obj[field] = val;
};

GWTReact.ca = function() {
    return [];
};

GWTReact.hasProp = function (obj, key) {
    return obj[key] !== undefined;
};

GWTReact.remProp = function (obj, key) {
    delete obj[key];
};

GWTReact.props = function (obj) {
    var o = [];

    for (var prop in obj) {
        if (obj.hasOwnProperty(prop)) o.push(prop);
    }

    return o;
};

GWTReact.values = function (obj) {
    var o = [];
    for (var prop in obj) {
        if (obj.hasOwnProperty(prop)) {
            o.push(this[prop]);
        }
    }
    return o;
};

GWTReact.cast = function(obj) {
    return obj;
};

GWTReact.merge = function(obj1, obj2) {
    return Object.assign({}, obj1, obj2);
};

GWTReact.except = function(obj, exclude) {
    var out = {};
    var exludeMap = {};

    for(var i = 0; i < exclude.length; i++) {
        exludeMap[exclude[i]] = true;
    }

    for (var p in obj) {
        if (!exludeMap[p] && obj.hasOwnProperty(p)) {
            out[p] = obj[p];
        }
    }

    return out;
};

window.GWTReact = GWTReact;

