package gwt.react.client.components;

import gwt.interop.utils.shared.functional.JsProcedure;
import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.BaseContext;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType
public abstract class ComponentWithContext<P extends BaseProps, C extends BaseContext, S> extends NativeComponent<P, C, S> {
	@JsConstructor
	protected ComponentWithContext(P props, C context, JsProcedure updater) {
		super(props, context, updater);
	}
	
    /**
     * The render() method is required.
     *
     * <p>When called, it should examine {@link ClassicComponentApi#getProps} and
     * {@link ClassicComponentApi#getState} and return a single child element.This
     * child element can be either a virtual representation of a native DOM component
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
     * If you need to interact with the browser, perform your work in componentDidMount() or
     * the other lifecycle methods instead. Keeping render() pure makes components easier to
     * think about.</p>
     *
     * @return  A single {@link ReactElement}
     */
	@JsMethod
	protected abstract ReactElement<?, ?> render();
    
	/**
	 * <p>In addition to the methods defined in this class, you can also define the following lifecyle
	 * methods as needed</p>
	 *
	 * <p>void componentWillMount()</p>
	 * <p>void componentDidMount()</p>
	 * <p>void componentWillReceiveProps(P nextProps)</p>
	 * <p>boolean shouldComponentUpdate(P nextProps, S nextState)</p>
	 * <p>void componentWillUpdate(P nextProps, S nextState)</p>
	 * <p>void componentDidUpdate(P prevProps, S prevState)</p>
	 * <p>void componentWillUnmount()</p>
	 */
	
	@JsMethod
	protected void componentWillMount() {
	}
	
	@JsMethod
	protected void componentDidMount() {
	}
	
	@JsMethod
	protected void componentWillReceiveProps(P nextProps) {
	}
	
	@JsMethod
	protected boolean shouldComponentUpdate(P nextProps, S nextState) {
		return true;
	}
	
	@JsMethod
	protected void componentWillUpdate(P nextProps, S nextState) {
	}
	
	@JsMethod
	protected void componentDidUpdate(P prevProps, S prevState) {
	}

	@JsMethod
	protected void componentWillUnmount() {
	}
}
