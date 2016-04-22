package gwt.react.client.events;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class StyleMedia {
    public String type;
    public native boolean matchMedium(String mediaquery);
}
