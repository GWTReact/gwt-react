package gwt.react.client.proptypes.html;

import elemental2.dom.HTMLImageElement;
import gwt.react.client.api.ReactRef;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for img elements. Refer to http://www.w3schools.com/tags/tag_img.asp
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ImgProps extends HtmlGlobalFields {

    @JsOverlay public final ImgProps alt(String s) { alt = s; return this;}
    @JsOverlay public final ImgProps crossOrigin(String s) { crossOrigin = s; return this;}
    @JsOverlay public final ImgProps height(int i) { height = Integer.toString(i); return this; }
    @JsOverlay public final ImgProps src(String s) { src = s; return this;}
    @JsOverlay public final ImgProps useMap(String s) { useMap = s; return this; }
    @JsOverlay public final ImgProps width(int i) { width = Integer.toString(i); return this; }

    //React Specific

    @Deprecated @JsOverlay public final ImgProps ref(String s) { ref = s; return this; }
    @JsOverlay public final ImgProps ref(ReactRefCallback callback) { ref = callback; return this; }
	@JsOverlay public final ImgProps ref(ReactRef<HTMLImageElement> reactRef) { ref = reactRef; return this; }
    @JsOverlay public final ImgProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final ImgProps accessKey(String s) { accessKey = s; return this;}
    @JsOverlay public final ImgProps className(String s) { className = s; return this; }
    @JsOverlay public final ImgProps contentEditable(boolean b) { contentEditable = b; return this; }
    @JsOverlay public final ImgProps contextMenu(String s) { contextMenu = s; return this; }
    @JsOverlay public final ImgProps dir(String s) { dir = s; return this; }
    @JsOverlay public final ImgProps draggable(boolean b) { draggable = b; return this; }
    @JsOverlay public final ImgProps hidden(boolean b) { hidden = b; return this; }
    @JsOverlay public final ImgProps id(String s) { id = s; return this; }
    @JsOverlay public final ImgProps lang(String s) { lang = s; return this; }
    @JsOverlay public final ImgProps spellcheck(boolean b) { spellCheck = b; return this; }
    @JsOverlay public final ImgProps style(CssProps s) { style = s; return this; }
    @JsOverlay public final ImgProps tabIndex(int i) { tabIndex = i; return this; }
    @JsOverlay public final ImgProps title(String s) { title = s; return this; }
    @JsOverlay public final ImgProps translate(YesNo s) { translate = s.name(); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final ImgProps onBlur(FocusEventHandler handler) { onBlur = handler; return this; }
    @JsOverlay public final ImgProps onFocus(FocusEventHandler handler) { onFocus = handler; return this; }

    // Image Events
    @JsOverlay public final ImgProps onLoad(ReactEventHandler handler) { onLoad = handler; return this; }
    @JsOverlay public final ImgProps onError(ReactEventHandler handler) { onError = handler; return this; }

    // Keyboard Events
    @JsOverlay public final ImgProps onKeyDown(KeyboardEventHandler handler) { onKeyDown = handler; return this; }
    @JsOverlay public final ImgProps onKeyPress(KeyboardEventHandler handler) { onKeyPress = handler; return this; }
    @JsOverlay public final ImgProps onKeyUp(KeyboardEventHandler handler) { onKeyUp = handler; return this; }

    // Media Events
    @JsOverlay public final ImgProps onAbort(ReactEventHandler handler) { onAbort = handler; return this;}
    @JsOverlay public final ImgProps onCanPlay(ReactEventHandler handler) { onCanPlay = handler; return this;}
    @JsOverlay public final ImgProps onCanPlayThrough(ReactEventHandler handler) { onCanPlayThrough = handler; return this;}
    @JsOverlay public final ImgProps onDurationChange(ReactEventHandler handler) { onDurationChange = handler; return this;}
    @JsOverlay public final ImgProps onEmptied(ReactEventHandler handler) { onEmptied = handler; return this;}
    @JsOverlay public final ImgProps onEncrypted(ReactEventHandler handler) { onEncrypted = handler; return this; }
    @JsOverlay public final ImgProps onEnded(ReactEventHandler handler) { onEnded = handler; return this; }
    @JsOverlay public final ImgProps onLoadedData(ReactEventHandler handler) { onLoadedData = handler; return this; }
    @JsOverlay public final ImgProps onLoadedMetadata(ReactEventHandler handler) { onLoadedMetadata = handler; return this; }
    @JsOverlay public final ImgProps onLoadStart(ReactEventHandler handler) { onLoadStart = handler; return this; }
    @JsOverlay public final ImgProps onPause(ReactEventHandler handler) { onPause = handler; return this; }
    @JsOverlay public final ImgProps onPlay(ReactEventHandler handler) { onPlay = handler; return this; }
    @JsOverlay public final ImgProps onPlaying(ReactEventHandler handler) { onPlaying = handler; return this; }
    @JsOverlay public final ImgProps onProgress(ReactEventHandler handler) { onProgress = handler; return this; }
    @JsOverlay public final ImgProps onRateChange(ReactEventHandler handler) { onRateChange = handler; return this; }
    @JsOverlay public final ImgProps onSeeked(ReactEventHandler handler) { onSeeked = handler; return this; }
    @JsOverlay public final ImgProps onSeeking(ReactEventHandler handler) { onSeeking = handler; return this; }
    @JsOverlay public final ImgProps onStalled(ReactEventHandler handler) { onStalled = handler; return this; }
    @JsOverlay public final ImgProps onSuspend(ReactEventHandler handler) { onSuspend = handler; return this; }
    @JsOverlay public final ImgProps onTimeUpdate(ReactEventHandler handler) { onTimeUpdate = handler; return this; }
    @JsOverlay public final ImgProps onVolumeChange(ReactEventHandler handler) { onVolumeChange = handler; return this; }
    @JsOverlay public final ImgProps onWaiting(ReactEventHandler handler) { onWaiting = handler; return this; }

    // MouseEvents
    @JsOverlay public final ImgProps onClick(MouseEventHandler handler) { onClick = handler; return this; }
    @JsOverlay public final ImgProps onContextMenu(MouseEventHandler handler) { onContextMenu = handler; return this; }
    @JsOverlay public final ImgProps onDoubleClick(MouseEventHandler handler) { onDoubleClick = handler; return this; }
    @JsOverlay public final ImgProps onDrag(DragEventHandler handler) { onDrag = handler; return this; }
    @JsOverlay public final ImgProps onDragEnd(DragEventHandler handler) { onDragEnd = handler; return this; }
    @JsOverlay public final ImgProps onDragEnter(DragEventHandler handler) { onDragEnter = handler; return this; }
    @JsOverlay public final ImgProps onDragExit(DragEventHandler handler) { onDragExit = handler; return this; }
    @JsOverlay public final ImgProps onDragLeave(DragEventHandler handler) { onDragLeave = handler; return this; }
    @JsOverlay public final ImgProps onDragOver(DragEventHandler handler) { onDragOver = handler; return this; }
    @JsOverlay public final ImgProps onDragStart(DragEventHandler handler) { onDragStart = handler; return this; }
    @JsOverlay public final ImgProps onDrop(DragEventHandler handler) { onDrop = handler; return this; }
    @JsOverlay public final ImgProps onMouseDown(MouseEventHandler handler) { onMouseDown = handler; return this; }
    @JsOverlay public final ImgProps onMouseEnter(MouseEventHandler handler) { onMouseEnter = handler; return this; }
    @JsOverlay public final ImgProps onMouseLeave(MouseEventHandler handler) { onMouseLeave = handler; return this; }
    @JsOverlay public final ImgProps onMouseMove(MouseEventHandler handler) { onMouseMove = handler; return this; }
    @JsOverlay public final ImgProps onMouseOut(MouseEventHandler handler) { onMouseOut = handler; return this; }
    @JsOverlay public final ImgProps onMouseOver(MouseEventHandler handler) { onMouseOver = handler; return this; }
    @JsOverlay public final ImgProps onMouseUp(MouseEventHandler handler) { onMouseUp = handler; return this; }

    // Touch Events
    @JsOverlay public final ImgProps onTouchCancel(TouchEventHandler handler) { onTouchCancel = handler; return this; }
    @JsOverlay public final ImgProps onTouchEnd(TouchEventHandler handler) { onTouchEnd = handler; return this; }
    @JsOverlay public final ImgProps onTouchMove(TouchEventHandler handler) { onTouchMove = handler; return this; }
    @JsOverlay public final ImgProps onTouchStart(TouchEventHandler handler) { onTouchStart = handler; return this; }
}
