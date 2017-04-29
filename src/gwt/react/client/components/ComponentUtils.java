package gwt.react.client.components;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.proptypes.BaseProps;

/**
 * Utility functions for working with ES6 style React.Components
 */
public class ComponentUtils {
    private ComponentUtils() {
    }

    /**
     * Given the Class of a JsType annotated {@link Component} class, return the constructor function to use in Javascript
     * @param cls The Class
     * @param <P> The type of props the {@link Component} supports
     * @param <S> The type of state the {@link Component} supports
     * @param <T> The type of {@link Component}
     * @return The constructor function
     */
    public static native <P extends BaseProps, S extends JsPlainObj, T extends Component<P, S>> ComponentConstructorFn<P> getCtorFn(Class<T> cls) /*-{
        return cls.@java.lang.Class::jsConstructor;
    }-*/;
}
