package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for td elements. Refer to http://www.w3schools.com/tags/tag_td.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TdProps extends HtmlGlobalFields {

    @JsOverlay public final TdProps colSpan(int i) { setColSpan(i); return this; }
    @JsOverlay public final TdProps headers(String s) { setHeaders(s); return this; }
    @JsOverlay public final TdProps rowSpan(int i) { setRowSpan(i); return this; }

    //React Specific
    @JsOverlay public final TdProps ref(String s) { ref = s; return this; }
    @JsOverlay public final TdProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final TdProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final TdProps accessKey(String s) { setAccessKey(s); return this;}
    @JsOverlay public final TdProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final TdProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final TdProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final TdProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final TdProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final TdProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final TdProps id(String s) { setId(s); return this; }
    @JsOverlay public final TdProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final TdProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final TdProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final TdProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final TdProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final TdProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final TdProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final TdProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final TdProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final TdProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final TdProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final TdProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final TdProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final TdProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final TdProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final TdProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final TdProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final TdProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final TdProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final TdProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final TdProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final TdProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final TdProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final TdProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final TdProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final TdProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final TdProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final TdProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final TdProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final TdProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final TdProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final TdProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final TdProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
