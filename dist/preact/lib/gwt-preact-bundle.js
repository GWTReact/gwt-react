/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};

/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {

/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;

/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};

/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);

/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;

/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}


/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;

/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;

/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";

/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports, __webpack_require__) {

	'use strict';

	var _react = __webpack_require__(1);

	var _react2 = _interopRequireDefault(_react);

	var _reactDom = __webpack_require__(1);

	var _reactDom2 = _interopRequireDefault(_reactDom);

	var _server = __webpack_require__(5);

	var _server2 = _interopRequireDefault(_server);

	function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

	//Export the base React packages to the Window object for GWT to access
	window.React = _react2.default;

	//If you don't need rendering to strings comment out the following line

	window.ReactDOM = _reactDom2.default;

	//If you don't need rendering to strings comment out the following line
	window.ReactDOMServer = _server2.default;

	//*****************************************************************************
	// Support JS required for GWT React
	//*****************************************************************************

	var GWTReact = {};

	GWTReact.cast = function (obj) {
	    return obj;
	};

	window.GWTReact = GWTReact;

/***/ },
/* 1 */
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function(process) {(function (global, factory) {
		 true ? module.exports = factory(__webpack_require__(3), __webpack_require__(4)) :
		typeof define === 'function' && define.amd ? define(['proptypes', 'preact'], factory) :
		(global.preactCompat = factory(global.PropTypes,global.preact));
	}(this, (function (PropTypes,preact) {

	PropTypes = 'default' in PropTypes ? PropTypes['default'] : PropTypes;

	var version = '15.1.0'; // trick libraries to think we are react

	var ELEMENTS = 'a abbr address area article aside audio b base bdi bdo big blockquote body br button canvas caption cite code col colgroup data datalist dd del details dfn dialog div dl dt em embed fieldset figcaption figure footer form h1 h2 h3 h4 h5 h6 head header hgroup hr html i iframe img input ins kbd keygen label legend li link main map mark menu menuitem meta meter nav noscript object ol optgroup option output p param picture pre progress q rp rt ruby s samp script section select small source span strong style sub summary sup table tbody td textarea tfoot th thead time title tr track u ul var video wbr circle clipPath defs ellipse g image line linearGradient mask path pattern polygon polyline radialGradient rect stop svg text tspan'.split(' ');

	var REACT_ELEMENT_TYPE = (typeof Symbol!=='undefined' && Symbol.for && Symbol.for('react.element')) || 0xeac7;

	var COMPONENT_WRAPPER_KEY = typeof Symbol!=='undefined' ? Symbol.for('__preactCompatWrapper') : '__preactCompatWrapper';

	// don't autobind these methods since they already have guaranteed context.
	var AUTOBIND_BLACKLIST = {
		constructor: 1,
		render: 1,
		shouldComponentUpdate: 1,
		componentWillReceiveProps: 1,
		componentWillUpdate: 1,
		componentDidUpdate: 1,
		componentWillMount: 1,
		componentDidMount: 1,
		componentWillUnmount: 1,
		componentDidUnmount: 1
	};


	var CAMEL_PROPS = /^(?:accent|alignment|arabic|baseline|cap|clip|color|fill|flood|font|glyph|horiz|marker|overline|paint|stop|strikethrough|stroke|text|underline|unicode|units|v|vert|word|writing|x)[A-Z]/;


	var BYPASS_HOOK = {};

	/*global process*/
	var DEV = typeof process==='undefined' || !process.env || process.env.NODE_ENV!=='production';

	// a component that renders nothing. Used to replace components for unmountComponentAtNode.
	function EmptyComponent() { return null; }



	// make react think we're react.
	var VNode = preact.h('a', null).constructor;
	VNode.prototype.$$typeof = REACT_ELEMENT_TYPE;
	VNode.prototype.preactCompatUpgraded = false;
	VNode.prototype.preactCompatNormalized = false;

	Object.defineProperty(VNode.prototype, 'type', {
		get: function() { return this.nodeName; },
		set: function(v) { this.nodeName = v; },
		configurable:true
	});

	Object.defineProperty(VNode.prototype, 'props', {
		get: function() { return this.attributes; },
		set: function(v) { this.attributes = v; },
		configurable:true
	});



	var oldEventHook = preact.options.event;
	preact.options.event = function (e) {
		if (oldEventHook) { e = oldEventHook(e); }
		e.persist = Object;
		e.nativeEvent = e;
		return e;
	};


	var oldVnodeHook = preact.options.vnode;
	preact.options.vnode = function (vnode) {
		if (!vnode.preactCompatUpgraded) {
			vnode.preactCompatUpgraded = true;

			var tag = vnode.nodeName,
				attrs = vnode.attributes;

			if (!attrs) { attrs = vnode.attributes = {}; }

			if (typeof tag==='function') {
				if (tag[COMPONENT_WRAPPER_KEY]===true || (tag.prototype && 'isReactComponent' in tag.prototype)) {
					if (vnode.children && !vnode.children.length) { vnode.children = undefined; }
					if (vnode.children) { attrs.children = vnode.children; }

					if (!vnode.preactCompatNormalized) {
						normalizeVNode(vnode);
					}
					handleComponentVNode(vnode);
				}
			}
			else {
				if (vnode.children && !vnode.children.length) { vnode.children = undefined; }
				if (vnode.children) { attrs.children = vnode.children; }

				if (attrs.defaultValue) {
					if (!attrs.value && attrs.value!==0) {
						attrs.value = attrs.defaultValue;
					}
					delete attrs.defaultValue;
				}

				handleElementVNode(vnode, attrs);
			}
		}

		if (oldVnodeHook) { oldVnodeHook(vnode); }
	};

	function handleComponentVNode(vnode) {
		var tag = vnode.nodeName,
			a = vnode.attributes;

		vnode.attributes = {};
		if (tag.defaultProps) { extend(vnode.attributes, tag.defaultProps); }
		if (a) { extend(vnode.attributes, a); }
	}

	function handleElementVNode(vnode, a) {
		var shouldSanitize, attrs, i;
		if (a) {
			for (i in a) { if ((shouldSanitize = CAMEL_PROPS.test(i))) { break; } }
			if (shouldSanitize) {
				attrs = vnode.attributes = {};
				for (i in a) {
					if (a.hasOwnProperty(i)) {
						attrs[ CAMEL_PROPS.test(i) ? i.replace(/([A-Z0-9])/, '-$1').toLowerCase() : i ] = a[i];
					}
				}
			}
		}
	}



	// proxy render() since React returns a Component reference.
	function render$1(vnode, parent, callback) {
		var prev = parent && parent._preactCompatRendered;

		// ignore impossible previous renders
		if (prev && prev.parentNode!==parent) { prev = null; }

		// default to first Element child
		if (!prev) { prev = parent.children[0]; }

		// remove unaffected siblings
		for (var i=parent.childNodes.length; i--; ) {
			if (parent.childNodes[i]!==prev) {
				parent.removeChild(parent.childNodes[i]);
			}
		}

		var out = preact.render(vnode, parent, prev);
		if (parent) { parent._preactCompatRendered = out; }
		if (typeof callback==='function') { callback(); }
		return out && out._component || out.base;
	}


	var ContextProvider = function () {};

	ContextProvider.prototype.getChildContext = function () {
		return this.props.context;
	};
	ContextProvider.prototype.render = function (props) {
		return props.children[0];
	};

	function renderSubtreeIntoContainer(parentComponent, vnode, container, callback) {
		var wrap = preact.h(ContextProvider, { context: parentComponent.context }, vnode);
		var c = render$1(wrap, container);
		if (callback) { callback(c); }
		return c;
	}


	function unmountComponentAtNode(container) {
		var existing = container._preactCompatRendered;
		if (existing && existing.parentNode===container) {
			preact.render(preact.h(EmptyComponent), container, existing);
			return true;
		}
		return false;
	}



	var ARR = [];

	// This API is completely unnecessary for Preact, so it's basically passthrough.
	var Children = {
		map: function(children, fn, ctx) {
			if (children == null) { return null; }
			children = Children.toArray(children);
			if (ctx && ctx!==children) { fn = fn.bind(ctx); }
			return children.map(fn);
		},
		forEach: function(children, fn, ctx) {
			if (children == null) { return null; }
			children = Children.toArray(children);
			if (ctx && ctx!==children) { fn = fn.bind(ctx); }
			children.forEach(fn);
		},
		count: function(children) {
			return children && children.length || 0;
		},
		only: function(children) {
			children = Children.toArray(children);
			if (children.length!==1) { throw new Error('Children.only() expects only one child.'); }
			return children[0];
		},
		toArray: function(children) {
			return Array.isArray && Array.isArray(children) ? children : ARR.concat(children);
		}
	};


	/** Track current render() component for ref assignment */
	var currentComponent;


	function createFactory(type) {
		return createElement.bind(null, type);
	}


	var DOM = {};
	for (var i=ELEMENTS.length; i--; ) {
		DOM[ELEMENTS[i]] = createFactory(ELEMENTS[i]);
	}

	function upgradeToVNodes(arr, offset) {
		for (var i=offset || 0; i<arr.length; i++) {
			var obj = arr[i];
			if (Array.isArray(obj)) {
				upgradeToVNodes(obj);
			}
			else if (obj && typeof obj==='object' && !isValidElement(obj) && ((obj.props && obj.type) || (obj.attributes && obj.nodeName) || obj.children)) {
				arr[i] = createElement(obj.type || obj.nodeName, obj.props || obj.attributes, obj.children);
			}
		}
	}

	function isStatelessComponent(c) {
		return typeof c==='function' && !(c.prototype && c.prototype.render);
	}


	// wraps stateless functional components in a PropTypes validator
	function wrapStatelessComponent(WrappedComponent) {
		return createClass({
			displayName: WrappedComponent.displayName || WrappedComponent.name,
			render: function() {
				return WrappedComponent(this.props, this.context);
			}
		});
	}


	function statelessComponentHook(Ctor) {
		var Wrapped = Ctor[COMPONENT_WRAPPER_KEY];
		if (Wrapped) { return Wrapped===true ? Ctor : Wrapped; }

		Wrapped = wrapStatelessComponent(Ctor);

		Object.defineProperty(Wrapped, COMPONENT_WRAPPER_KEY, { configurable:true, value:true });
		Wrapped.displayName = Ctor.displayName;
		Wrapped.propTypes = Ctor.propTypes;
		Wrapped.defaultProps = Ctor.defaultProps;

		Object.defineProperty(Ctor, COMPONENT_WRAPPER_KEY, { configurable:true, value:Wrapped });

		return Wrapped;
	}


	function createElement() {
		var args = [], len = arguments.length;
		while ( len-- ) args[ len ] = arguments[ len ];

		upgradeToVNodes(args, 2);
		return normalizeVNode(preact.h.apply(void 0, args));
	}


	function normalizeVNode(vnode) {
		vnode.preactCompatNormalized = true;

		applyClassName(vnode);

		if (isStatelessComponent(vnode.nodeName)) {
			vnode.nodeName = statelessComponentHook(vnode.nodeName);
		}

		var ref = vnode.attributes.ref,
			type = ref && typeof ref;
		if (currentComponent && (type==='string' || type==='number')) {
			vnode.attributes.ref = createStringRefProxy(ref, currentComponent);
		}

		applyEventNormalization(vnode);

		return vnode;
	}


	function cloneElement$1(element, props) {
		var children = [], len = arguments.length - 2;
		while ( len-- > 0 ) children[ len ] = arguments[ len + 2 ];

		if (!isValidElement(element)) { return element; }
		var elementProps = element.attributes || element.props;
		var node = preact.h(
			element.nodeName || element.type,
			elementProps,
			element.children || elementProps && elementProps.children
		);
		return normalizeVNode(preact.cloneElement.apply(void 0, [ node, props ].concat( children )));
	}


	function isValidElement(element) {
		return element && ((element instanceof VNode) || element.$$typeof===REACT_ELEMENT_TYPE);
	}


	function createStringRefProxy(name, component) {
		return component._refProxies[name] || (component._refProxies[name] = function (resolved) {
			if (component && component.refs) {
				component.refs[name] = resolved;
				if (resolved===null) {
					delete component._refProxies[name];
					component = null;
				}
			}
		});
	}


	function applyEventNormalization(ref) {
		var nodeName = ref.nodeName;
		var attributes = ref.attributes;

		if (!attributes || typeof nodeName!=='string') { return; }
		var props = {};
		for (var i in attributes) {
			props[i.toLowerCase()] = i;
		}
		if (props.ondoubleclick) {
			attributes.ondblclick = attributes[props.ondoubleclick];
			delete attributes[props.ondoubleclick];
		}
		// for *textual inputs* (incl textarea), normalize `onChange` -> `onInput`:
		if (props.onchange && (nodeName==='textarea' || (nodeName.toLowerCase()==='input' && !/^fil|che|rad/i.test(attributes.type)))) {
			var normalized = props.oninput || 'oninput';
			if (!attributes[normalized]) {
				attributes[normalized] = multihook([attributes[normalized], attributes[props.onchange]]);
				delete attributes[props.onchange];
			}
		}
	}


	function applyClassName(ref) {
		var attributes = ref.attributes;

		if (!attributes) { return; }
		var cl = attributes.className || attributes.class;
		if (cl) { attributes.className = cl; }
	}


	function extend(base, props) {
		for (var key in props) {
			if (props.hasOwnProperty(key)) {
				base[key] = props[key];
			}
		}
		return base;
	}


	function shallowDiffers(a, b) {
		for (var i in a) { if (!(i in b)) { return true; } }
		for (var i$1 in b) { if (a[i$1]!==b[i$1]) { return true; } }
		return false;
	}


	function findDOMNode(component) {
		return component && component.base || component;
	}


	function F(){}

	function createClass(obj) {
		function cl(props, context) {
			bindAll(this);
			Component$1.call(this, props, context, BYPASS_HOOK);
			newComponentHook.call(this, props, context);
		}

		obj = extend({ constructor: cl }, obj);

		// We need to apply mixins here so that getDefaultProps is correctly mixed
		if (obj.mixins) {
			applyMixins(obj, collateMixins(obj.mixins));
		}
		if (obj.statics) {
			extend(cl, obj.statics);
		}
		if (obj.propTypes) {
			cl.propTypes = obj.propTypes;
		}
		if (obj.defaultProps) {
			cl.defaultProps = obj.defaultProps;
		}
		if (obj.getDefaultProps) {
			cl.defaultProps = obj.getDefaultProps();
		}

		F.prototype = Component$1.prototype;
		cl.prototype = extend(new F(), obj);

		cl.displayName = obj.displayName || 'Component';

		return cl;
	}


	// Flatten an Array of mixins to a map of method name to mixin implementations
	function collateMixins(mixins) {
		var keyed = {};
		for (var i=0; i<mixins.length; i++) {
			var mixin = mixins[i];
			for (var key in mixin) {
				if (mixin.hasOwnProperty(key) && typeof mixin[key]==='function') {
					(keyed[key] || (keyed[key]=[])).push(mixin[key]);
				}
			}
		}
		return keyed;
	}


	// apply a mapping of Arrays of mixin methods to a component prototype
	function applyMixins(proto, mixins) {
		for (var key in mixins) { if (mixins.hasOwnProperty(key)) {
			proto[key] = multihook(
				mixins[key].concat(proto[key] || ARR),
				key==='getDefaultProps' || key==='getInitialState' || key==='getChildContext'
			);
		} }
	}


	function bindAll(ctx) {
		for (var i in ctx) {
			var v = ctx[i];
			if (typeof v==='function' && !v.__bound && !AUTOBIND_BLACKLIST.hasOwnProperty(i)) {
				(ctx[i] = v.bind(ctx)).__bound = true;
			}
		}
	}


	function callMethod(ctx, m, args) {
		if (typeof m==='string') {
			m = ctx.constructor.prototype[m];
		}
		if (typeof m==='function') {
			return m.apply(ctx, args);
		}
	}

	function multihook(hooks, skipDuplicates) {
		return function() {
			var arguments$1 = arguments;
			var this$1 = this;

			var ret;
			for (var i=0; i<hooks.length; i++) {
				var r = callMethod(this$1, hooks[i], arguments$1);

				if (skipDuplicates && r!=null) {
					if (!ret) { ret = {}; }
					for (var key in r) { if (r.hasOwnProperty(key)) {
						ret[key] = r[key];
					} }
				}
				else if (typeof r!=='undefined') { ret = r; }
			}
			return ret;
		};
	}


	function newComponentHook(props, context) {
		propsHook.call(this, props, context);
		this.componentWillReceiveProps = multihook([propsHook, this.componentWillReceiveProps || 'componentWillReceiveProps']);
		this.render = multihook([propsHook, beforeRender, this.render || 'render', afterRender]);
	}


	function propsHook(props, context) {
		var this$1 = this;

		if (!props) { return; }

		// React annoyingly special-cases single children, and some react components are ridiculously strict about this.
		var c = props.children;
		if (c && Array.isArray(c) && c.length===1) {
			props.children = c[0];

			// but its totally still going to be an Array.
			if (props.children && typeof props.children==='object') {
				props.children.length = 1;
				props.children[0] = props.children;
			}
		}

		// add proptype checking
		if (DEV) {
			var ctor = typeof this==='function' ? this : this.constructor,
				propTypes = this.propTypes || ctor.propTypes;
			if (propTypes) {
				for (var prop in propTypes) {
					if (propTypes.hasOwnProperty(prop) && typeof propTypes[prop]==='function') {
						var displayName = this$1.displayName || ctor.name;
						var err = propTypes[prop](props, prop, displayName, 'prop');
						if (err) { console.error(new Error(err.message || err)); }
					}
				}
			}
		}
	}


	function beforeRender(props) {
		currentComponent = this;
	}

	function afterRender() {
		if (currentComponent===this) {
			currentComponent = null;
		}
	}



	function Component$1(props, context, opts) {
		preact.Component.call(this, props, context);
		this.state = this.getInitialState ? this.getInitialState() : {};
		this.refs = {};
		this._refProxies = {};
		if (opts!==BYPASS_HOOK) {
			newComponentHook.call(this, props, context);
		}
	}
	extend(Component$1.prototype = new preact.Component(), {
		constructor: Component$1,

		isReactComponent: {},

		replaceState: function(state, callback) {
			var this$1 = this;

			this.setState(state, callback);
			for (var i in this$1.state) {
				if (!(i in state)) {
					delete this$1.state[i];
				}
			}
		},

		getDOMNode: function() {
			return this.base;
		},

		isMounted: function() {
			return !!this.base;
		}
	});



	function PureComponent(props, context) {
		Component$1.call(this, props, context);
	}
	F.prototype = Component$1.prototype;
	PureComponent.prototype = new F();
	PureComponent.prototype.shouldComponentUpdate = function(props, state) {
		return shallowDiffers(this.props, props) || shallowDiffers(this.state, state);
	};



	var index = {
		version: version,
		DOM: DOM,
		PropTypes: PropTypes,
		Children: Children,
		render: render$1,
		createClass: createClass,
		createFactory: createFactory,
		createElement: createElement,
		cloneElement: cloneElement$1,
		isValidElement: isValidElement,
		findDOMNode: findDOMNode,
		unmountComponentAtNode: unmountComponentAtNode,
		Component: Component$1,
		PureComponent: PureComponent,
		unstable_renderSubtreeIntoContainer: renderSubtreeIntoContainer
	};

	return index;

	})));
	//# sourceMappingURL=preact-compat.js.map

	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(2)))

