package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLTableRowElement;
import gwt.react.client.api.ReactRef;
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

    @JsOverlay public final ThProps colSpan(int i) { colSpan = i; return this; }
    @JsOverlay public final ThProps headers(String headerId) { headers = headerId; return this; }
    @JsOverlay public final ThProps rowSpan(int i) { rowSpan = i; return this; }
    @JsOverlay public final ThProps scope(HeaderScope s) { scope = s.name(); return this; }

    //React Specific
    @Deprecated @JsOverlay public final ThProps ref(String s) { ref = s; return this; }
    @JsOverlay public final ThProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final ThProps ref(ReactRef<HTMLTableRowElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final ThProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final ThProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final ThProps className(String s) { className = s; return this; }
    @JsOverlay public final ThProps className(String s1, String s2) { className = s1 + " " + s2; return this; }
    @JsOverlay public final ThProps className(String s1, String s2, String s3) { className = s1 + " " + s2 + " " + s3; return this; }
    @JsOverlay public final ThProps className(String s1, String s2, String s3, String s4) { className = s1 + " " + s2 + " " + s3 + " " + s4; return this; }

    @JsOverlay public final ThProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final ThProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final ThProps dir(String s) { dir = s; return this; }
    @JsOverlay public final ThProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final ThProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final ThProps id(String s) { id = s; return this; }
    @JsOverlay public final ThProps lang(String s) { lang = s; return this; }
    @JsOverlay public final ThProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final ThProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final ThProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final ThProps title(String s) { title = s; return this; }
    @JsOverlay public final ThProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final ThProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final ThProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final ThProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final ThProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final ThProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final ThProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final ThProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final ThProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final ThProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final ThProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final ThProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final ThProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final ThProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final ThProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final ThProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final ThProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final ThProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final ThProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final ThProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final ThProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final ThProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final ThProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final ThProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final ThProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final ThProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final ThProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final ThProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
