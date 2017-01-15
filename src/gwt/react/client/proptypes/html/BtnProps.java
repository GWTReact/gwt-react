package gwt.react.client.proptypes.html;

import gwt.react.client.events.DragEventHandler;
import gwt.react.client.events.FocusEventHandler;
import gwt.react.client.events.FormEventHandler;
import gwt.react.client.events.KeyboardEventHandler;
import gwt.react.client.events.MouseEventHandler;
import gwt.react.client.events.TouchEventHandler;
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

    @JsOverlay public final BtnProps autoFocus(boolean b) { setAutoFocus(b); return this; }
    @JsOverlay public final BtnProps disabled(boolean b) { setDisabled(b); return this; }
    @JsOverlay public final BtnProps from(String s) { setForm(s); return this; }
    @JsOverlay public final BtnProps formAction(String s) { setFormAction(s); return this; }
    @JsOverlay public final BtnProps formEncType(String s) { setFormEncType(s); return this; }
    @JsOverlay public final BtnProps formMethod(String s) { setFormMethod(s); return this; }
    @JsOverlay public final BtnProps formNoValidate(boolean b) { setFormNoValidate(b); return this; }
    @JsOverlay public final BtnProps formTarget(String s) { setFormTarget(s); return this; }
    @JsOverlay public final BtnProps name(String s) { setName(s); return this; }
    @JsOverlay public final BtnProps type(ButtonType t) { setType(t.name()); return this; }
    @JsOverlay public final BtnProps value(String s) { setValue(s); return this; }

    //React Specific

    @JsOverlay public final BtnProps defaultChecked(boolean b) { setDefaultChecked(b); return this; }
    @JsOverlay public final BtnProps defaultValue(String s) { setDefaultValue(s); return this; }
    @JsOverlay public final BtnProps ref(String s) { ref = s; return this; }
    @JsOverlay public final BtnProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final BtnProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final BtnProps accessKey(String s) { setAccessKey(s);return this;}
    @JsOverlay public final BtnProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final BtnProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final BtnProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final BtnProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final BtnProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final BtnProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final BtnProps id(String s) { setId(s); return this; }
    @JsOverlay public final BtnProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final BtnProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final BtnProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final BtnProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final BtnProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final BtnProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final BtnProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final BtnProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Form Events
    @JsOverlay public final BtnProps onSubmit(FormEventHandler handler) { setOnSubmit(handler); return this; }

    // Keyboard Events
    @JsOverlay public final BtnProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final BtnProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final BtnProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final BtnProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final BtnProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final BtnProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final BtnProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final BtnProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final BtnProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final BtnProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final BtnProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final BtnProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final BtnProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final BtnProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final BtnProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final BtnProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final BtnProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final BtnProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final BtnProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final BtnProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final BtnProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final BtnProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final BtnProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final BtnProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final BtnProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
