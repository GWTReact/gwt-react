package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for svg polygon elements. Refer to https://developer.mozilla.org/en-US/docs/Web/SVG/Element/polygon
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PolygonProps extends HtmlGlobalFields {

    @JsOverlay public final PolygonProps points(String p) { set("points", p); return this; }

    //React Specific

    @JsOverlay public final PolygonProps ref(String s) { ref = s; return this; }
    @JsOverlay public final PolygonProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final PolygonProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final PolygonProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final PolygonProps className(String s) { className = s; return this; }
    @JsOverlay public final PolygonProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final PolygonProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final PolygonProps dir(String s) { dir = s; return this; }
    @JsOverlay public final PolygonProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final PolygonProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final PolygonProps id(String s) { id = s; return this; }
    @JsOverlay public final PolygonProps lang(String s) { lang = s; return this; }
    @JsOverlay public final PolygonProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final PolygonProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final PolygonProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final PolygonProps title(String s) { title = s; return this; }
    @JsOverlay public final PolygonProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final PolygonProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final PolygonProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Image Events
    @JsOverlay public final PolygonProps onLoad(ReactEventHandler handler) { onLoad = handler; return this; }
    @JsOverlay public final PolygonProps onError(ReactEventHandler handler) { onError = handler; return this; }

    // Keyboard Events
    @JsOverlay public final PolygonProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final PolygonProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final PolygonProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    // MouseEvents
    @JsOverlay public final PolygonProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final PolygonProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final PolygonProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final PolygonProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final PolygonProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final PolygonProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final PolygonProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final PolygonProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final PolygonProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final PolygonProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final PolygonProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final PolygonProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final PolygonProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final PolygonProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final PolygonProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final PolygonProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final PolygonProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final PolygonProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final PolygonProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final PolygonProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final PolygonProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final PolygonProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
