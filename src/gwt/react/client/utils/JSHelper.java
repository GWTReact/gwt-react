package gwt.react.client.utils;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="GWTReact")
class JSHelper {

    @JsMethod(name="$set")
    static native <O> void setObjectProperty(O o, String Property, int v);

    @JsMethod(name="$set")
    static native <O> void setObjectProperty(O o, String Property, double v);

    @JsMethod(name="$set")
    static native <O> void setObjectProperty(O o, String Property, boolean v);

    @JsMethod(name="$set")
    static native <O> void setObjectProperty(O o, String Property, String v );

    @JsMethod(name="$set")
    static native <O> void setObjectProperty(O o, String Property, O v);

    @JsMethod(name="$get")
    static native <O> int getObjectIntProperty(O o, String Property);

    @JsMethod(name="$get")
    static native <O> double getObjectDblProperty(O o, String Property);

    @JsMethod(name="$get")
    static native <O> boolean getObjectBoolProperty(O o,String Property);

    @JsMethod(name="$get")
    static native <O> String getObjectStrProperty(O o,String Property);

    @JsMethod(name="$get")
    static native <O, R> R getObjectObjProperty(O o,String Property);

    static native <R> R merge(Object obj, Object obj2);

    static native <R> R except(Object obj, String[] props);

    @JsMethod(namespace = "JSON", name = "stringify")
    static native String toJSON(Object obj);
}
