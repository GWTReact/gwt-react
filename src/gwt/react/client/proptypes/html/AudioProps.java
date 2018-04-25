package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLAudioElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.AudioPreload;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for audio elements. Refer to http://www.w3schools.com/tags/tag_audio.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AudioProps extends HtmlGlobalFields {

    @JsOverlay public final AudioProps autoPlay(boolean b) { autoPlay = b; return this; }
    @JsOverlay public final AudioProps controls(boolean b) { controls = b; return this; }
    @JsOverlay public final AudioProps loop(boolean b) { loop = b; return this; }
    @JsOverlay public final AudioProps muted(boolean b) { muted = b; return this; }
    @JsOverlay public final AudioProps preLoad(AudioPreload s) { preload = s.name(); return this; }
    @JsOverlay public final AudioProps src(String s) { src = s; return this; }

    //React Specific
    @Deprecated @JsOverlay public final AudioProps ref(String s) { ref = s; return this; }
    @JsOverlay public final AudioProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final AudioProps ref(ReactRef<HTMLAudioElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final AudioProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final AudioProps accessKey(String s) { accessKey = s;return this;}
    @JsOverlay public final AudioProps className(String s) { className = s; return this; }
    @JsOverlay public final AudioProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final AudioProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final AudioProps dir(String s) { dir = s; return this; }
    @JsOverlay public final AudioProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final AudioProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final AudioProps id(String s) { id = s; return this; }
    @JsOverlay public final AudioProps lang(String s) { lang = s; return this; }
    @JsOverlay public final AudioProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final AudioProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final AudioProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final AudioProps title(String s) { title = s; return this; }
    @JsOverlay public final AudioProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final AudioProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final AudioProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Keyboard Events
    @JsOverlay public final AudioProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final AudioProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final AudioProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    @JsOverlay public final AudioProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final AudioProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final AudioProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final AudioProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final AudioProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final AudioProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final AudioProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final AudioProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final AudioProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final AudioProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final AudioProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final AudioProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final AudioProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final AudioProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final AudioProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final AudioProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final AudioProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final AudioProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final AudioProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final AudioProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final AudioProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final AudioProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
