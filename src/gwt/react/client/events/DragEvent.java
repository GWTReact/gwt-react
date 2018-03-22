package gwt.react.client.events;

import elemental2.dom.DataTransfer;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class DragEvent extends SyntheticEvent {
    public DataTransfer clipboardData;
}
