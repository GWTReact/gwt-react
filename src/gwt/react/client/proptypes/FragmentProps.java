package gwt.react.client.proptypes;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public class FragmentProps extends BaseProps {
	@JsOverlay
	public final FragmentProps key(String s) { key = s; return this; }
}
