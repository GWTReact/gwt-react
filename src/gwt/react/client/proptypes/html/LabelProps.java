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

    @JsOverlay public final LabelProps htmlFor(String s) { htmlFor = s; return this; }
    @JsOverlay public final LabelProps form(String s) { form = s; return this; }

    //React Specific
    @Deprecated @JsOverlay public final LabelProps ref(String s) { ref = s; return this; }
    @JsOverlay public final LabelProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final LabelProps ref(ReactRef<HTMLLabelElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final LabelProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final LabelProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final LabelProps className(String s) { className = s; return this; }
    @JsOverlay public final LabelProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final LabelProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final LabelProps dir(String s) { dir = s; return this; }
    @JsOverlay public final LabelProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final LabelProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final LabelProps id(String s) { id = s; return this; }
    @JsOverlay public final LabelProps lang(String s) { lang = s; return this; }
    @JsOverlay public final LabelProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final LabelProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final LabelProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final LabelProps title(String s) { title = s; return this; }
    @JsOverlay public final LabelProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    //TODO Refine
    // Focus Events
    @JsOverlay public final LabelProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final LabelProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final LabelProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final LabelProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final LabelProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final LabelProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final LabelProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final LabelProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final LabelProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final LabelProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final LabelProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final LabelProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final LabelProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final LabelProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final LabelProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final LabelProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final LabelProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final LabelProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final LabelProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final LabelProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final LabelProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final LabelProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final LabelProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final LabelProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final LabelProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final LabelProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final LabelProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
