package gwt.react.client.elements;


import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsType;

/**
 * Created by paul on 2016-03-12.
 */
@JsType(isNative = true)
public class ReactElement<P extends BaseProps, T> {
    public T type;
    public P props;
    public String key;
}
