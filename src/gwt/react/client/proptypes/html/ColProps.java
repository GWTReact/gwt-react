package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLTableColElement;
import gwt.react.client.api.ReactRef;
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

    @JsOverlay public final ColProps span(int i) { span = i; return this; }

    //React Specific
    @Deprecated @JsOverlay public final ColProps ref(String s) { ref = s; return this; }
    @JsOverlay public final ColProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final ColProps ref(ReactRef<HTMLTableColElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final ColProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final ColProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final ColProps className(String s) { className = s; return this; }
    @JsOverlay public final ColProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final ColProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final ColProps dir(String s) { dir = s; return this; }
    @JsOverlay public final ColProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final ColProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final ColProps id(String s) { id = s; return this; }
    @JsOverlay public final ColProps lang(String s) { lang = s; return this; }
    @JsOverlay public final ColProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final ColProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final ColProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final ColProps title(String s) { title = s; return this; }
    @JsOverlay public final ColProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final ColProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final ColProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final ColProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final ColProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final ColProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final ColProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final ColProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final ColProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final ColProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final ColProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final ColProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final ColProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final ColProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final ColProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final ColProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final ColProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final ColProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final ColProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final ColProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final ColProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final ColProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final ColProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final ColProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final ColProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final ColProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final ColProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final ColProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
