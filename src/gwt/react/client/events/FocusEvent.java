package gwt.react.client.events;

import com.google.gwt.dom.client.EventTarget;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class FocusEvent extends SyntheticEvent {
    public EventTarget relatedTarget;
}
