package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for svg elements. Refer to https://www.w3schools.com/graphics/svg_reference.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SvgProps extends HtmlGlobalFields {

    @JsOverlay public final SvgProps height(int i) { height = Integer.toString(i); return this; }
    @JsOverlay public final SvgProps width(int i) { width = Integer.toString(i); return this; }

    @JsOverlay public final SvgProps viewBox(String s) { set("viewBox", s); return this;}
    @JsOverlay public final SvgProps version(String s) { set("version", s); return this;}
    @JsOverlay public final SvgProps xmlns(String s) { set("xmlns", s); return this;}


    //React Specific

    @JsOverlay public final SvgProps ref(String s) { ref = s; return this; }
    @JsOverlay public final SvgProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final SvgProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final SvgProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final SvgProps className(String s) { className = s; return this; }
    @JsOverlay public final SvgProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final SvgProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final SvgProps dir(String s) { dir = s; return this; }
    @JsOverlay public final SvgProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final SvgProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final SvgProps id(String s) { id = s; return this; }
    @JsOverlay public final SvgProps lang(String s) { lang = s; return this; }
    @JsOverlay public final SvgProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final SvgProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final SvgProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final SvgProps title(String s) { title = s; return this; }
    @JsOverlay public final SvgProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final SvgProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final SvgProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Image Events
    @JsOverlay public final SvgProps onLoad(ReactEventHandler handler) { onLoad = handler; return this; }
    @JsOverlay public final SvgProps onError(ReactEventHandler handler) { onError = handler; return this; }

    // Keyboard Events
    @JsOverlay public final SvgProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final SvgProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final SvgProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    // MouseEvents
    @JsOverlay public final SvgProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final SvgProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final SvgProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final SvgProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final SvgProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final SvgProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final SvgProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final SvgProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final SvgProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final SvgProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final SvgProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final SvgProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final SvgProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final SvgProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final SvgProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final SvgProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final SvgProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final SvgProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final SvgProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final SvgProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final SvgProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final SvgProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
