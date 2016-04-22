package gwt.react.client.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface JSFunc2Args<ARG1, ARG2> {
    void call(ARG1 arg1, ARG2 arg2);
}
