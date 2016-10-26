package gwt.react.client.events;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class UIEvent extends SyntheticEvent {
    public int detail;
    public AbstractView view;
}

