package gwt.react.client.components;

import gwt.interop.utils.shared.functional.JsProcedure;
import gwt.react.client.proptypes.BaseContext;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "React", name = "PureComponent")
abstract class NativePureComponent<P extends BaseProps, C extends BaseContext, S> extends NativeComponent<P, C, S> {
	@JsConstructor
	protected NativePureComponent(P props, C context, JsProcedure updater) {
		super(props, context, updater);
	}
}
