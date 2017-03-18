package gwt.react.client.proptypes.html;

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
    @JsOverlay public final HtmlProps ref(String s) { ref = s; return this; }
    @JsOverlay public final HtmlProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final HtmlProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final HtmlProps accessKey(String s) { setAccessKey(s);return this;}
    @JsOverlay public final HtmlProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final HtmlProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final HtmlProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final HtmlProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final HtmlProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final HtmlProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final HtmlProps id(String s) { setId(s); return this; }
    @JsOverlay public final HtmlProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final HtmlProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final HtmlProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final HtmlProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final HtmlProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final HtmlProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final HtmlProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final HtmlProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final HtmlProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final HtmlProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final HtmlProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final HtmlProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final HtmlProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final HtmlProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final HtmlProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final HtmlProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final HtmlProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final HtmlProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final HtmlProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final HtmlProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final HtmlProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final HtmlProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final HtmlProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final HtmlProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final HtmlProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final HtmlProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final HtmlProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final HtmlProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final HtmlProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final HtmlProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final HtmlProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final HtmlProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final HtmlProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
