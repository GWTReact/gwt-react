package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLTableElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TableProps extends HtmlGlobalFields {

    @JsOverlay public final TableProps cellPadding(String s) { cellPadding = s; return this; }
    @JsOverlay public final TableProps cellSpacing(String s) { cellSpacing = s; return this; }

    //React Specific

    @JsOverlay public final TableProps dangerouslyinnerHTML(String s) { setDangerouslyInnerHTML(s); return this; }
    @Deprecated @JsOverlay public final TableProps ref(String s) { ref = s; return this; }
    @JsOverlay public final TableProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final TableProps ref(ReactRef<HTMLTableElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final TableProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final TableProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final TableProps className(String s) { className = s; return this; }
    @JsOverlay public final TableProps className(String s1, String s2) { className = s1 + " " + s2; return this; }
    @JsOverlay public final TableProps className(String s1, String s2, String s3) { className = s1 + " " + s2 + " " + s3; return this; }
    @JsOverlay public final TableProps className(String s1, String s2, String s3, String s4) { className = s1 + " " + s2 + " " + s3 + " " + s4; return this; }

    @JsOverlay public final TableProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final TableProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final TableProps dir(String s) { dir = s; return this; }
    @JsOverlay public final TableProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final TableProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final TableProps id(String s) { id = s; return this; }
    @JsOverlay public final TableProps lang(String s) { lang = s; return this; }
    @JsOverlay public final TableProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final TableProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final TableProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final TableProps title(String s) { title = s; return this; }
    @JsOverlay public final TableProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final TableProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final TableProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final TableProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final TableProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final TableProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final TableProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final TableProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final TableProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final TableProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final TableProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final TableProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final TableProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final TableProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final TableProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final TableProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final TableProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final TableProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final TableProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final TableProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final TableProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final TableProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final TableProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final TableProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final TableProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final TableProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final TableProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final TableProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
