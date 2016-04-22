package gwt.react.client.components;

import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface ElementFactory<P extends BaseProps> {
    ReactClass createElement(P props);
}
