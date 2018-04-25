'use strict';

import React from "react";
import ReactDOM from "react-dom";
import FineUploaderTraditional from 'fine-uploader-wrappers'
import Gallery from 'react-fine-uploader'
import 'react-fine-uploader/gallery/gallery.css'

//If you don't need rendering to strings comment out the following line
import ReactDOMServer from "react-dom/server";

//Export the base React packages to the Window object for GWT to access
window.React = React;
window.ReactDOM = ReactDOM;

//If you don't need rendering to strings comment out the following line
window.ReactDOMServer = ReactDOMServer;

window.FineUploader = {
    Gallery : Gallery,
    FineUploaderTraditional : FineUploaderTraditional
}

