# gwt-react
GWT Java bindings for React

##Introduction

gwt-react provides Java [GWT](http://www.gwtproject.org/) bindings for [React v15.1.0](https://facebook.github.io/react/) based on the
new JsInterop capabilities introduced in GWT 2.8

***Please note: the project currently depends on a Snapshot build of GWT 2.8 to work. Consider this project a preview. The API is highly likely to change.***

##Prerequisites

Any documentation assumes you are familiar with [React](https://facebook.github.io/react/). If this is not the case, please take the time
to learn the basic concepts first. Check out the resources section for useful links.

You should also be familiar with the GWT 2.8 JsInterop specification. You can find the specification
[here.](https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/edit#heading=h.o7amqk9edhb9)

##Getting Started

Please take a look at the [gwt-react-examples](https://github.com/GWTReact/gwt-react-examples) project for
details on how to use the library.

You can download the latest release .jar from Maven Central using the following coordinates:

* **groupId**&nbsp;&nbsp;&nbsp; com.github.gwtreact
* **artifactId**&nbsp;&nbsp;gwt-react
* **version**&nbsp;&nbsp;&nbsp;  0.1.0

##Documentation

Check out the [Documentation](https://github.com/GWTReact/gwt-react/blob/master/DOCUMENTATION.md). There are a number of important concepts specific to **gwt-react** that may not be obvious, even if you are an experienced GWT developer.

##Contributing

Once the project is stable we will be happy to except pull requests. If you find any problems please file issues.

##Roadmap

* Add facility to create factory interfaces like <code>React.DOM.xxx</code>

* Investigate writing an Annotation processor to create fluent prop classes

* Add server implementation of Array and StringSet (to allow a JSON structure to be modelled on client/server with one class)

* Investigate splitting ObjectLiteraL, Array, StringSet... into it's own project

* Refine the different prop types for basic HTML elements

* Refine the CSS prop types and add enumerations and more useful setter methods where possible

* Remove any dependencies on com.google.gwt.dom.*. Replace with Elemental 2 or something equivalent

* ~~Prepare project(s) for publishing to Maven e.g. add Gradle build/release files~~ , DONE

* ~~Publish project(s) to Maven~~ , DONE

* ~~Verify interop within existing Widget based GWT projects~~ DONE, check out widget_interop in the gwt-react-examples project

* ~~Show how to use npm and webpack to create a javascript bundle~~ DONE, check out the documentation.

##Change log

| Date | Version | Description |
| :---      | :---  | :---  |
| 5/13/2016 | 0.1.0 | Initial preview release to Maven Central   |

##Resources

* [Official React documentation](https://facebook.github.io/react/docs/displaying-data.html)
* [Learn Raw React � no JSX, no Flux, no ES6, no Webpack�](http://jamesknelson.com/learn-raw-react-no-jsx-flux-es6-webpack/)
* [20 Free Online React Tutorials](https://www.icicletech.com/blog/reactjs-free-20-online-tutorials)
* [Exploring ES6](http://exploringjs.com/es6/)



