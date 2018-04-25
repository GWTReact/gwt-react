package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLSelectElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for select elements. Refer to http://www.w3schools.com/tags/tag_select.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SelectProps extends HtmlGlobalFields {

    @JsOverlay public final SelectProps autoFocus(boolean b) { autoFocus = b; return this; }
    @JsOverlay public final SelectProps disabled(boolean b) { disabled = b; return this; }
    @JsOverlay public final SelectProps form(String s) { form = s; return this; }
    @JsOverlay public final SelectProps multiple(boolean b) { multiple = b; return this; }
    @JsOverlay public final SelectProps name(String s) { name = s; return this; }
    @JsOverlay public final SelectProps required(boolean b) { required = b; return this; }
    @JsOverlay public final SelectProps size(int b) { size = b; return this; }
    @JsOverlay public final SelectProps value(String s) { value = s; return this; }
    @JsOverlay public final SelectProps defaultValue(String s) { defaultValue = s; return this; }

    //React Specific
    @Deprecated @JsOverlay public final SelectProps ref(String s) { ref = s; return this; }
    @JsOverlay public final SelectProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final SelectProps ref(ReactRef<HTMLSelectElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final SelectProps key(String s) { key = s; return this; }


    //Global HTML props
    @JsOverlay public final SelectProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final SelectProps className(String s) { className = s; return this; }
    @JsOverlay public final SelectProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final SelectProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final SelectProps dir(String s) { dir = s; return this; }
    @JsOverlay public final SelectProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final SelectProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final SelectProps id(String s) { id = s; return this; }
    @JsOverlay public final SelectProps lang(String s) { lang = s; return this; }
    @JsOverlay public final SelectProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final SelectProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final SelectProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final SelectProps title(String s) { title = s; return this; }
    @JsOverlay public final SelectProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final SelectProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final SelectProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Form Events
    @JsOverlay public final SelectProps onChange(FormEventHandler handler) { onChange = handler; return this; }

    // Keyboard Events
    @JsOverlay public final SelectProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final SelectProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final SelectProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final SelectProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final SelectProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final SelectProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final SelectProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final SelectProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final SelectProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final SelectProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final SelectProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final SelectProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final SelectProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final SelectProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final SelectProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final SelectProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final SelectProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final SelectProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final SelectProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final SelectProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final SelectProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final SelectProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final SelectProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final SelectProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final SelectProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
