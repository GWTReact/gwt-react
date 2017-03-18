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

    /**
     * Given the Class of a JsType annotated {@link Component} class, return the constructor function to use in Javascript
     * @param cls The Class
     * @param <P> The type of props the {@link Component} supports
     * @param <S> The type of state the {@link Component} supports
     * @param <T> The type of {@link Component}
     * @return The constructor function
     */
    public static <P extends BaseProps, S extends JsPlainObj, T extends Component<P, S>> ComponentConstructorFn<P> getCtorFn(Class<T> cls) {
        return getCtorFn(cls, cls.getName());
    }

    /**
     * Given the fully qualified name of a JsType annotated {@link Component} class, return the constructor function to use in Javascript
     * @param cls The Class
     * @param actualClassName The fully qualified name. This is useful if it does not match the className of cls.
     * @param <P>
     * @return The constructor function
     */
    public static <P extends BaseProps, S extends JsPlainObj, T extends Component<P, S>> ComponentConstructorFn<P> getCtorFn(Class<T> cls, String actualClassName) {
        ComponentConstructorFn<P> fn = constructorLookup.get(actualClassName);

        if (fn == null) {
            fn = getJSConstructorFn(actualClassName);
            assert(fn != null);

            constructorLookup.put(actualClassName, fn);
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
