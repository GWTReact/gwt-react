package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLButtonElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.ButtonType;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for button elements. Refer to http://www.w3schools.com/tags/tag_button.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class BtnProps extends HtmlGlobalFields {

    @JsOverlay public final BtnProps autoFocus(boolean b) { autoFocus = b; return this; }
    @JsOverlay public final BtnProps disabled(boolean b) { disabled = b; return this; }
    @JsOverlay public final BtnProps from(String s) { form = s; return this; }
    @JsOverlay public final BtnProps formAction(String s) { formAction = s; return this; }
    @JsOverlay public final BtnProps formEncType(String s) { formEncType = s; return this; }
    @JsOverlay public final BtnProps formMethod(String s) { formMethod = s; return this; }
    @JsOverlay public final BtnProps formNoValidate(boolean b) { formNoValidate = b; return this; }
    @JsOverlay public final BtnProps formTarget(String s) { formTarget = s; return this; }
    @JsOverlay public final BtnProps name(String s) { name = s; return this; }
    @JsOverlay public final BtnProps type(ButtonType t) { type = t.name(); return this; }
    @JsOverlay public final BtnProps value(String s) { value = s; return this; }

    //React Specific

    @JsOverlay public final BtnProps defaultChecked(boolean b) { defaultChecked = b; return this; }
    @JsOverlay public final BtnProps defaultValue(String s) { defaultValue = s; return this; }
    @Deprecated @JsOverlay public final BtnProps ref(String s) { ref = s; return this; }
    @JsOverlay public final BtnProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final BtnProps ref(ReactRef<HTMLButtonElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final BtnProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final BtnProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final BtnProps className(String s) { className = s; return this; }
    @JsOverlay public final BtnProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final BtnProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final BtnProps dir(String s) { dir = s; return this; }
    @JsOverlay public final BtnProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final BtnProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final BtnProps id(String s) { id = s; return this; }
    @JsOverlay public final BtnProps lang(String s) { lang = s; return this; }
    @JsOverlay public final BtnProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final BtnProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final BtnProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final BtnProps title(String s) { title = s; return this; }
    @JsOverlay public final BtnProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final BtnProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final BtnProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Form Events
    @JsOverlay public final BtnProps onSubmit(FormEventHandler handler) { onSubmit = handler; return this; }

    // Keyboard Events
    @JsOverlay public final BtnProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final BtnProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final BtnProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final BtnProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final BtnProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final BtnProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final BtnProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final BtnProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final BtnProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final BtnProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final BtnProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final BtnProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final BtnProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final BtnProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final BtnProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final BtnProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final BtnProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final BtnProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final BtnProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final BtnProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final BtnProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final BtnProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final BtnProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final BtnProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final BtnProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
