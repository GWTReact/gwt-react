package gwt.react.client.proptypes;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.elements.ReactElementChildren;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public class BaseProps extends JsPlainObj {
    public ReactElementChildren children;
    public String key;
    public Object ref; //Either a String Id or RefCallback
}
