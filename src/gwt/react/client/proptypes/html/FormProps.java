package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLFormElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.FormMethod;
import gwt.react.client.proptypes.html.attributeTypes.OnOff;
import gwt.react.client.proptypes.html.attributeTypes.Target;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for form elements. Refer to http://www.w3schools.com/tags/tag_form.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FormProps extends HtmlGlobalFields {

    @JsOverlay public final FormProps acceptCharset(String s) { acceptCharset = s; return this; }
    @JsOverlay public final FormProps action(String s) { action = s; return this; }
    @JsOverlay public final FormProps autoComplete(OnOff s) { autoComplete = s.name(); return this; }
    @JsOverlay public final FormProps formEncType(String s) { formEncType = s; return this; }
    @JsOverlay public final FormProps formMethod(FormMethod s) { formMethod = s.name(); return this; }
    @JsOverlay public final FormProps name(String s) { name = s; return this; }
    @JsOverlay public final FormProps formNoValidate(boolean b) { formNoValidate = b; return this; }
    @JsOverlay public final FormProps formTarget(Target t) { formTarget = t.name(); return this; }
    @JsOverlay public final FormProps formTarget(String s) { formTarget = s; return this; }

    //React Specific
    @Deprecated @JsOverlay public final FormProps ref(String s) { ref = s; return this; }
    @JsOverlay public final FormProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final FormProps ref(ReactRef<HTMLFormElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final FormProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final FormProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final FormProps className(String s) { className = s; return this; }
    @JsOverlay public final FormProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final FormProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final FormProps dir(String s) { dir = s; return this; }
    @JsOverlay public final FormProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final FormProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final FormProps id(String s) { id = s; return this; }
    @JsOverlay public final FormProps lang(String s) { lang = s; return this; }
    @JsOverlay public final FormProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final FormProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final FormProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final FormProps title(String s) { title = s; return this; }
    @JsOverlay public final FormProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final FormProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final FormProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Form Events
    @JsOverlay public final FormProps onChange(FormEventHandler handler) { onChange = handler; return this; }
    @JsOverlay public final FormProps onInput(FormEventHandler handler) { onInput = handler; return this; }
    @JsOverlay public final FormProps onSubmit(FormEventHandler handler) { onSubmit = handler; return this; }

    // Keyboard Events
    @JsOverlay public final FormProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final FormProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final FormProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final FormProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final FormProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final FormProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final FormProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final FormProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final FormProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final FormProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final FormProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final FormProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final FormProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final FormProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final FormProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final FormProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final FormProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final FormProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final FormProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final FormProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final FormProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final FormProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final FormProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final FormProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final FormProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
