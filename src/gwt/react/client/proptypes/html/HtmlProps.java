package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class HtmlProps extends HtmlGlobalFields {

    //React Specific

    @JsOverlay public final HtmlProps dangerouslySetInnerHTML(String s) { setDangerouslyInnerHTML(s); return this; }
    @Deprecated @JsOverlay public final HtmlProps ref(String s) { ref = s; return this; }
    @JsOverlay public final HtmlProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final HtmlProps ref(ReactRef<HTMLElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final HtmlProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final HtmlProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final HtmlProps className(String s) { className = s; return this; }
    @JsOverlay public final HtmlProps className(String s1, String s2) { className = s1 + " " + s2; return this; }
    @JsOverlay public final HtmlProps className(String s1, String s2, String s3) { className = s1 + " " + s2 + " " + s3; return this; }
    @JsOverlay public final HtmlProps className(String s1, String s2, String s3, String s4) { className = s1 + " " + s2 + " " + s3 + " " + s4; return this; }

    @JsOverlay public final HtmlProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final HtmlProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final HtmlProps dir(String s) { dir = s; return this; }
    @JsOverlay public final HtmlProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final HtmlProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final HtmlProps id(String s) { id = s; return this; }
    @JsOverlay public final HtmlProps lang(String s) { lang = s; return this; }
    @JsOverlay public final HtmlProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final HtmlProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final HtmlProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final HtmlProps title(String s) { title = s; return this; }
    @JsOverlay public final HtmlProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final HtmlProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final HtmlProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final HtmlProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final HtmlProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final HtmlProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final HtmlProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final HtmlProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final HtmlProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final HtmlProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final HtmlProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final HtmlProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final HtmlProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final HtmlProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final HtmlProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final HtmlProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final HtmlProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final HtmlProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final HtmlProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final HtmlProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final HtmlProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final HtmlProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final HtmlProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final HtmlProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final HtmlProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final HtmlProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final HtmlProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final HtmlProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