/***/ },
/* 2 */
/***/ function(module, exports) {

	// shim for using process in browser
	var process = module.exports = {};

	// cached from whatever global is present so that test runners that stub it
	// don't break things.  But we need to wrap it in a try catch in case it is
	// wrapped in strict mode code which doesn't define any globals.  It's inside a
	// function because try/catches deoptimize in certain engines.

	var cachedSetTimeout;
	var cachedClearTimeout;

	function defaultSetTimout() {
	    throw new Error('setTimeout has not been defined');
	}
	function defaultClearTimeout () {
	    throw new Error('clearTimeout has not been defined');
	}
	(function () {
	    try {
	        if (typeof setTimeout === 'function') {
	            cachedSetTimeout = setTimeout;
	        } else {
	            cachedSetTimeout = defaultSetTimout;
	        }
	    } catch (e) {
	        cachedSetTimeout = defaultSetTimout;
	    }
	    try {
	        if (typeof clearTimeout === 'function') {
	            cachedClearTimeout = clearTimeout;
	        } else {
	            cachedClearTimeout = defaultClearTimeout;
	        }
	    } catch (e) {
	        cachedClearTimeout = defaultClearTimeout;
	    }
	} ())
	function runTimeout(fun) {
	    if (cachedSetTimeout === setTimeout) {
	        //normal enviroments in sane situations
	        return setTimeout(fun, 0);
	    }
	    // if setTimeout wasn't available but was latter defined
	    if ((cachedSetTimeout === defaultSetTimout || !cachedSetTimeout) && setTimeout) {
	        cachedSetTimeout = setTimeout;
	        return setTimeout(fun, 0);
	    }
	    try {
	        // when when somebody has screwed with setTimeout but no I.E. maddness
	        return cachedSetTimeout(fun, 0);
	    } catch(e){
	        try {
	            // When we are in I.E. but the script has been evaled so I.E. doesn't trust the global object when called normally
	            return cachedSetTimeout.call(null, fun, 0);
	        } catch(e){
	            // same as above but when it's a version of I.E. that must have the global object for 'this', hopfully our context correct otherwise it will throw a global error
	            return cachedSetTimeout.call(this, fun, 0);
	        }
	    }


	}
	function runClearTimeout(marker) {
	    if (cachedClearTimeout === clearTimeout) {
	        //normal enviroments in sane situations
	        return clearTimeout(marker);
	    }
	    // if clearTimeout wasn't available but was latter defined
	    if ((cachedClearTimeout === defaultClearTimeout || !cachedClearTimeout) && clearTimeout) {
	        cachedClearTimeout = clearTimeout;
	        return clearTimeout(marker);
	    }
	    try {
	        // when when somebody has screwed with setTimeout but no I.E. maddness
	        return cachedClearTimeout(marker);
	    } catch (e){
	        try {
	            // When we are in I.E. but the script has been evaled so I.E. doesn't  trust the global object when called normally
	            return cachedClearTimeout.call(null, marker);
	        } catch (e){
	            // same as above but when it's a version of I.E. that must have the global object for 'this', hopfully our context correct otherwise it will throw a global error.
	            // Some versions of I.E. have different rules for clearTimeout vs setTimeout
	            return cachedClearTimeout.call(this, marker);
	        }
	    }



	}
	var queue = [];
	var draining = false;
	var currentQueue;
	var queueIndex = -1;

	function cleanUpNextTick() {
	    if (!draining || !currentQueue) {
	        return;
	    }
	    draining = false;
	    if (currentQueue.length) {
	        queue = currentQueue.concat(queue);
	    } else {
	        queueIndex = -1;
	    }
	    if (queue.length) {
	        drainQueue();
	    }
	}

	function drainQueue() {
	    if (draining) {
	        return;
	    }
	    var timeout = runTimeout(cleanUpNextTick);
	    draining = true;

	    var len = queue.length;
	    while(len) {
	        currentQueue = queue;
	        queue = [];
	        while (++queueIndex < len) {
	            if (currentQueue) {
	                currentQueue[queueIndex].run();
	            }
	        }
	        queueIndex = -1;
	        len = queue.length;
	    }
	    currentQueue = null;
	    draining = false;
	    runClearTimeout(timeout);
	}

	process.nextTick = function (fun) {
	    var args = new Array(arguments.length - 1);
	    if (arguments.length > 1) {
	        for (var i = 1; i < arguments.length; i++) {
	            args[i - 1] = arguments[i];
	        }
	    }
	    queue.push(new Item(fun, args));
	    if (queue.length === 1 && !draining) {
	        runTimeout(drainQueue);
	    }
	};

	// v8 likes predictible objects
	function Item(fun, array) {
	    this.fun = fun;
	    this.array = array;
	}
	Item.prototype.run = function () {
	    this.fun.apply(null, this.array);
	};
	process.title = 'browser';
	process.browser = true;
	process.env = {};
	process.argv = [];
	process.version = ''; // empty string to avoid regexp issues
	process.versions = {};

	function noop() {}

	process.on = noop;
	process.addListener = noop;
	process.once = noop;
	process.off = noop;
	process.removeListener = noop;
	process.removeAllListeners = noop;
	process.emit = noop;

	process.binding = function (name) {
	    throw new Error('process.binding is not supported');
	};

	process.cwd = function () { return '/' };
	process.chdir = function (dir) {
	    throw new Error('process.chdir is not supported');
	};
	process.umask = function() { return 0; };


/***/ },
/* 3 */
/***/ function(module, exports, __webpack_require__) {

	var __WEBPACK_AMD_DEFINE_FACTORY__, __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;(function (global, factory) {
	  if (true) {
	    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [exports, module], __WEBPACK_AMD_DEFINE_FACTORY__ = (factory), __WEBPACK_AMD_DEFINE_RESULT__ = (typeof __WEBPACK_AMD_DEFINE_FACTORY__ === 'function' ? (__WEBPACK_AMD_DEFINE_FACTORY__.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__)) : __WEBPACK_AMD_DEFINE_FACTORY__), __WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	  } else if (typeof exports !== 'undefined' && typeof module !== 'undefined') {
	    factory(exports, module);
	  } else {
	    var mod = {
	      exports: {}
	    };
	    factory(mod.exports, mod);
	    global.PropTypes = mod.exports;
	  }
	})(this, function (exports, module) {

	  'use strict';

	  var REACT_ELEMENT_TYPE = typeof Symbol === 'function' && Symbol['for'] && Symbol['for']('react.element') || 0xeac7;

	  var ReactElement = {};

	  ReactElement.isValidElement = function (object) {
	    return typeof object === 'object' && object !== null && object.$$typeof === REACT_ELEMENT_TYPE;
	  };

	  var ReactPropTypeLocationNames = {
	    prop: 'prop',
	    context: 'context',
	    childContext: 'child context'
	  };

	  var emptyFunction = {
	    thatReturns: function thatReturns(what) {
	      return function () {
	        return what;
	      };
	    }
	  };

	  var ITERATOR_SYMBOL = typeof Symbol === 'function' && Symbol.iterator;
	  var FAUX_ITERATOR_SYMBOL = '@@iterator';
	  function getIteratorFn(maybeIterable) {
	    var iteratorFn = maybeIterable && (ITERATOR_SYMBOL && maybeIterable[ITERATOR_SYMBOL] || maybeIterable[FAUX_ITERATOR_SYMBOL]);
	    if (typeof iteratorFn === 'function') {
	      return iteratorFn;
	    }
	  }

	  var ANONYMOUS = '<<anonymous>>';

	  var ReactPropTypes = {
	    array: createPrimitiveTypeChecker('array'),
	    bool: createPrimitiveTypeChecker('boolean'),
	    func: createPrimitiveTypeChecker('function'),
	    number: createPrimitiveTypeChecker('number'),
	    object: createPrimitiveTypeChecker('object'),
	    string: createPrimitiveTypeChecker('string'),
	    symbol: createPrimitiveTypeChecker('symbol'),

	    any: createAnyTypeChecker(),
	    arrayOf: createArrayOfTypeChecker,
	    element: createElementTypeChecker(),
	    instanceOf: createInstanceTypeChecker,
	    node: createNodeChecker(),
	    objectOf: createObjectOfTypeChecker,
	    oneOf: createEnumTypeChecker,
	    oneOfType: createUnionTypeChecker,
	    shape: createShapeTypeChecker
	  };

	  function createChainableTypeChecker(validate) {
	    function checkType(isRequired, props, propName, componentName, location, propFullName) {
	      componentName = componentName || ANONYMOUS;
	      propFullName = propFullName || propName;
	      if (props[propName] == null) {
	        var locationName = ReactPropTypeLocationNames[location];
	        if (isRequired) {
	          return new Error('Required ' + locationName + ' `' + propFullName + '` was not specified in ' + ('`' + componentName + '`.'));
	        }
	        return null;
	      } else {
	        return validate(props, propName, componentName, location, propFullName);
	      }
	    }

	    var chainedCheckType = checkType.bind(null, false);
	    chainedCheckType.isRequired = checkType.bind(null, true);

	    return chainedCheckType;
	  }

	  function createPrimitiveTypeChecker(expectedType) {
	    function validate(props, propName, componentName, location, propFullName) {
	      var propValue = props[propName];
	      var propType = getPropType(propValue);
	      if (propType !== expectedType) {
	        var locationName = ReactPropTypeLocationNames[location];

	        var preciseType = getPreciseType(propValue);

	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` of type ' + ('`' + preciseType + '` supplied to `' + componentName + '`, expected ') + ('`' + expectedType + '`.'));
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createAnyTypeChecker() {
	    return createChainableTypeChecker(emptyFunction.thatReturns(null));
	  }

	  function createArrayOfTypeChecker(typeChecker) {
	    function validate(props, propName, componentName, location, propFullName) {
	      var propValue = props[propName];
	      if (!Array.isArray(propValue)) {
	        var locationName = ReactPropTypeLocationNames[location];
	        var propType = getPropType(propValue);
	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` of type ' + ('`' + propType + '` supplied to `' + componentName + '`, expected an array.'));
	      }
	      for (var i = 0; i < propValue.length; i++) {
	        var error = typeChecker(propValue, i, componentName, location, propFullName + '[' + i + ']');
	        if (error instanceof Error) {
	          return error;
	        }
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createElementTypeChecker() {
	    function validate(props, propName, componentName, location, propFullName) {
	      if (!ReactElement.isValidElement(props[propName])) {
	        var locationName = ReactPropTypeLocationNames[location];
	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` supplied to ' + ('`' + componentName + '`, expected a single ReactElement.'));
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createInstanceTypeChecker(expectedClass) {
	    function validate(props, propName, componentName, location, propFullName) {
	      if (!(props[propName] instanceof expectedClass)) {
	        var locationName = ReactPropTypeLocationNames[location];
	        var expectedClassName = expectedClass.name || ANONYMOUS;
	        var actualClassName = getClassName(props[propName]);
	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` of type ' + ('`' + actualClassName + '` supplied to `' + componentName + '`, expected ') + ('instance of `' + expectedClassName + '`.'));
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createEnumTypeChecker(expectedValues) {
	    if (!Array.isArray(expectedValues)) {
	      return createChainableTypeChecker(function () {
	        return new Error('Invalid argument supplied to oneOf, expected an instance of array.');
	      });
	    }

	    function validate(props, propName, componentName, location, propFullName) {
	      var propValue = props[propName];
	      for (var i = 0; i < expectedValues.length; i++) {
	        if (propValue === expectedValues[i]) {
	          return null;
	        }
	      }

	      var locationName = ReactPropTypeLocationNames[location];
	      var valuesString = JSON.stringify(expectedValues);
	      return new Error('Invalid ' + locationName + ' `' + propFullName + '` of value `' + propValue + '` ' + ('supplied to `' + componentName + '`, expected one of ' + valuesString + '.'));
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createObjectOfTypeChecker(typeChecker) {
	    function validate(props, propName, componentName, location, propFullName) {
	      var propValue = props[propName];
	      var propType = getPropType(propValue);
	      if (propType !== 'object') {
	        var locationName = ReactPropTypeLocationNames[location];
	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` of type ' + ('`' + propType + '` supplied to `' + componentName + '`, expected an object.'));
	      }
	      for (var key in propValue) {
	        if (propValue.hasOwnProperty(key)) {
	          var error = typeChecker(propValue, key, componentName, location, propFullName + '.' + key);
	          if (error instanceof Error) {
	            return error;
	          }
	        }
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createUnionTypeChecker(arrayOfTypeCheckers) {
	    if (!Array.isArray(arrayOfTypeCheckers)) {
	      return createChainableTypeChecker(function () {
	        return new Error('Invalid argument supplied to oneOfType, expected an instance of array.');
	      });
	    }

	    function validate(props, propName, componentName, location, propFullName) {
	      for (var i = 0; i < arrayOfTypeCheckers.length; i++) {
	        var checker = arrayOfTypeCheckers[i];
	        if (checker(props, propName, componentName, location, propFullName) == null) {
	          return null;
	        }
	      }

	      var locationName = ReactPropTypeLocationNames[location];
	      return new Error('Invalid ' + locationName + ' `' + propFullName + '` supplied to ' + ('`' + componentName + '`.'));
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createNodeChecker() {
	    function validate(props, propName, componentName, location, propFullName) {
	      if (!isNode(props[propName])) {
	        var locationName = ReactPropTypeLocationNames[location];
	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` supplied to ' + ('`' + componentName + '`, expected a ReactNode.'));
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function createShapeTypeChecker(shapeTypes) {
	    function validate(props, propName, componentName, location, propFullName) {
	      var propValue = props[propName];
	      var propType = getPropType(propValue);
	      if (propType !== 'object') {
	        var locationName = ReactPropTypeLocationNames[location];
	        return new Error('Invalid ' + locationName + ' `' + propFullName + '` of type `' + propType + '` ' + ('supplied to `' + componentName + '`, expected `object`.'));
	      }
	      for (var key in shapeTypes) {
	        var checker = shapeTypes[key];
	        if (!checker) {
	          continue;
	        }
	        var error = checker(propValue, key, componentName, location, propFullName + '.' + key);
	        if (error) {
	          return error;
	        }
	      }
	      return null;
	    }
	    return createChainableTypeChecker(validate);
	  }

	  function isNode(propValue) {
	    switch (typeof propValue) {
	      case 'number':
	      case 'string':
	      case 'undefined':
	        return true;
	      case 'boolean':
	        return !propValue;
	      case 'object':
	        if (Array.isArray(propValue)) {
	          return propValue.every(isNode);
	        }
	        if (propValue === null || ReactElement.isValidElement(propValue)) {
	          return true;
	        }

	        var iteratorFn = getIteratorFn(propValue);
	        if (iteratorFn) {
	          var iterator = iteratorFn.call(propValue);
	          var step;
	          if (iteratorFn !== propValue.entries) {
	            while (!(step = iterator.next()).done) {
	              if (!isNode(step.value)) {
	                return false;
	              }
	            }
	          } else {
	            while (!(step = iterator.next()).done) {
	              var entry = step.value;
	              if (entry) {
	                if (!isNode(entry[1])) {
	                  return false;
	                }
	              }
	            }
	          }
	        } else {
	          return false;
	        }

	        return true;
	      default:
	        return false;
	    }
	  }

	  function isSymbol(propType, propValue) {
	    if (propType === 'symbol') {
	      return true;
	    }

	    if (propValue['@@toStringTag'] === 'Symbol') {
	      return true;
	    }

	    if (typeof Symbol === 'function' && propValue instanceof Symbol) {
	      return true;
	    }

	    return false;
	  }

	  function getPropType(propValue) {
	    var propType = typeof propValue;
	    if (Array.isArray(propValue)) {
	      return 'array';
	    }
	    if (propValue instanceof RegExp) {
	      return 'object';
	    }
	    if (isSymbol(propType, propValue)) {
	      return 'symbol';
	    }
	    return propType;
	  }

	  function getPreciseType(propValue) {
	    var propType = getPropType(propValue);
	    if (propType === 'object') {
	      if (propValue instanceof Date) {
	        return 'date';
	      } else if (propValue instanceof RegExp) {
	        return 'regexp';
	      }
	    }
	    return propType;
	  }

	  function getClassName(propValue) {
	    if (!propValue.constructor || !propValue.constructor.name) {
	      return ANONYMOUS;
	    }
	    return propValue.constructor.name;
	  }

	  module.exports = ReactPropTypes;
	});

	//# sourceMappingURL=index.js.map

/***/ },
/* 4 */
/***/ function(module, exports, __webpack_require__) {

	!function(global, factory) {
	     true ? factory(exports) : 'function' == typeof define && define.amd ? define([ 'exports' ], factory) : factory(global.preact = global.preact || {});
	}(this, function(exports) {
	    function VNode(nodeName, attributes, children) {
	        this.nodeName = nodeName;
	        this.attributes = attributes;
	        this.children = children;
	        this.key = attributes && attributes.key;
	    }
	    function h(nodeName, attributes) {
	        var children, lastSimple, child, simple, i;
	        for (i = arguments.length; i-- > 2; ) stack.push(arguments[i]);
	        if (attributes && attributes.children) {
	            if (!stack.length) stack.push(attributes.children);
	            delete attributes.children;
	        }
	        while (stack.length) if ((child = stack.pop()) instanceof Array) for (i = child.length; i--; ) stack.push(child[i]); else if (null != child && child !== !0 && child !== !1) {
	            if ('number' == typeof child) child = String(child);
	            simple = 'string' == typeof child;
	            if (simple && lastSimple) children[children.length - 1] += child; else {
	                (children || (children = [])).push(child);
	                lastSimple = simple;
	            }
	        }
	        var p = new VNode(nodeName, attributes || void 0, children || EMPTY_CHILDREN);
	        if (options.vnode) options.vnode(p);
	        return p;
	    }
	    function extend(obj, props) {
	        if (props) for (var i in props) obj[i] = props[i];
	        return obj;
	    }
	    function clone(obj) {
	        return extend({}, obj);
	    }
	    function delve(obj, key) {
	        for (var p = key.split('.'), i = 0; i < p.length && obj; i++) obj = obj[p[i]];
	        return obj;
	    }
	    function isFunction(obj) {
	        return 'function' == typeof obj;
	    }
	    function isString(obj) {
	        return 'string' == typeof obj;
	    }
	    function hashToClassName(c) {
	        var str = '';
	        for (var prop in c) if (c[prop]) {
	            if (str) str += ' ';
	            str += prop;
	        }
	        return str;
	    }
	    function cloneElement(vnode, props) {
	        return h(vnode.nodeName, extend(clone(vnode.attributes), props), arguments.length > 2 ? [].slice.call(arguments, 2) : vnode.children);
	    }
	    function createLinkedState(component, key, eventPath) {
	        var path = key.split('.');
	        return function(e) {
	            var t = e && e.target || this, state = {}, obj = state, v = isString(eventPath) ? delve(e, eventPath) : t.nodeName ? t.type.match(/^che|rad/) ? t.checked : t.value : e, i = 0;
	            for (;i < path.length - 1; i++) obj = obj[path[i]] || (obj[path[i]] = !i && component.state[path[i]] || {});
	            obj[path[i]] = v;
	            component.setState(state);
	        };
	    }
	    function enqueueRender(component) {
	        if (!component._dirty && (component._dirty = !0) && 1 == items.push(component)) (options.debounceRendering || defer)(rerender);
	    }
	    function rerender() {
	        var p, list = items;
	        items = [];
	        while (p = list.pop()) if (p._dirty) renderComponent(p);
	    }
	    function isFunctionalComponent(vnode) {
	        var nodeName = vnode && vnode.nodeName;
	        return nodeName && isFunction(nodeName) && !(nodeName.prototype && nodeName.prototype.render);
	    }
	    function buildFunctionalComponent(vnode, context) {
	        return vnode.nodeName(getNodeProps(vnode), context || EMPTY);
	    }
	    function isSameNodeType(node, vnode) {
	        if (isString(vnode)) return node instanceof Text;
	        if (isString(vnode.nodeName)) return !node._componentConstructor && isNamedNode(node, vnode.nodeName);
	        if (isFunction(vnode.nodeName)) return (node._componentConstructor ? node._componentConstructor === vnode.nodeName : !0) || isFunctionalComponent(vnode); else ;
	    }
	    function isNamedNode(node, nodeName) {
	        return node.normalizedNodeName === nodeName || toLowerCase(node.nodeName) === toLowerCase(nodeName);
	    }
	    function getNodeProps(vnode) {
	        var props = clone(vnode.attributes);
	        props.children = vnode.children;
	        var defaultProps = vnode.nodeName.defaultProps;
	        if (defaultProps) for (var i in defaultProps) if (void 0 === props[i]) props[i] = defaultProps[i];
	        return props;
	    }
	    function removeNode(node) {
	        var p = node.parentNode;
	        if (p) p.removeChild(node);
	    }
	    function setAccessor(node, name, old, value, isSvg) {
	        if ('className' === name) name = 'class';
	        if ('class' === name && value && 'object' == typeof value) value = hashToClassName(value);
	        if ('key' === name) ; else if ('class' === name && !isSvg) node.className = value || ''; else if ('style' === name) {
	            if (!value || isString(value) || isString(old)) node.style.cssText = value || '';
	            if (value && 'object' == typeof value) {
	                if (!isString(old)) for (var i in old) if (!(i in value)) node.style[i] = '';
	                for (var i in value) node.style[i] = 'number' == typeof value[i] && !NON_DIMENSION_PROPS[i] ? value[i] + 'px' : value[i];
	            }
	        } else if ('dangerouslySetInnerHTML' === name) {
	            if (value) node.innerHTML = value.__html || '';
	        } else if ('o' == name[0] && 'n' == name[1]) {
	            var l = node._listeners || (node._listeners = {});
	            name = toLowerCase(name.substring(2));
	            if (value) {
	                if (!l[name]) node.addEventListener(name, eventProxy, !!NON_BUBBLING_EVENTS[name]);
	            } else if (l[name]) node.removeEventListener(name, eventProxy, !!NON_BUBBLING_EVENTS[name]);
	            l[name] = value;
	        } else if ('list' !== name && 'type' !== name && !isSvg && name in node) {
	            setProperty(node, name, null == value ? '' : value);
	            if (null == value || value === !1) node.removeAttribute(name);
	        } else {
	            var ns = isSvg && name.match(/^xlink\:?(.+)/);
	            if (null == value || value === !1) if (ns) node.removeAttributeNS('http://www.w3.org/1999/xlink', toLowerCase(ns[1])); else node.removeAttribute(name); else if ('object' != typeof value && !isFunction(value)) if (ns) node.setAttributeNS('http://www.w3.org/1999/xlink', toLowerCase(ns[1]), value); else node.setAttribute(name, value);
	        }
	    }
	    function setProperty(node, name, value) {
	        try {
	            node[name] = value;
	        } catch (e) {}
	    }
	    function eventProxy(e) {
	        return this._listeners[e.type](options.event && options.event(e) || e);
	    }
	    function collectNode(node) {
	        removeNode(node);
	        if (node instanceof Element) {
	            node._component = node._componentConstructor = null;
	            var _name = node.normalizedNodeName || toLowerCase(node.nodeName);
	            (nodes[_name] || (nodes[_name] = [])).push(node);
	        }
	    }
	    function createNode(nodeName, isSvg) {
	        var name = toLowerCase(nodeName), node = nodes[name] && nodes[name].pop() || (isSvg ? document.createElementNS('http://www.w3.org/2000/svg', nodeName) : document.createElement(nodeName));
	        node.normalizedNodeName = name;
	        return node;
	    }
	    function flushMounts() {
	        var c;
	        while (c = mounts.pop()) {
	            if (options.afterMount) options.afterMount(c);
	            if (c.componentDidMount) c.componentDidMount();
	        }
	    }
	    function diff(dom, vnode, context, mountAll, parent, componentRoot) {
	        if (!diffLevel++) {
	            isSvgMode = parent && 'undefined' != typeof parent.ownerSVGElement;
	            hydrating = dom && !(ATTR_KEY in dom);
	        }
	        var ret = idiff(dom, vnode, context, mountAll);
	        if (parent && ret.parentNode !== parent) parent.appendChild(ret);
	        if (!--diffLevel) {
	            hydrating = !1;
	            if (!componentRoot) flushMounts();
	        }
	        return ret;
	    }
	    function idiff(dom, vnode, context, mountAll) {
	        var ref = vnode && vnode.attributes && vnode.attributes.ref;
	        while (isFunctionalComponent(vnode)) vnode = buildFunctionalComponent(vnode, context);
	        if (null == vnode) vnode = '';
	        if (isString(vnode)) {
	            if (dom && dom instanceof Text && dom.parentNode) {
	                if (dom.nodeValue != vnode) dom.nodeValue = vnode;
	            } else {
	                if (dom) recollectNodeTree(dom);
	                dom = document.createTextNode(vnode);
	            }
	            return dom;
	        }
	        if (isFunction(vnode.nodeName)) return buildComponentFromVNode(dom, vnode, context, mountAll);
	        var out = dom, nodeName = String(vnode.nodeName), prevSvgMode = isSvgMode, vchildren = vnode.children;
	        isSvgMode = 'svg' === nodeName ? !0 : 'foreignObject' === nodeName ? !1 : isSvgMode;
	        if (!dom) out = createNode(nodeName, isSvgMode); else if (!isNamedNode(dom, nodeName)) {
	            out = createNode(nodeName, isSvgMode);
	            while (dom.firstChild) out.appendChild(dom.firstChild);
	            if (dom.parentNode) dom.parentNode.replaceChild(out, dom);
	            recollectNodeTree(dom);
	        }
	        var fc = out.firstChild, props = out[ATTR_KEY];
	        if (!props) {
	            out[ATTR_KEY] = props = {};
	            for (var a = out.attributes, i = a.length; i--; ) props[a[i].name] = a[i].value;
	        }
	        if (!hydrating && vchildren && 1 === vchildren.length && 'string' == typeof vchildren[0] && fc && fc instanceof Text && !fc.nextSibling) {
	            if (fc.nodeValue != vchildren[0]) fc.nodeValue = vchildren[0];
	        } else if (vchildren && vchildren.length || fc) innerDiffNode(out, vchildren, context, mountAll, !!props.dangerouslySetInnerHTML);
	        diffAttributes(out, vnode.attributes, props);
	        if (ref) (props.ref = ref)(out);
	        isSvgMode = prevSvgMode;
	        return out;
	    }
	    function innerDiffNode(dom, vchildren, context, mountAll, absorb) {
	        var j, c, vchild, child, originalChildren = dom.childNodes, children = [], keyed = {}, keyedLen = 0, min = 0, len = originalChildren.length, childrenLen = 0, vlen = vchildren && vchildren.length;
	        if (len) for (var i = 0; i < len; i++) {
	            var _child = originalChildren[i], props = _child[ATTR_KEY], key = vlen ? (c = _child._component) ? c.__key : props ? props.key : null : null;
	            if (null != key) {
	                keyedLen++;
	                keyed[key] = _child;
	            } else if (hydrating || absorb || props || _child instanceof Text) children[childrenLen++] = _child;
	        }
	        if (vlen) for (var i = 0; i < vlen; i++) {
	            vchild = vchildren[i];
	            child = null;
	            var key = vchild.key;
	            if (null != key) {
	                if (keyedLen && key in keyed) {
	                    child = keyed[key];
	                    keyed[key] = void 0;
	                    keyedLen--;
	                }
	            } else if (!child && min < childrenLen) for (j = min; j < childrenLen; j++) {
	                c = children[j];
	                if (c && isSameNodeType(c, vchild)) {
	                    child = c;
	                    children[j] = void 0;
	                    if (j === childrenLen - 1) childrenLen--;
	                    if (j === min) min++;
	                    break;
	                }
	            }
	            child = idiff(child, vchild, context, mountAll);
	            if (child && child !== dom) if (i >= len) dom.appendChild(child); else if (child !== originalChildren[i]) {
	                if (child === originalChildren[i + 1]) removeNode(originalChildren[i]);
	                dom.insertBefore(child, originalChildren[i] || null);
	            }
	        }
	        if (keyedLen) for (var i in keyed) if (keyed[i]) recollectNodeTree(keyed[i]);
	        while (min <= childrenLen) {
	            child = children[childrenLen--];
	            if (child) recollectNodeTree(child);
	        }
	    }
	    function recollectNodeTree(node, unmountOnly) {
	        var component = node._component;
	        if (component) unmountComponent(component, !unmountOnly); else {
	            if (node[ATTR_KEY] && node[ATTR_KEY].ref) node[ATTR_KEY].ref(null);
	            if (!unmountOnly) collectNode(node);
	            var c;
	            while (c = node.lastChild) recollectNodeTree(c, unmountOnly);
	        }
	    }
	    function diffAttributes(dom, attrs, old) {
	        var name;
	        for (name in old) if (!(attrs && name in attrs) && null != old[name]) setAccessor(dom, name, old[name], old[name] = void 0, isSvgMode);
	        if (attrs) for (name in attrs) if (!('children' === name || 'innerHTML' === name || name in old && attrs[name] === ('value' === name || 'checked' === name ? dom[name] : old[name]))) setAccessor(dom, name, old[name], old[name] = attrs[name], isSvgMode);
	    }
	    function collectComponent(component) {
	        var name = component.constructor.name, list = components[name];
	        if (list) list.push(component); else components[name] = [ component ];
	    }
	    function createComponent(Ctor, props, context) {
	        var inst = new Ctor(props, context), list = components[Ctor.name];
	        Component.call(inst, props, context);
	        if (list) for (var i = list.length; i--; ) if (list[i].constructor === Ctor) {
	            inst.nextBase = list[i].nextBase;
	            list.splice(i, 1);
	            break;
	        }
	        return inst;
	    }
	    function setComponentProps(component, props, opts, context, mountAll) {
	        if (!component._disable) {
	            component._disable = !0;
	            if (component.__ref = props.ref) delete props.ref;
	            if (component.__key = props.key) delete props.key;
	            if (!component.base || mountAll) {
	                if (component.componentWillMount) component.componentWillMount();
	            } else if (component.componentWillReceiveProps) component.componentWillReceiveProps(props, context);
	            if (context && context !== component.context) {
	                if (!component.prevContext) component.prevContext = component.context;
	                component.context = context;
	            }
	            if (!component.prevProps) component.prevProps = component.props;
	            component.props = props;
	            component._disable = !1;
	            if (0 !== opts) if (1 === opts || options.syncComponentUpdates !== !1 || !component.base) renderComponent(component, 1, mountAll); else enqueueRender(component);
	            if (component.__ref) component.__ref(component);
	        }
	    }
	    function renderComponent(component, opts, mountAll, isChild) {
	        if (!component._disable) {
	            var skip, rendered, inst, cbase, props = component.props, state = component.state, context = component.context, previousProps = component.prevProps || props, previousState = component.prevState || state, previousContext = component.prevContext || context, isUpdate = component.base, nextBase = component.nextBase, initialBase = isUpdate || nextBase, initialChildComponent = component._component;
	            if (isUpdate) {
	                component.props = previousProps;
	                component.state = previousState;
	                component.context = previousContext;
	                if (2 !== opts && component.shouldComponentUpdate && component.shouldComponentUpdate(props, state, context) === !1) skip = !0; else if (component.componentWillUpdate) component.componentWillUpdate(props, state, context);
	                component.props = props;
	                component.state = state;
	                component.context = context;
	            }
	            component.prevProps = component.prevState = component.prevContext = component.nextBase = null;
	            component._dirty = !1;
	            if (!skip) {
	                if (component.render) rendered = component.render(props, state, context);
	                if (component.getChildContext) context = extend(clone(context), component.getChildContext());
	                while (isFunctionalComponent(rendered)) rendered = buildFunctionalComponent(rendered, context);
	                var toUnmount, base, childComponent = rendered && rendered.nodeName;
	                if (isFunction(childComponent)) {
	                    var childProps = getNodeProps(rendered);
	                    inst = initialChildComponent;
	                    if (inst && inst.constructor === childComponent && childProps.key == inst.__key) setComponentProps(inst, childProps, 1, context); else {
	                        toUnmount = inst;
	                        inst = createComponent(childComponent, childProps, context);
	                        inst.nextBase = inst.nextBase || nextBase;
	                        inst._parentComponent = component;
	                        component._component = inst;
	                        setComponentProps(inst, childProps, 0, context);
	                        renderComponent(inst, 1, mountAll, !0);
	                    }
	                    base = inst.base;
	                } else {
	                    cbase = initialBase;
	                    toUnmount = initialChildComponent;
	                    if (toUnmount) cbase = component._component = null;
	                    if (initialBase || 1 === opts) {
	                        if (cbase) cbase._component = null;
	                        base = diff(cbase, rendered, context, mountAll || !isUpdate, initialBase && initialBase.parentNode, !0);
	                    }
	                }
	                if (initialBase && base !== initialBase && inst !== initialChildComponent) {
	                    var baseParent = initialBase.parentNode;
	                    if (baseParent && base !== baseParent) {
	                        baseParent.replaceChild(base, initialBase);
	                        if (!toUnmount) {
	                            initialBase._component = null;
	                            recollectNodeTree(initialBase);
	                        }
	                    }
	                }
	                if (toUnmount) unmountComponent(toUnmount, base !== initialBase);
	                component.base = base;
	                if (base && !isChild) {
	                    var componentRef = component, t = component;
	                    while (t = t._parentComponent) (componentRef = t).base = base;
	                    base._component = componentRef;
	                    base._componentConstructor = componentRef.constructor;
	                }
	            }
	            if (!isUpdate || mountAll) mounts.unshift(component); else if (!skip) {
	                if (component.componentDidUpdate) component.componentDidUpdate(previousProps, previousState, previousContext);
	                if (options.afterUpdate) options.afterUpdate(component);
	            }
	            var fn, cb = component._renderCallbacks;
	            if (cb) while (fn = cb.pop()) fn.call(component);
	            if (!diffLevel && !isChild) flushMounts();
	        }
	    }
	    function buildComponentFromVNode(dom, vnode, context, mountAll) {
	        var c = dom && dom._component, originalComponent = c, oldDom = dom, isDirectOwner = c && dom._componentConstructor === vnode.nodeName, isOwner = isDirectOwner, props = getNodeProps(vnode);
	        while (c && !isOwner && (c = c._parentComponent)) isOwner = c.constructor === vnode.nodeName;
	        if (c && isOwner && (!mountAll || c._component)) {
	            setComponentProps(c, props, 3, context, mountAll);
	            dom = c.base;
	        } else {
	            if (originalComponent && !isDirectOwner) {
	                unmountComponent(originalComponent, !0);
	                dom = oldDom = null;
	            }
	            c = createComponent(vnode.nodeName, props, context);
	            if (dom && !c.nextBase) {
	                c.nextBase = dom;
	                oldDom = null;
	            }
	            setComponentProps(c, props, 1, context, mountAll);
	            dom = c.base;
	            if (oldDom && dom !== oldDom) {
	                oldDom._component = null;
	                recollectNodeTree(oldDom);
	            }
	        }
	        return dom;
	    }
	    function unmountComponent(component, remove) {
	        if (options.beforeUnmount) options.beforeUnmount(component);
	        var base = component.base;
	        component._disable = !0;
	        if (component.componentWillUnmount) component.componentWillUnmount();
	        component.base = null;
	        var inner = component._component;
	        if (inner) unmountComponent(inner, remove); else if (base) {
	            if (base[ATTR_KEY] && base[ATTR_KEY].ref) base[ATTR_KEY].ref(null);
	            component.nextBase = base;
	            if (remove) {
	                removeNode(base);
	                collectComponent(component);
	            }
	            var c;
	            while (c = base.lastChild) recollectNodeTree(c, !remove);
	        }
	        if (component.__ref) component.__ref(null);
	        if (component.componentDidUnmount) component.componentDidUnmount();
	    }
	    function Component(props, context) {
	        this._dirty = !0;
	        this.context = context;
	        this.props = props;
	        if (!this.state) this.state = {};
	    }
	    function render(vnode, parent, merge) {
	        return diff(merge, vnode, {}, !1, parent);
	    }
	    var options = {};
	    var stack = [];
	    var EMPTY_CHILDREN = [];
	    var lcCache = {};
	    var toLowerCase = function(s) {
	        return lcCache[s] || (lcCache[s] = s.toLowerCase());
	    };
	    var resolved = 'undefined' != typeof Promise && Promise.resolve();
	    var defer = resolved ? function(f) {
	        resolved.then(f);
	    } : setTimeout;
	    var EMPTY = {};
	    var ATTR_KEY = 'undefined' != typeof Symbol ? Symbol.for('preactattr') : '__preactattr_';
	    var NON_DIMENSION_PROPS = {
	        boxFlex: 1,
	        boxFlexGroup: 1,
	        columnCount: 1,
	        fillOpacity: 1,
	        flex: 1,
	        flexGrow: 1,
	        flexPositive: 1,
	        flexShrink: 1,
	        flexNegative: 1,
	        fontWeight: 1,
	        lineClamp: 1,
	        lineHeight: 1,
	        opacity: 1,
	        order: 1,
	        orphans: 1,
	        strokeOpacity: 1,
	        widows: 1,
	        zIndex: 1,
	        zoom: 1
	    };
	    var NON_BUBBLING_EVENTS = {
	        blur: 1,
	        error: 1,
	        focus: 1,
	        load: 1,
	        resize: 1,
	        scroll: 1
	    };
	    var items = [];
	    var nodes = {};
	    var mounts = [];
	    var diffLevel = 0;
	    var isSvgMode = !1;
	    var hydrating = !1;
	    var components = {};
	    extend(Component.prototype, {
	        linkState: function(key, eventPath) {
	            var c = this._linkedStates || (this._linkedStates = {});
	            return c[key + eventPath] || (c[key + eventPath] = createLinkedState(this, key, eventPath));
	        },
	        setState: function(state, callback) {
	            var s = this.state;
	            if (!this.prevState) this.prevState = clone(s);
	            extend(s, isFunction(state) ? state(s, this.props) : state);
	            if (callback) (this._renderCallbacks = this._renderCallbacks || []).push(callback);
	            enqueueRender(this);
	        },
	        forceUpdate: function() {
	            renderComponent(this, 2);
	        },
	        render: function() {}
	    });
	    exports.h = h;
	    exports.cloneElement = cloneElement;
	    exports.Component = Component;
	    exports.render = render;
	    exports.rerender = rerender;
	    exports.options = options;
	});
	//# sourceMappingURL=preact.js.map

/***/ },
/* 5 */
/***/ function(module, exports, __webpack_require__) {

	/* eslint-disable */
	var renderToString = dep(__webpack_require__(6));

	function dep(obj) { return obj['default'] || obj; }

	module.exports = {
		renderToString: renderToString,
		renderToStaticMarkup: renderToString
	};


/***/ },
/* 6 */
/***/ function(module, exports, __webpack_require__) {

	(function (global, factory) {
		 true ? module.exports = factory() :
		typeof define === 'function' && define.amd ? define(factory) :
		(global.preactRenderToString = factory());
	}(this, (function () {

	var NON_DIMENSION_PROPS = {
		boxFlex: 1, boxFlexGroup: 1, columnCount: 1, fillOpacity: 1, flex: 1, flexGrow: 1,
		flexPositive: 1, flexShrink: 1, flexNegative: 1, fontWeight: 1, lineClamp: 1, lineHeight: 1,
		opacity: 1, order: 1, orphans: 1, strokeOpacity: 1, widows: 1, zIndex: 1, zoom: 1
	};

	var ESC = {
		'<': '&lt;',
		'>': '&gt;',
		'"': '&quot;',
		'&': '&amp;'
	};

	var objectKeys = Object.keys || function (obj) {
		var keys = [];
		for (var i in obj) {
			if (obj.hasOwnProperty(i)) keys.push(i);
		}return keys;
	};

	var encodeEntities = function (s) {
		return String(s).replace(/[<>"&]/g, escapeChar);
	};

	var escapeChar = function (a) {
		return ESC[a] || a;
	};

	var falsey = function (v) {
		return v == null || v === false;
	};

	var memoize = function (fn) {
		var mem = arguments.length <= 1 || arguments[1] === undefined ? {} : arguments[1];
		return function (v) {
			return mem[v] || (mem[v] = fn(v));
		};
	};

	var indent = function (s, char) {
		return String(s).replace(/(\n+)/g, '$1' + (char || '\t'));
	};

	var isLargeString = function (s, length, ignoreLines) {
		return String(s).length > (length || 40) || !ignoreLines && String(s).indexOf('\n') !== -1 || String(s).indexOf('<') !== -1;
	};

	function styleObjToCss(s) {
		var str = '';
		for (var prop in s) {
			var val = s[prop];
			if (val != null) {
				if (str) str += ' ';
				str += jsToCss(prop);
				str += ': ';
				str += val;
				if (typeof val === 'number' && !NON_DIMENSION_PROPS[prop]) {
					str += 'px';
				}
				str += ';';
			}
		}
		return str;
	}

	function hashToClassName(c) {
		var str = '';
		for (var prop in c) {
			if (c[prop]) {
				if (str) str += ' ';
				str += prop;
			}
		}
		return str;
	}

	var jsToCss = memoize(function (s) {
		return s.replace(/([A-Z])/g, '-$1').toLowerCase();
	});

	function assign(obj, props) {
		for (var i in props) {
			obj[i] = props[i];
		}return obj;
	}

	function getNodeProps(vnode) {
		var defaultProps = vnode.nodeName.defaultProps,
		    props = assign({}, defaultProps || vnode.attributes);
		if (defaultProps) assign(props, vnode.attributes);
		if (vnode.children) props.children = vnode.children;
		return props;
	}

	var SHALLOW = { shallow: true };

	var UNNAMED = [];

	var EMPTY = {};

	var VOID_ELEMENTS = ['area', 'base', 'br', 'col', 'embed', 'hr', 'img', 'input', 'link', 'meta', 'param', 'source', 'track', 'wbr'];

	renderToString.render = renderToString;

	var shallowRender = function (vnode, context) {
		return renderToString(vnode, context, SHALLOW);
	};

	function renderToString(vnode, context, opts, inner, isSvgMode) {
		var _ref = vnode || EMPTY;

		var nodeName = _ref.nodeName;
		var attributes = _ref.attributes;
		var children = _ref.children;
		var isComponent = false;
		context = context || {};
		opts = opts || {};

		var pretty = opts.pretty,
		    indentChar = typeof pretty === 'string' ? pretty : '\t';

		if (vnode == null || vnode === false) {
			return '';
		}

		if (!nodeName) {
			return encodeEntities(vnode);
		}

		if (typeof nodeName === 'function') {
			isComponent = true;
			if (opts.shallow && (inner || opts.renderRootComponent === false)) {
				nodeName = getComponentName(nodeName);
			} else {
				var props = getNodeProps(vnode),
				    rendered = void 0;

				if (!nodeName.prototype || typeof nodeName.prototype.render !== 'function') {
					rendered = nodeName(props, context);
				} else {
					var c = new nodeName(props, context);
					c.props = props;
					c.context = context;
					if (c.componentWillMount) c.componentWillMount();
					rendered = c.render(c.props, c.state, c.context);

					if (c.getChildContext) {
						context = assign(assign({}, context), c.getChildContext());
					}
				}

				return renderToString(rendered, context, opts, opts.shallowHighOrder !== false);
			}
		}

		var s = '',
		    html = void 0;

		if (attributes) {
			var attrs = objectKeys(attributes);

			if (opts && opts.sortAttributes === true) attrs.sort();

			for (var i = 0; i < attrs.length; i++) {
				var name = attrs[i],
				    v = attributes[name];
				if (name === 'children') continue;
				if (!(opts && opts.allAttributes) && (name === 'key' || name === 'ref')) continue;

				if (name === 'className') {
					if (attributes['class']) continue;
					name = 'class';
				} else if (isSvgMode && name.match(/^xlink\:?(.+)/)) {
					name = name.toLowerCase().replace(/^xlink\:?(.+)/, 'xlink:$1');
				}

				if (name === 'class' && v && typeof v === 'object') {
					v = hashToClassName(v);
				} else if (name === 'style' && v && typeof v === 'object') {
					v = styleObjToCss(v);
				}

				var hooked = opts.attributeHook && opts.attributeHook(name, v, context, opts, isComponent);
				if (hooked || hooked === '') {
					s += hooked;
					continue;
				}

				if (name === 'dangerouslySetInnerHTML') {
					html = v && v.__html;
				} else if ((v || v === 0 || v === '') && typeof v !== 'function') {
					if (v === true || v === '') {
						v = name;

						if (!opts || !opts.xml) {
							s += ' ' + name;
							continue;
						}
					}
					s += ' ' + name + '="' + encodeEntities(v) + '"';
				}
			}
		}

		var sub = s.replace(/^\n\s*/, ' ');
		if (sub !== s && !~sub.indexOf('\n')) s = sub;else if (~s.indexOf('\n')) s += '\n';

		s = '<' + nodeName + s + '>';

		if (VOID_ELEMENTS.indexOf(nodeName) > -1) {
			s = s.replace(/>$/, ' />');
		}

		if (html) {
			if (pretty && isLargeString(html)) {
				html = '\n' + indentChar + indent(html, indentChar);
			}
			s += html;
		} else {
			var len = children && children.length,
			    pieces = [],
			    hasLarge = ~s.indexOf('\n');
			for (var _i = 0; _i < len; _i++) {
				var child = children[_i];
				if (!falsey(child)) {
					var childSvgMode = nodeName === 'svg' ? true : nodeName === 'foreignObject' ? false : isSvgMode,
					    ret = renderToString(child, context, opts, true, childSvgMode);
					if (!hasLarge && pretty && isLargeString(ret)) hasLarge = true;
					pieces.push(ret);
				}
			}
			if (hasLarge) {
				for (var _i2 = pieces.length; _i2--;) {
					pieces[_i2] = '\n' + indentChar + indent(pieces[_i2], indentChar);
				}
			}
			if (pieces.length) {
				s += pieces.join('');
			} else if (opts && opts.xml) {
				return s.substring(0, s.length - 1) + ' />';
			}
		}

		if (opts.jsx || VOID_ELEMENTS.indexOf(nodeName) === -1) {
			if (pretty && ~s.indexOf('\n')) s += '\n';
			s += '</' + nodeName + '>';
		}

		return s;
	}

	function getComponentName(component) {
		var proto = component.prototype,
		    ctor = proto && proto.constructor;
		return component.displayName || component.name || proto && (proto.displayName || proto.name) || getFallbackComponentName(component);
	}

	function getFallbackComponentName(component) {
		var str = Function.prototype.toString.call(component),
		    name = (str.match(/^\s*function\s+([^\( ]+)/) || EMPTY)[1];
		if (!name) {
			var index = -1;
			for (var i = UNNAMED.length; i--;) {
				if (UNNAMED[i] === component) {
					index = i;
					break;
				}
			}

			if (index < 0) {
				index = UNNAMED.push(component) - 1;
			}
			name = 'UnnamedComponent' + index;
		}
		return name;
	}
	renderToString.shallowRender = shallowRender;

	return renderToString;

	})));
	//# sourceMappingURL=index.js.map


/***/ }
/******/ ]);