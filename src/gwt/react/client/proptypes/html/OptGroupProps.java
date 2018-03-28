package gwt.react.client.proptypes.html;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for optgroup elements. Refer to http://www.w3schools.com/tags/tag_optgroup.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptGroupProps extends HtmlGlobalFields {

    @JsOverlay public final OptGroupProps disabled(boolean b) { disabled = b; return this; }
    @JsOverlay public final OptGroupProps label(String s) { label = s;return this;}
}
