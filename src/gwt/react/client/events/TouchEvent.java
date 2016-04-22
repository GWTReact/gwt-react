package gwt.react.client.events;

import jsinterop.annotations.JsType;

/**
 * Created by paul on 2016-03-15.
 */
@JsType(isNative = true)
public class TouchEvent extends SyntheticEvent {
    public boolean altKey;
    public TouchList changedTouches;
    public boolean ctrlKey;
    public boolean metaKey;
    public boolean shiftKey;
    public TouchList targetTouches;
    public TouchList touches;

    public native boolean getModifierState(String key);
}
