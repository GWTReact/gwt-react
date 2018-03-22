package gwt.react.client.events;

import elemental2.dom.EventTarget;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class MouseEvent extends SyntheticEvent {
    public boolean altKey;
    public int button;
    public int buttons;
    public int clientX;
    public int clientY;
    public boolean ctrlKey;
    public boolean metaKey;
    public int pageX;
    public int pageY;
    public EventTarget relatedTarget;
    public int screenX;
    public int screenY;
    public boolean shiftKey;

    public native boolean getModifierState(String key);
}
