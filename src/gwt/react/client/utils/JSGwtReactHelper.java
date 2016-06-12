package gwt.react.client.utils;

import gwt.interop.utils.shared.collections.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="GWTReact")
public class JSGwtReactHelper {

    @JsMethod(name="s")
    public static native <O> void setObjectProperty(O o, String property, int v);

    @JsMethod(name="s")
    public static native <O> void setObjectProperty(O o, String property, double v);

    @JsMethod(name="s")
    public static native <O> void setObjectProperty(O o, String property, boolean v);

    @JsMethod(name="s")
    public static native <O> void setObjectProperty(O o, String property, Object v );

    @JsMethod(name="g")
    public static native <O> int getObjectIntProperty(O o, String property);

    @JsMethod(name="g")
    public static native <O> double getObjectDblProperty(O o, String property);

    @JsMethod(name="g")
    public static native <O> boolean getObjectBoolProperty(O o,String property);

    @JsMethod(name="g")
    public static native <O> String getObjectStrProperty(O o,String property);

    @JsMethod(name="g")
    public static native <O, R> R getObjectObjProperty(O o,String property);

    @JsMethod(name="remProp")
    public static native void removeProperty(Object obj, String property);

    @JsMethod(name="hasProp")
    public static native boolean hasProperty(Object obj, String property);

    @JsMethod(name="props")
    public static native Array<String> objectProperties(Object obj);

    @JsMethod(name="values")
    public static native <T> Array<T> objectValues(Object obj);

    public static native <R> R merge(Object obj, Object obj2);

    public static native <R> R except(Object obj, String[] props);

    @JsMethod(namespace = "JSON", name = "stringify")
    public static native String toJSON(Object obj);

    @JsMethod(name="s")
    public static native <T extends Object> void setArrayValue(Array array, int index, T value);

    @JsMethod(name="g")
    public static native <T extends Object> T getArrayValue(Array array, int index);
}
