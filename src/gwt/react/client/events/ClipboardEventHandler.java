package gwt.react.client.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ClipboardEventHandler {
    void onClipboardEvent(ClipboardEvent event);
}
