package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for input elements. Refer to http://www.w3schools.com/tags/tag_label.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class LabelProps extends HtmlGlobalFields {

    @JsOverlay public final LabelProps HtmlFor(String s) { setHtmlFor(s); return this; }
    @JsOverlay public final LabelProps form(String s) { setForm(s); return this; }

    //React Specific
    @JsOverlay public final LabelProps ref(String s) { ref = s; return this; }
    @JsOverlay public final LabelProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final LabelProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final LabelProps AccessKey(String s) { setAccessKey(s); return this;}
    @JsOverlay public final LabelProps ClassName(String s) { setClassName(s); return this; }
    @JsOverlay public final LabelProps ContentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final LabelProps ContextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final LabelProps Dir(String s) { setDir(s); return this; }
    @JsOverlay public final LabelProps Draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final LabelProps Hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final LabelProps Id(String s) { setId(s); return this; }
    @JsOverlay public final LabelProps Lang(String s) { setLang(s); return this; }
    @JsOverlay public final LabelProps Spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final LabelProps Style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final LabelProps TabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final LabelProps Title(String s) { setTitle(s); return this; }
    @JsOverlay public final LabelProps Translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    //TODO Refine
    // Focus Events
    @JsOverlay public final LabelProps OnBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final LabelProps OnFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final LabelProps OnKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final LabelProps OnKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final LabelProps OnKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final LabelProps OnClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final LabelProps OnContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final LabelProps OnDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final LabelProps OnDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final LabelProps OnDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final LabelProps OnDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final LabelProps OnDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final LabelProps OnDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final LabelProps OnDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final LabelProps OnDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final LabelProps OnDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final LabelProps OnMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final LabelProps OnMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final LabelProps OnMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final LabelProps OnMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final LabelProps OnMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final LabelProps OnMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final LabelProps OnMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final LabelProps OnTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final LabelProps OnTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final LabelProps OnTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final LabelProps OnTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
