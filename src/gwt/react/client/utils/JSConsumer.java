package gwt.react.client.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface JSConsumer<T> {
    void accept(T arg);
}