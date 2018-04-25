package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLLabelElement;
import gwt.react.client.api.ReactRef;
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

    @JsOverlay public final LabelProps HtmlFor(String s) { htmlFor = s; return this; }
    @JsOverlay public final LabelProps form(String s) { form = s; return this; }

    //React Specific
    @Deprecated @JsOverlay public final LabelProps ref(String s) { ref = s; return this; }
    @JsOverlay public final LabelProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final LabelProps ref(ReactRef<HTMLLabelElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final LabelProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final LabelProps AccessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final LabelProps ClassName(String s) { className = s; return this; }
    @JsOverlay public final LabelProps ContentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final LabelProps ContextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final LabelProps Dir(String s) { dir = s; return this; }
    @JsOverlay public final LabelProps Draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final LabelProps Hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final LabelProps Id(String s) { id = s; return this; }
    @JsOverlay public final LabelProps Lang(String s) { lang = s; return this; }
    @JsOverlay public final LabelProps Spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final LabelProps Style(CssProps s) { style = s; return this; }
    @JsOverlay public final LabelProps TabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final LabelProps Title(String s) { title = s; return this; }
    @JsOverlay public final LabelProps Translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    //TODO Refine
    // Focus Events
    @JsOverlay public final LabelProps OnBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final LabelProps OnFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final LabelProps OnKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final LabelProps OnKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final LabelProps OnKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final LabelProps OnClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final LabelProps OnContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final LabelProps OnDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final LabelProps OnDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final LabelProps OnDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final LabelProps OnDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final LabelProps OnDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final LabelProps OnDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final LabelProps OnDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final LabelProps OnDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final LabelProps OnDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final LabelProps OnMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final LabelProps OnMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final LabelProps OnMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final LabelProps OnMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final LabelProps OnMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final LabelProps OnMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final LabelProps OnMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final LabelProps OnTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final LabelProps OnTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final LabelProps OnTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final LabelProps OnTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
