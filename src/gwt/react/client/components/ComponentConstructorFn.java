package gwt.react.client.components;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

/**
 * A constructor function for a React Component
 */
@JsFunction
public interface ComponentConstructorFn<P extends BaseProps, T extends Component<P, ? extends JsPlainObj>> {
	/**
	 * This method is not supposed to be called by the user directly, as it will not have the expected effect.
	 * Calling a JavaScript function with 'new' is not supported from Java.
	 */
    T create(P props);
}
