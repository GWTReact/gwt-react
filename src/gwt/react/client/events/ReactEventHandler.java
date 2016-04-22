package gwt.react.client.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ReactEventHandler {
    void onReactEvent(SyntheticEvent event);
}
