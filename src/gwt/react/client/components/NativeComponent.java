package gwt.react.client.components;

import gwt.interop.utils.shared.functional.JsProcedure;
import gwt.react.client.proptypes.BaseContext;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "React", name = "Component")
public abstract class NativeComponent<P extends BaseProps, C extends BaseContext, S> {
	@JsConstructor
	protected NativeComponent(P props, C context, JsProcedure updater) {
	}
	
	@JsProperty
	protected S state;
	
    /**
     * Performs a shallow merge of nextState into current state. This is the primary method you
     * use to trigger UI updates from event handlers and server request callbacks.
     *
     * @param state  Object Literal (containing zero or more keys to update)
     */
    @JsMethod
    protected final native void setState(S partialState);

    /**
     * Performs a shallow merge of nextState into current state. This is the primary method you
     * use to trigger UI updates from event handlers and server request callbacks.
     *
     * @param state Object Literal (containing zero or more keys to update)
     * @param callback callback function that will be executed once setState is completed and
     *                 the component is re-rendered.
     */
    @JsMethod
    protected final native void setState(S partialState, JsProcedure callback);


    /**
     * <p>Performs a shallow merge of nextState into current state. This is the primary method
     * you use to trigger UI updates from event handlers and server request callbacks.</p>
     *
     * <p>It's also possible to pass a function with the signature function(state, props).
     * This can be useful in some cases when you want to enqueue an atomic update that
     * consults the previous value of state+props before setting any values</p>
     *
     * @param callback callback function that will be executed once setState is completed and
     *                 the component is re-rendered.
     */
    @JsMethod
    protected final native void setState(SetStateCallback<S, P> callback);

    /**
     * <p>By default, when your component's state or props change, your component will re-render.
     * However, if these change implicitly (eg: data deep within an object changes without
     * changing the object itself) or if your render() method depends on some other data, you can
     * tell React that it needs to re-run render() by calling forceUpdate().</p>
     *
     * <p>Calling forceUpdate() will cause render() to be called on the component, skipping
     * shouldComponentUpdate(). This will trigger the normal lifecycle methods for child
     * components, including the shouldComponentUpdate() method of each child. React will still
     * only update the DOM if the markup changes.</p>
     *
     * <p>Normally you should try to avoid all uses of forceUpdate() and only read from this.props
     * and this.state in render(). This makes your component "pure" and your application much
     * simpler and more efficient.</p>
     *
     * @param callBack callback function that will be executed once the component has been updated
     */
    @JsMethod
    protected final native void forceUpdate(JsProcedure callBack);
    
    @JsMethod
    protected final native void forceUpdate();

    /**
     * Return the props for this component
     *
     * @return the props
     */
    @JsProperty
    protected native P getProps();

    @JsProperty
    protected native C getContext();
    
    /**
     * Return the DOM or React element for the specified reference
     *
     * @param refId the id that was set on the component
     * @return the actual DOM node or React element
     */
    protected native <E> E getRef(String refId);
}
