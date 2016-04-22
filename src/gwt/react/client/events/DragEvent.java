package gwt.react.client.events;

import com.google.gwt.dom.client.DataTransfer;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class DragEvent extends SyntheticEvent {
    public DataTransfer clipboardData;
}
