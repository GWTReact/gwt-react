package gwt.react.client.events;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class KeyboardEvent extends SyntheticEvent {
    public boolean altKey;
    public int charCode;
    public boolean ctrlKey;
    public String key;
    public int keyCode;
    public String locale;
    public int location;
    public boolean metaKey;
    public boolean repeat;
    public boolean shiftKey;
    public int which;

    public native boolean getModifierState(String key);
}
