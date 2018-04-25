package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLAnchorElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for a elements. Refer to http://www.w3schools.com/tags/tag_a.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AnchorProps extends HtmlGlobalFields {

    @JsOverlay public final AnchorProps download(String s) { download = s; return this; }
    @JsOverlay public final AnchorProps href(String s) { href = s; return this; }
    @JsOverlay public final AnchorProps hrefLang(String s) { hrefLang = s; return this; }
    @JsOverlay public final AnchorProps media(String s) { media = s; return this; }
    @JsOverlay public final AnchorProps rel(String s) { rel = s; return this; }
    @JsOverlay public final AnchorProps referrerPolicy(String s) { referrerPolicy = s; return this; }
    @JsOverlay public final AnchorProps target(String s) { target = s; return this; }
    @JsOverlay public final AnchorProps type(String t) { type = t; return this; }

    //React Specific

    @Deprecated @JsOverlay public final AnchorProps ref(String s) { ref = s; return this; }
    @JsOverlay public final AnchorProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final AnchorProps ref(ReactRef<HTMLAnchorElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final AnchorProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final AnchorProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final AnchorProps className(String s) { className = s; return this; }
    @JsOverlay public final AnchorProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final AnchorProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final AnchorProps dir(String s) { dir = s; return this; }
    @JsOverlay public final AnchorProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final AnchorProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final AnchorProps id(String s) { id = s; return this; }
    @JsOverlay public final AnchorProps lang(String s) { lang = s; return this; }
    @JsOverlay public final AnchorProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final AnchorProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final AnchorProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final AnchorProps title(String s) { title = s; return this; }
    @JsOverlay public final AnchorProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final AnchorProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final AnchorProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final AnchorProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final AnchorProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final AnchorProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final AnchorProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final AnchorProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final AnchorProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final AnchorProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final AnchorProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final AnchorProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final AnchorProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final AnchorProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final AnchorProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final AnchorProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final AnchorProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final AnchorProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final AnchorProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final AnchorProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final AnchorProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final AnchorProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final AnchorProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final AnchorProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final AnchorProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final AnchorProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final AnchorProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final AnchorProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
