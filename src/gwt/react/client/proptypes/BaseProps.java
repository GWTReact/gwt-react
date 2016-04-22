package gwt.react.client.proptypes;

import gwt.react.client.elements.ReactElementChildren;
import gwt.react.client.utils.ObjLiteral;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public class BaseProps extends ObjLiteral {
    public ReactElementChildren children;
    public String key;
    public Object ref; //Either a String Id or RefCallback
}
