package gwt.react.client.proptypes.html;

import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for svg circle elements. Refer to https://developer.mozilla.org/en-US/docs/Web/SVG/Element/circle
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class CircleProps extends HtmlGlobalFields {

    @JsOverlay public final CircleProps height(int i) { height = Integer.toString(i); return this; }
    @JsOverlay public final CircleProps width(int i) { width = Integer.toString(i); return this; }

    @JsOverlay public final CircleProps cX(String s) { set("cx", s); return this;}
    @JsOverlay public final CircleProps cY(String s) { set("cy", s); return this;}
    @JsOverlay public final CircleProps r(String s) { set("r", s); return this;}
    @JsOverlay public final CircleProps fill(String s) { set("fill", s); return this;}
    @JsOverlay public final CircleProps strokeDasharray(String s) { set("strokeDasharray", s); return this;}
    @JsOverlay public final CircleProps strokeDashoffset(String s) { set("strokeDashoffset", s); return this;}


    //React Specific

    @Deprecated @JsOverlay public final CircleProps ref(String s) { ref = s; return this; }
    @JsOverlay public final CircleProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final <T> CircleProps ref(ReactRef<T> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final CircleProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final CircleProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final CircleProps className(String s) { className = s; return this; }
    @JsOverlay public final CircleProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final CircleProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final CircleProps dir(String s) { dir = s; return this; }
    @JsOverlay public final CircleProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final CircleProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final CircleProps id(String s) { id = s; return this; }
    @JsOverlay public final CircleProps lang(String s) { lang = s; return this; }
    @JsOverlay public final CircleProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final CircleProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final CircleProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final CircleProps title(String s) { title = s; return this; }
    @JsOverlay public final CircleProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final CircleProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final CircleProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Image Events
    @JsOverlay public final CircleProps onLoad(ReactEventHandler handler) { onLoad = handler; return this; }
    @JsOverlay public final CircleProps onError(ReactEventHandler handler) { onError = handler; return this; }

    // Keyboard Events
    @JsOverlay public final CircleProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final CircleProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final CircleProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    // MouseEvents
    @JsOverlay public final CircleProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final CircleProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final CircleProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final CircleProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final CircleProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final CircleProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final CircleProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final CircleProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final CircleProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final CircleProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final CircleProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final CircleProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final CircleProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final CircleProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final CircleProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final CircleProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final CircleProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final CircleProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final CircleProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final CircleProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final CircleProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final CircleProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
