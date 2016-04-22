package gwt.react.client.proptypes.html;

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

    @JsOverlay public final AudioProps autoPlay(boolean b) { setAutoPlay(b); return this; }
    @JsOverlay public final AudioProps controls(boolean b) { setControls(b); return this; }
    @JsOverlay public final AudioProps loop(boolean b) { setLoop(b); return this; }
    @JsOverlay public final AudioProps muted(boolean b) { setMuted(b); return this; }
    @JsOverlay public final AudioProps preLoad(AudioPreload s) { setPreload(s.name()); return this; }
    @JsOverlay public final AudioProps src(String s) { setSrc(s); return this; }

    //React Specific
    @JsOverlay public final AudioProps ref(String s) { ref = s; return this; }
    @JsOverlay public final AudioProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final AudioProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final AudioProps accessKey(String s) { setAccessKey(s);return this;}
    @JsOverlay public final AudioProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final AudioProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final AudioProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final AudioProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final AudioProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final AudioProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final AudioProps id(String s) { setId(s); return this; }
    @JsOverlay public final AudioProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final AudioProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final AudioProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final AudioProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final AudioProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final AudioProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final AudioProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final AudioProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final AudioProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final AudioProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final AudioProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final AudioProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final AudioProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final AudioProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final AudioProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final AudioProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final AudioProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final AudioProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final AudioProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final AudioProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final AudioProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final AudioProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final AudioProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final AudioProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final AudioProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final AudioProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final AudioProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final AudioProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final AudioProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final AudioProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final AudioProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final AudioProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final AudioProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
