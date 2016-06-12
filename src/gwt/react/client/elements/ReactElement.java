package gwt.react.client.elements;


import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ReactElement<P extends BaseProps, T> {
    public T type;
    public P props;
    public String key;
}
