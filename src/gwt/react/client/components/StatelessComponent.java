package gwt.react.client.components;

import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

/**
 * <p>Define a stateless component expressed as plain function.This simplified component
 * API is intended for components that are pure functions of their props. These
 * components must not retain internal state, do not have backing instances, and do
 * not have the component lifecycle methods. They are pure functional transforms of
 * their input, with zero boilerplate.</p>
 *
 * <p>In an ideal world, most of your components would be stateless functions because
 * in the future we'll also be able to make performance optimizations specific to these
 * components by avoiding unnecessary checks and memory allocations. This is the
 * recommended pattern, when possible.</p>
 *
 * @param <P> The type of props this component expects
 */
@JsFunction
public interface StatelessComponent<P extends BaseProps> {
    /**
     * The render() method is required.
     *
     * <p>When called, it should examine props return a single child element.
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
     * or write to the DOM or otherwise interact with the browser (e.g., by using setTimeout).</p>
     *
     * @param props     The props for this component
     * @return          A single {@link ReactElement}
     */
    ReactElement render(P props);
}
