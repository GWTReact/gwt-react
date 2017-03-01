'use strict';

import React from "react";
import ReactDOM from "react-dom";

//If you don't need rendering to strings comment out the following line
import ReactDOMServer from "react-dom/server";

//Export the base React packages to the Window object for GWT to access
window.React = React;
window.ReactDOM = ReactDOM;

//If you don't need rendering to strings comment out the following line
window.ReactDOMServer = ReactDOMServer;

//*****************************************************************************
// Support JS required for GWT React
//*****************************************************************************

var GWTReact = {};

GWTReact.cast = function(obj) {
    return obj;
};

window.GWTReact = GWTReact;


