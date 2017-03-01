package gwt.react.client.components;

import gwt.interop.utils.client.collections.JsStringMap;
import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.interop.utils.shared.collections.StringMap;
import gwt.react.client.proptypes.BaseProps;

/**
 * Utility functions for working with ES6 style React.Components
 */
public class ComponentUtils {
    private ComponentUtils() {
    }

    private static StringMap<ComponentConstructorFn> constructorLookup = JsStringMap.create() ;

    public static <P extends BaseProps, S extends JsPlainObj, T extends Component<P, S>> ComponentConstructorFn<P> getCtorFn(Class<T> cls) {
        return getCtorFn(cls.getName());
    }

    public static <P extends BaseProps> ComponentConstructorFn<P> getCtorFn(String className) {
        ComponentConstructorFn<P> fn = constructorLookup.get(className);

        if (fn == null) {
            fn = getJSConstructorFn(className);
            assert(fn != null);

            constructorLookup.put(className, fn);
        }
        return fn;
    }

    /**
     * TODO find a more efficient way of obtaining the constructor function
     */
    private static native <P extends BaseProps> ComponentConstructorFn<P> getJSConstructorFn(String className) /*-{
        var namespaces = className.split(".");
        var context = $wnd;

        for (var i = 0; i < namespaces.length; i++) {
            context = context[namespaces[i]];
        }
        return context;
	}-*/;
}
