package gwt.react.client.components;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface SetStateCallback<S extends JsPlainObj, P extends BaseProps> {
    S onSetState(S previousState, P currentProps);
}
