package gwt.react.client.events;

import jsinterop.annotations.JsType;

/**
 * Created by paul on 2016-03-15.
 */
@JsType(isNative = true)
public class UIEvent extends SyntheticEvent {
    public int detail;
    public AbstractView view;
}

