package gwt.react.client.proptypes.html;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for option elements. Refer to http://www.w3schools.com/tags/tag_option.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionProps extends HtmlGlobalFields {

    @JsOverlay public final OptionProps disabled(boolean b) { disabled = b; return this; }
    @JsOverlay public final OptionProps label(String s) { label = s;return this;}
    @JsOverlay public final OptionProps selected(boolean b) { selected = b; return this; }
    @JsOverlay public final OptionProps value(String s) { value = s;return this;}

    //React Specific
    @JsOverlay public final OptionProps key(String s) { key = s; return this; }
}
