package gwt.react.client.events;

import com.google.gwt.dom.client.DataTransfer;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ClipboardEvent extends SyntheticEvent {
    public DataTransfer clipboardData;
}
