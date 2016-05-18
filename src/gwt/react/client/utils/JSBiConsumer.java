package gwt.react.client.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface JSBiConsumer<T, T2> {
    void accept(T arg, T2 arg2);
}