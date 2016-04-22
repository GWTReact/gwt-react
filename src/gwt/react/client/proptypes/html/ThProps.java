package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.HeaderScope;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for td elements. Refer to http://www.w3schools.com/tags/tag_td.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ThProps extends HtmlGlobalFields {

    @JsOverlay public final ThProps colSpan(int i) { setColSpan(i); return this; }
    @JsOverlay public final ThProps headers(String headerId) { setHeaders(headerId); return this; }
    @JsOverlay public final ThProps rowSpan(int i) { setRowSpan(i); return this; }
    @JsOverlay public final ThProps scope(HeaderScope s) { setScope(s.name()); return this; }

    //React Specific
    @JsOverlay public final ThProps ref(String s) { ref = s; return this; }
    @JsOverlay public final ThProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final ThProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final ThProps accessKey(String s) { setAccessKey(s); return this;}
    @JsOverlay public final ThProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final ThProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final ThProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final ThProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final ThProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final ThProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final ThProps id(String s) { setId(s); return this; }
    @JsOverlay public final ThProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final ThProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final ThProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final ThProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final ThProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final ThProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final ThProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final ThProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final ThProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final ThProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final ThProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final ThProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final ThProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final ThProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final ThProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final ThProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final ThProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final ThProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final ThProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final ThProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final ThProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final ThProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final ThProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final ThProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final ThProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final ThProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final ThProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final ThProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final ThProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final ThProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final ThProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final ThProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final ThProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
