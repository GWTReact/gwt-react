package gwt.react.client.components;

import gwt.interop.utils.shared.functional.JsProcedure;
import gwt.react.client.proptypes.BaseContext;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

@JsType
public abstract class Component<P extends BaseProps, S> extends ComponentWithContext<P, BaseContext, S> {
	@JsConstructor
	protected Component(P props, BaseContext context, JsProcedure updater) {
		super(props, context, updater);
	}
}
