package gwt.react.client.events;

import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class SyntheticEvent {
    public boolean bubbles;
    public boolean cancelable;
    public Element currentTarget;
    public boolean defaultPrevented;
    public int eventPhase;
    public boolean isTrusted;
    public Event nativeEvent;
    public Element target;
    public JsDate timeStamp;
    public String type;

    public native void preventDefault();
    public native void stopPropagation();
}
