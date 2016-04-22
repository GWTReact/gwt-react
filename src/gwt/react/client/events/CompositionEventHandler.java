package gwt.react.client.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CompositionEventHandler {
    void onCompositionEvent(CompositionEvent event);
}
