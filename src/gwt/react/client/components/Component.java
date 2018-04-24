package gwt.react.client.components;
/* The MIT License (MIT)

Copyright (c) 2016 GWT React

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE. */

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.interop.utils.shared.collections.StringMap;
import gwt.interop.utils.shared.functional.JsRunnable;
import gwt.react.client.api.React;
import gwt.react.client.components.lifecycle.ComponentDidMount;
import gwt.react.client.components.lifecycle.ComponentDidUpdate;
import gwt.react.client.components.lifecycle.ComponentWillMount;
import gwt.react.client.components.lifecycle.ComponentWillReceiveProps;
import gwt.react.client.components.lifecycle.ComponentWillUnmount;
import gwt.react.client.components.lifecycle.ComponentWillUpdate;
import gwt.react.client.components.lifecycle.ShouldComponentUpdate;
import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>You can subclass {@link Component} to define a stateful, ES6-style React component</p>
 *
 * <p>To create a {@link ReactElement} based on this component, call {@link React#createElement(Class, BaseProps, ReactElement...)}.
 *
 * <pre>
 * React.createElement(ComponentUtils.getCtorFn("SomeComponentName"), someProps, ReactElement...)
 * </pre>
 *
 * In addition to the methods defined in this class, you can also define the following lifecyle methods as needed:
 *
 * <Pre>
 * void componentWillMount()
 * void componentDidMount()
 * void componentWillReceiveProps(P nextProps)
 * boolean shouldComponentUpdate(P nextProps, S nextState)
 * void componentWillUpdate(P nextProps, S nextState)
 * void componentDidUpdate(P prevProps, S prevState)
 * void componentWillUnmount()
 * </Pre>
 * 
 * <p>To have extra type safety when defining some of the above methods, you can implement one or more of the following interfaces:</p>
 * <p>{@link ComponentWillMount}</p> 
 * <p>{@link ComponentDidMount}</p> 
 * <p>{@link ComponentWillReceiveProps}</p>
 * <p>{@link ShouldComponentUpdate}</p>
 * <p>{@link ComponentWillUpdate}</p>
 * <p>{@link ComponentDidUpdate}</p>
 * <p>{@link ComponentWillUnmount}</p>
 * 
 * @param <P> the type of props this component expects
 * @param <S> the type of state this component maintains
 */
@JsType(isNative = true, namespace = "React", name = "Component")
public abstract class Component<P extends BaseProps, S extends JsPlainObj> {
	@JsProperty
	protected S state;

	@JsProperty
	protected P props;

	@JsProperty
	protected StringMap<Object> refs;

	private Component() {}

	public Component(P props) {
	}

	/**
	 * Performs a shallow merge of nextState into current state. This is the primary method you
	 * use to trigger UI updates from event handlers and server request callbacks.
	 *
	 * @param state  Object Literal (containing zero or more keys to update)
	 */
	protected native void setState(S state);

	/**
	 * Performs a shallow merge of nextState into current state. This is the primary method you
	 * use to trigger UI updates from event handlers and server request callbacks.
	 *
	 * @param state Object Literal (containing zero or more keys to update)
	 * @param callback callback function that will be executed once setState is completed and
	 *                 the component is re-rendered.
	 */
	protected native void setState(S state, JsRunnable callback);


	/**
	 * <p>Performs a shallow merge of nextState into current state. This is the primary method
	 * you use to trigger UI updates from event handlers and server request callbacks.</p>
	 *
	 * <p>It's also possible to pass a function with the signature function(state, props).
	 * This can be useful in some cases when you want to enqueue an atomic update that
	 * consults the previous value of state+props before setting any values</p>
	 *
	 * @param callback callback function that will be executed once setState is completed and
	 *                 the component is re-rendered.
	 */
	protected native void setState(SetStateCallback<S, P> callback);

	/**
	 * <p>By default, when your component's state or props change, your component will re-render.
	 * However, if these change implicitly (eg: data deep within an object changes without
	 * changing the object itself) or if your render() method depends on some other data, you can
	 * tell React that it needs to re-run render() by calling forceUpdate().</p>
	 *
	 * <p>Calling forceUpdate() will cause render() to be called on the component, skipping
	 * shouldComponentUpdate(). This will trigger the normal lifecycle methods for child
	 * components, including the shouldComponentUpdate() method of each child. React will still
	 * only update the DOM if the markup changes.</p>
	 *
	 * <p>Normally you should try to avoid all uses of forceUpdate() and only read from this.props
	 * and this.state in render(). This makes your component "pure" and your application much
	 * simpler and more efficient.</p>
	 *
	 * @param callBack callback function that will be executed once the component has been updated
	 */
	protected native void forceUpdate(JsRunnable callBack);
	protected native void forceUpdate();

    /**
     * The render() method is required.
     *
     * <p>When called, it should examine props and state and return a single child element.
	 * This child element can be either a virtual representation of a native DOM component
     * (such as React.DOM.div()) or another composite component that you've defined
     * yourself.</p>
     *
     * <p>You can also return null to indicate that you don't want anything rendered.
     * Behind the scenes, React renders a &lt;noscript&gt; tag to work with our current diffing
     * algorithm.</p>
     *
     * <p>The render() function should be pure, meaning that it does not modify component
     * state, it returns the same result each time it's invoked, and it does not read from
     * or write to the DOM or otherwise interact with the browser (e.g., by using setTimeout).
     * If you need to interact with the browser, perform your work in {@link ComponentDidMount#componentDidMount()} or
     * the other lifecycle methods instead. Keeping render() pure makes components easier to
     * think about.</p>
     *
     * @return  A single {@link ReactElement}
     */
	@JsMethod
	protected abstract ReactElement render();
}
