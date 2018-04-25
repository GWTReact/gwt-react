package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLIFrameElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for input elements. Refer to http://www.w3schools.com/tags/tag_iframe.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IFrameProps extends HtmlGlobalFields {

    @JsOverlay public final IFrameProps height(int i) { height = Integer.toString(i); return this; }
    @JsOverlay public final IFrameProps name(String s) { name = s; return this; }
    @JsOverlay public final IFrameProps src(String s) { src = s; return this; }
    @JsOverlay public final IFrameProps sandbox(String s) { sandbox = s; return this; }
    @JsOverlay public final IFrameProps width(int i) { width = Integer.toString(i); return this; }
    @JsOverlay public final IFrameProps frameBorder(String s) { frameBorder = s; return this; }

    //React Specific
	@Deprecated @JsOverlay public final IFrameProps ref(String s) { ref = s; return this; }
    @JsOverlay public final IFrameProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final IFrameProps ref(ReactRef<HTMLIFrameElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final IFrameProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final IFrameProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final IFrameProps className(String s) { className = s; return this; }
    @JsOverlay public final IFrameProps className(String s, String s2) { className = s + " " + s2; return this; }
    @JsOverlay public final IFrameProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final IFrameProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final IFrameProps dir(String s) { dir = s; return this; }
    @JsOverlay public final IFrameProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final IFrameProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final IFrameProps id(String s) { id = s; return this; }
    @JsOverlay public final IFrameProps lang(String s) { lang = s; return this; }
    @JsOverlay public final IFrameProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final IFrameProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final IFrameProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final IFrameProps title(String s) { title = s; return this; }
    @JsOverlay public final IFrameProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    //TODO refine
    // Focus Events
    @JsOverlay public final IFrameProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final IFrameProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final IFrameProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final IFrameProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final IFrameProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final IFrameProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final IFrameProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final IFrameProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final IFrameProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final IFrameProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final IFrameProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final IFrameProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final IFrameProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final IFrameProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final IFrameProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final IFrameProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final IFrameProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final IFrameProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final IFrameProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final IFrameProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final IFrameProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final IFrameProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final IFrameProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final IFrameProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final IFrameProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final IFrameProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final IFrameProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
