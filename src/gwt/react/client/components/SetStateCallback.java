package gwt.react.client.components;

import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface SetStateCallback<S, P extends BaseProps> {
    void onSetState(S previousState, P currentProps);
}
