package gwt.react.client.elements;

import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ReactElement<P extends BaseProps, T> {
    public T type;
    public P props;
    public String key;

    protected ReactElement() {
	}
}
