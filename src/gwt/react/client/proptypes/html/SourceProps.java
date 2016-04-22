package gwt.react.client.proptypes.html;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for source elements. Refer to http://www.w3schools.com/tags/tag_source.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class SourceProps extends HtmlGlobalFields {

    @JsOverlay public final SourceProps media(String s) { setMedia(s);return this;}
    @JsOverlay public final SourceProps src(String s) { setSrc(s);return this;}
    @JsOverlay public final SourceProps type(String s) { setType(s);return this;}
}
