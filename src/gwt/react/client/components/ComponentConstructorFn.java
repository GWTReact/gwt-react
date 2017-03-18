package gwt.react.client.components;

import jsinterop.annotations.JsFunction;

/*
 * A constructor function for a React Component
 */
@JsFunction
public interface ComponentConstructorFn<P> {
    void create(P props);
}
