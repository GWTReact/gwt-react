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

GWTReact.cast = function(obj) {
    return obj;
};

window.GWTReact = GWTReact;


