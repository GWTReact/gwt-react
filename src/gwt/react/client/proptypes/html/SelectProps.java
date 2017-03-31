package gwt.react.client.proptypes.html;

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

    @JsOverlay public final SelectProps autoFocus(boolean b) { setAutoFocus(b); return this; }
    @JsOverlay public final SelectProps disabled(boolean b) { setDisabled(b); return this; }
    @JsOverlay public final SelectProps form(String s) { setForm(s); return this; }
    @JsOverlay public final SelectProps multiple(boolean b) { setMultiple(b); return this; }
    @JsOverlay public final SelectProps name(String s) { setName(s); return this; }
    @JsOverlay public final SelectProps required(boolean b) { setRequired(b); return this; }
    @JsOverlay public final SelectProps size(int b) { setSize(b); return this; }
    @JsOverlay public final SelectProps value(String s) { setValue(s); return this; }
    @JsOverlay public final SelectProps defaultValue(String s) { setDefaultValue(s); return this; }

    //React Specific
    @JsOverlay public final SelectProps ref(String s) { ref = s; return this; }
    @JsOverlay public final SelectProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final SelectProps key(String s) { key = s; return this; }


    //Global HTML props
    @JsOverlay public final SelectProps accessKey(String s) { setAccessKey(s); return this;}
    @JsOverlay public final SelectProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final SelectProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final SelectProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final SelectProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final SelectProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final SelectProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final SelectProps id(String s) { setId(s); return this; }
    @JsOverlay public final SelectProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final SelectProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final SelectProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final SelectProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final SelectProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final SelectProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final SelectProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final SelectProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Form Events
    @JsOverlay public final SelectProps onChange(FormEventHandler handler) { setOnChange(handler); return this; }

    // Keyboard Events
    @JsOverlay public final SelectProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final SelectProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final SelectProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final SelectProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final SelectProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final SelectProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final SelectProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final SelectProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final SelectProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final SelectProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final SelectProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final SelectProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final SelectProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final SelectProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final SelectProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final SelectProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final SelectProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final SelectProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final SelectProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final SelectProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final SelectProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final SelectProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final SelectProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final SelectProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final SelectProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
