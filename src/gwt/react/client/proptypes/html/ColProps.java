package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for col elements. Refer to http://www.w3schools.com/tags/tag_col.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ColProps extends HtmlGlobalFields {

    @JsOverlay public final ColProps span(int i) { setSpan(i); return this; }

    //React Specific
    @JsOverlay public final ColProps ref(String s) { ref = s; return this; }
    @JsOverlay public final ColProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final ColProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final ColProps accessKey(String s) { setAccessKey(s); return this;}
    @JsOverlay public final ColProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final ColProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final ColProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final ColProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final ColProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final ColProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final ColProps id(String s) { setId(s); return this; }
    @JsOverlay public final ColProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final ColProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final ColProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final ColProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final ColProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final ColProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final ColProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final ColProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final ColProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final ColProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final ColProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final ColProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final ColProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final ColProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final ColProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final ColProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final ColProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final ColProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final ColProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final ColProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final ColProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final ColProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final ColProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final ColProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final ColProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final ColProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final ColProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final ColProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final ColProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final ColProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final ColProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final ColProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final ColProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
