package gwt.react.client.events;

import elemental2.dom.DataTransfer;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ClipboardEvent extends SyntheticEvent {
    public DataTransfer clipboardData;
}
