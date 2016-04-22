package gwt.react.client.proptypes.html;

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

    @JsOverlay public final InputProps accept(String s) { setAccept(s); return this; }
    @JsOverlay public final InputProps alt(String s) { setAlt(s); return this; }
    @JsOverlay public final InputProps async(boolean b) { setAsync(b); return this; }
    @JsOverlay public final InputProps autoComplete(OnOff s) { setAutoComplete(s.name()); return this; }
    @JsOverlay public final InputProps autoFocus(boolean b) { setAutoFocus(b); return this; }
    @JsOverlay public final InputProps checked(boolean b) { setChecked(b); return this; }
    @JsOverlay public final InputProps disabled(boolean b) { setDisabled(b); return this; }
    @JsOverlay public final InputProps form(String s) { setForm(s); return this; }
    @JsOverlay public final InputProps formAction(String s) { setFormAction(s); return this; }
    @JsOverlay public final InputProps formEncType(String s) { setFormEncType(s); return this; }
    @JsOverlay public final InputProps formMethod(String s) { setFormMethod(s); return this; }
    @JsOverlay public final InputProps formNoValidate(boolean b) { setFormNoValidate(b); return this; }
    @JsOverlay public final InputProps formTarget(String s) { setFormTarget(s); return this; }
    @JsOverlay public final InputProps height(String s) { setHeight(s); return this; }
    @JsOverlay public final InputProps list(String s) { setList(s); return this; }
    @JsOverlay public final InputProps max(String s) { setMax(s); return this; }
    @JsOverlay public final InputProps maxLength(int b) { setMaxLength(b); return this; }
    @JsOverlay public final InputProps min(String s) { setMin(s); return this; }
    @JsOverlay public final InputProps multiple(boolean b) { setMultiple(b); return this; }
    @JsOverlay public final InputProps name(String s) { setName(s); return this; }
    @JsOverlay public final InputProps placeHolder(String s) { setPlaceholder(s); return this; }
    @JsOverlay public final InputProps readonly(boolean b) { setReadOnly(b); return this; }
    @JsOverlay public final InputProps required(boolean b) { setRequired(b); return this; }
    @JsOverlay public final InputProps size(int b) { setSize(b); return this; }
    @JsOverlay public final InputProps src(String s) { setSrc(s); return this; }
    @JsOverlay public final InputProps step(String s) { setStep(s); return this; }
    @JsOverlay public final InputProps type(InputType t) { setType(t.name()); return this; }
    @JsOverlay public final InputProps value(String s) { setValue(s); return this; }
    @JsOverlay public final InputProps width(int i) { setWidth(Integer.toString(i)); return this; }

    //React Specific

    @JsOverlay public final InputProps defaultChecked(boolean b) { setDefaultChecked(b); return this; };
    @JsOverlay public final InputProps defaultValue(String s) { setDefaultValue(s); return this; }
    @JsOverlay public final InputProps ref(String s) { ref = s; return this; }
    @JsOverlay public final InputProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final InputProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final InputProps accessKey(String s) { setAccessKey(s);return this;}
    @JsOverlay public final InputProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final InputProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final InputProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final InputProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final InputProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final InputProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final InputProps id(String s) { setId(s); return this; }
    @JsOverlay public final InputProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final InputProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final InputProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final InputProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final InputProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final InputProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final InputProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final InputProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Form Events
    @JsOverlay public final InputProps onChange(FormEventHandler handler) { setOnChange(handler); return this; }

    // Keyboard Events
    @JsOverlay public final InputProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final InputProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final InputProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final InputProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final InputProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final InputProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final InputProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final InputProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final InputProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final InputProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final InputProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final InputProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final InputProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final InputProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final InputProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final InputProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final InputProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final InputProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final InputProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final InputProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final InputProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final InputProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final InputProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final InputProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final InputProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
