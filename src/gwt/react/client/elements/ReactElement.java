package gwt.react.client.elements;

import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ReactElement<P extends BaseProps, T> {
    public final T type;
    public final P props;
    public final String key;

    /**
     * Objects of this class cannot be directly instantiated by the user.
     */
    protected ReactElement() {
    	type = null;
    	props = null;
    	key = null;
	}
}
