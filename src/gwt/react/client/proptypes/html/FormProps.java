package gwt.react.client.proptypes.html;

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

    @JsOverlay public final FormProps acceptCharset(String s) { setAcceptCharset(s); return this; }
    @JsOverlay public final FormProps action(String s) { setAction(s); return this; }
    @JsOverlay public final FormProps autoComplete(OnOff s) { setAutoComplete(s.name()); return this; }
    @JsOverlay public final FormProps formEncType(String s) { setFormEncType(s); return this; }
    @JsOverlay public final FormProps formMethod(FormMethod s) { setFormMethod(s.name()); return this; }
    @JsOverlay public final FormProps name(String s) { setName(s); return this; }
    @JsOverlay public final FormProps formNoValidate(boolean b) { setFormNoValidate(b); return this; }
    @JsOverlay public final FormProps formTarget(Target t) { setFormTarget(t.name()); return this; }
    @JsOverlay public final FormProps formTarget(String s) { setFormTarget(s); return this; }

    //React Specific
    @JsOverlay public final FormProps ref(String s) { ref = s; return this; }
    @JsOverlay public final FormProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final FormProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final FormProps accessKey(String s) { setAccessKey(s);return this;}
    @JsOverlay public final FormProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final FormProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final FormProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final FormProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final FormProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final FormProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final FormProps id(String s) { setId(s); return this; }
    @JsOverlay public final FormProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final FormProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final FormProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final FormProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final FormProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final FormProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final FormProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final FormProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Form Events
    @JsOverlay public final FormProps onChange(FormEventHandler handler) { setOnChange(handler); return this; }
    @JsOverlay public final FormProps onInput(FormEventHandler handler) { setOnInput(handler); return this; }
    @JsOverlay public final FormProps onSubmit(FormEventHandler handler) { setOnSubmit(handler); return this; }

    // Keyboard Events
    @JsOverlay public final FormProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final FormProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final FormProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final FormProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final FormProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final FormProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final FormProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final FormProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final FormProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final FormProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final FormProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final FormProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final FormProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final FormProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final FormProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final FormProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final FormProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final FormProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final FormProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final FormProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final FormProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final FormProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final FormProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final FormProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final FormProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
