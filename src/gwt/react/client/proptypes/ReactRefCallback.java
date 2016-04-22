package gwt.react.client.proptypes;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ReactRefCallback {
    void passRef(Object refElement);
}
