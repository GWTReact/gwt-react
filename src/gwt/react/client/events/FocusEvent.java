package gwt.react.client.events;

import elemental2.dom.EventTarget;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class FocusEvent extends SyntheticEvent {
    public EventTarget relatedTarget;
}
