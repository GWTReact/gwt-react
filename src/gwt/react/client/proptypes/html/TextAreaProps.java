package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLTextAreaElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.OnOff;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for input elements. Refer to https://developer.mozilla.org/en-US/docs/Web/HTML/Element/textarea
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TextAreaProps extends HtmlGlobalFields {

    @JsOverlay public final TextAreaProps autoComplete(OnOff s) { autoComplete = s.name(); return this; }
    @JsOverlay public final TextAreaProps autoFocus(boolean b) { autoFocus = b; return this; }
    @JsOverlay public final TextAreaProps cols(int b) { cols = b; return this; }
    @JsOverlay public final TextAreaProps disabled(boolean b) { disabled = b; return this; }
    @JsOverlay public final TextAreaProps form(String s) { form = s; return this; }
    @JsOverlay public final TextAreaProps maxLength(int l) { maxLength = l; return this; }
    @JsOverlay public final TextAreaProps minLength(int l) { minLength = l; return this; }
    @JsOverlay public final TextAreaProps name(String s) { name = s; return this; }
    @JsOverlay public final TextAreaProps placeHolder(String s) { placeholder = s; return this; }
    @JsOverlay public final TextAreaProps readonly(boolean b) { readOnly = b; return this; }
    @JsOverlay public final TextAreaProps required(boolean b) { required = b; return this; }
    @JsOverlay public final TextAreaProps rows(int l) { rows = l; return this; }
    @JsOverlay public final TextAreaProps value(String s) { value = s; return this; }

    //React Specific

    @JsOverlay public final TextAreaProps defaultValue(String s) { defaultValue = s; return this; }
    @Deprecated @JsOverlay public final TextAreaProps ref(String s) { ref = s; return this; }
    @JsOverlay public final TextAreaProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final TextAreaProps ref(ReactRef<HTMLTextAreaElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final TextAreaProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final TextAreaProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final TextAreaProps className(String s) { className = s; return this; }
    @JsOverlay public final TextAreaProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final TextAreaProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final TextAreaProps dir(String s) { dir = s; return this; }
    @JsOverlay public final TextAreaProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final TextAreaProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final TextAreaProps id(String s) { id = s; return this; }
    @JsOverlay public final TextAreaProps lang(String s) { lang = s; return this; }
    @JsOverlay public final TextAreaProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final TextAreaProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final TextAreaProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final TextAreaProps title(String s) { title = s; return this; }
    @JsOverlay public final TextAreaProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final TextAreaProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final TextAreaProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Form Events
    @JsOverlay public final TextAreaProps onChange(FormEventHandler handler) { onChange = handler; return this; }

    // Keyboard Events
    @JsOverlay public final TextAreaProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final TextAreaProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final TextAreaProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final TextAreaProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final TextAreaProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final TextAreaProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final TextAreaProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final TextAreaProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final TextAreaProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final TextAreaProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final TextAreaProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final TextAreaProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final TextAreaProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final TextAreaProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final TextAreaProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final TextAreaProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final TextAreaProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final TextAreaProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final TextAreaProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
