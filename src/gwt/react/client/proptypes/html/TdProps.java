package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLTableCellElement;
import gwt.react.client.api.ReactRef;
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

    @JsOverlay public final TdProps colSpan(int i) { colSpan = i; return this; }
    @JsOverlay public final TdProps headers(String s) { headers = s; return this; }
    @JsOverlay public final TdProps rowSpan(int i) { rowSpan = i; return this; }

    //React Specific
    @Deprecated @JsOverlay public final TdProps ref(String s) { ref = s; return this; }
    @JsOverlay public final TdProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final TdProps ref(ReactRef<HTMLTableCellElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final TdProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final TdProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final TdProps className(String s) { className = s; return this; }
    @JsOverlay public final TdProps className(String s1, String s2) { className = s1 + " " + s2; return this; }
    @JsOverlay public final TdProps className(String s1, String s2, String s3) { className = s1 + " " + s2 + " " + s3; return this; }
    @JsOverlay public final TdProps className(String s1, String s2, String s3, String s4) { className = s1 + " " + s2 + " " + s3 + " " + s4; return this; }
    @JsOverlay public final TdProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final TdProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final TdProps dir(String s) { dir = s; return this; }
    @JsOverlay public final TdProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final TdProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final TdProps id(String s) { id = s; return this; }
    @JsOverlay public final TdProps lang(String s) { lang = s; return this; }
    @JsOverlay public final TdProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final TdProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final TdProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final TdProps title(String s) { title = s; return this; }
    @JsOverlay public final TdProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final TdProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final TdProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final TdProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final TdProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final TdProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final TdProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final TdProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final TdProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final TdProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final TdProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final TdProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final TdProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final TdProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final TdProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final TdProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final TdProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final TdProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final TdProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final TdProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final TdProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final TdProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final TdProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final TdProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final TdProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final TdProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final TdProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final TdProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
