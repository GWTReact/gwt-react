'use strict';

import React from "react";
import ReactDOM from "react-dom";

//If you don't need rendering to strings comment out the following line
import ReactDOMServer from "react-dom/server";

//If you don't MobX comment out the following line
import * as MobX from "mobx";
import * as MobXReact from "mobx-react";
import * as MobXDevTools from "mobx-react-devtools";

//Export the base React packages to the Window object for GWT to access
window.React = React;
window.ReactDOM = ReactDOM;

//If you don't need rendering to strings comment out the following line
window.ReactDOMServer = ReactDOMServer;

//If you don't use MobX comment out the following lines
window.MobX = MobX;
window.MobXReact = MobXReact;
window.MobXDevTools = MobXDevTools;

//*****************************************************************************
// Support JS required for GWT React
//*****************************************************************************

var GWTReact = {};

GWTReact.cast = function(obj) {
    return obj;
};

window.GWTReact = GWTReact;


