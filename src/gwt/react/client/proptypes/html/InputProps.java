package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLInputElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.InputType;
import gwt.react.client.proptypes.html.attributeTypes.OnOff;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for input elements. Refer to http://www.w3schools.com/tags/tag_input.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class InputProps extends HtmlGlobalFields {

    @JsOverlay public final InputProps accept(String s) { accept = s; return this; }
    @JsOverlay public final InputProps alt(String s) { alt = s; return this; }
    @JsOverlay public final InputProps async(boolean b) { async = b; return this; }
    @JsOverlay public final InputProps autoComplete(OnOff s) { autoComplete = s.name(); return this; }
    @JsOverlay public final InputProps autoFocus(boolean b) { autoFocus = b; return this; }
    @JsOverlay public final InputProps checked(boolean b) { checked = b; return this; }
    @JsOverlay public final InputProps disabled(boolean b) { disabled = b; return this; }
    @JsOverlay public final InputProps form(String s) { form = s; return this; }
    @JsOverlay public final InputProps formAction(String s) { formAction = s; return this; }
    @JsOverlay public final InputProps formEncType(String s) { formEncType = s; return this; }
    @JsOverlay public final InputProps formMethod(String s) { formMethod = s; return this; }
    @JsOverlay public final InputProps formNoValidate(boolean b) { formNoValidate = b; return this; }
    @JsOverlay public final InputProps formTarget(String s) { formTarget = s; return this; }
    @JsOverlay public final InputProps height(String s) { height = s; return this; }
    @JsOverlay public final InputProps list(String s) { list = s; return this; }
    @JsOverlay public final InputProps max(String s) { max = s; return this; }
    @JsOverlay public final InputProps maxLength(int b) { maxLength = b; return this; }
    @JsOverlay public final InputProps min(String s) { min = s; return this; }
    @JsOverlay public final InputProps multiple(boolean b) { multiple = b; return this; }
    @JsOverlay public final InputProps name(String s) { name = s; return this; }
    @JsOverlay public final InputProps placeholder(String s) { placeholder = s; return this; }
    @JsOverlay public final InputProps readonly(boolean b) { readOnly = b; return this; }
    @JsOverlay public final InputProps required(boolean b) { required = b; return this; }
    @JsOverlay public final InputProps size(int b) { size = b; return this; }
    @JsOverlay public final InputProps src(String s) { src = s; return this; }
    @JsOverlay public final InputProps step(String s) { step = s; return this; }
    @JsOverlay public final InputProps type(InputType t) { type = t.name(); return this; }
    @JsOverlay public final InputProps value(String s) { value = s; return this; }
    @JsOverlay public final InputProps width(int i) { width = Integer.toString(i); return this; }

    //React Specific

    @JsOverlay public final InputProps defaultChecked(boolean b) { defaultChecked = b; return this; };
    @JsOverlay public final InputProps defaultValue(String s) { defaultValue = s; return this; }
    @Deprecated @JsOverlay public final InputProps ref(String s) { ref = s; return this; }
    @JsOverlay public final InputProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final InputProps ref(ReactRef<HTMLInputElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final InputProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final InputProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final InputProps className(String s) { className = s; return this; }
    @JsOverlay public final InputProps className(String s1, String s2) { className = s1 + " " + s2; return this; }
    @JsOverlay public final InputProps className(String s1, String s2, String s3) { className = s1 + " " + s2 + " " + s3; return this; }
    @JsOverlay public final InputProps className(String s1, String s2, String s3, String s4) { className = s1 + " " + s2 + " " + s3 + " " + s4; return this; }
    @JsOverlay public final InputProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final InputProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final InputProps dir(String s) { dir = s; return this; }
    @JsOverlay public final InputProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final InputProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final InputProps id(String s) { id = s; return this; }
    @JsOverlay public final InputProps lang(String s) { lang = s; return this; }
    @JsOverlay public final InputProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final InputProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final InputProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final InputProps title(String s) { title = s; return this; }
    @JsOverlay public final InputProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final InputProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final InputProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Form Events
    @JsOverlay public final InputProps onChange(FormEventHandler handler) { onChange = handler; return this; }

    // Keyboard Events
    @JsOverlay public final InputProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final InputProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final InputProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final InputProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final InputProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final InputProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final InputProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final InputProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final InputProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final InputProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final InputProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final InputProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final InputProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final InputProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final InputProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final InputProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final InputProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final InputProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final InputProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final InputProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final InputProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final InputProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final InputProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final InputProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final InputProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
