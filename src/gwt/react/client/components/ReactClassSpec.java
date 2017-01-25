package gwt.react.client.components;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.api.React;
import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsType;

/**
 * <p>You can Subclass AbstractReactClassSpec and pass an instance of this class to {@link React#createClass}</p>
 *
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
 *
 * @param <P> the type of props this component expects
 * @param <S> the type of state this component maintains
 */
@JsType
abstract public class ReactClassSpec<P extends BaseProps, S extends JsPlainObj> extends ClassicComponentApi<P,S> {
    /**
     * Invoked once before the component is mounted. The return value will be used as the initial value of
     * this.state.
     *
     * @return  The state or null if this component maintains no state
     */
    abstract public S getInitialState();

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
    abstract public ReactElement render();
}
