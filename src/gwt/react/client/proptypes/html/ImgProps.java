package gwt.react.client.proptypes.html;

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

    @JsOverlay public final ImgProps alt(String s) { setAlt(s); return this;}
    @JsOverlay public final ImgProps crossOrigin(String s) { setCrossOrigin(s); return this;}
    @JsOverlay public final ImgProps height(int i) { setHeight(Integer.toString(i)); return this; }
    @JsOverlay public final ImgProps src(String s) { setSrc(s); return this;}
    @JsOverlay public final ImgProps useMap(String s) { setUseMap(s); return this; }
    @JsOverlay public final ImgProps width(int i) { setWidth(Integer.toString(i)); return this; }

    //React Specific

    @JsOverlay public final ImgProps ref(String s) { ref = s; return this; }
    @JsOverlay public final ImgProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final ImgProps key(String s) { key = s; return this; }

    //Global HTML props
    @JsOverlay public final ImgProps accessKey(String s) { setAccessKey(s); return this;}
    @JsOverlay public final ImgProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final ImgProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final ImgProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final ImgProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final ImgProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final ImgProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final ImgProps id(String s) { setId(s); return this; }
    @JsOverlay public final ImgProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final ImgProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final ImgProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final ImgProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final ImgProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final ImgProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final ImgProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final ImgProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Image Events
    @JsOverlay public final ImgProps onLoad(ReactEventHandler handler) { setOnLoad(handler); return this; }
    @JsOverlay public final ImgProps onError(ReactEventHandler handler) { setOnError(handler); return this; }

    // Keyboard Events
    @JsOverlay public final ImgProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final ImgProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final ImgProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    // Media Events
    @JsOverlay public final ImgProps onAbort(ReactEventHandler handler) { setOnAbort(handler); return this;}
    @JsOverlay public final ImgProps onCanPlay(ReactEventHandler handler) { setOnCanPlay(handler); return this;}
    @JsOverlay public final ImgProps onCanPlayThrough(ReactEventHandler handler) { setOnCanPlayThrough(handler); return this;}
    @JsOverlay public final ImgProps onDurationChange(ReactEventHandler handler) { setOnDurationChange(handler); return this;}
    @JsOverlay public final ImgProps onEmptied(ReactEventHandler handler) { setOnEmptied(handler); return this;}
    @JsOverlay public final ImgProps onEncrypted(ReactEventHandler handler) { setOnEncrypted(handler); return this; }
    @JsOverlay public final ImgProps onEnded(ReactEventHandler handler) { setOnEnded(handler); return this; }
    @JsOverlay public final ImgProps onLoadedData(ReactEventHandler handler) { setOnLoadedData(handler); return this; }
    @JsOverlay public final ImgProps onLoadedMetadata(ReactEventHandler handler) { setOnLoadedMetadata(handler); return this; }
    @JsOverlay public final ImgProps onLoadStart(ReactEventHandler handler) { setOnLoadStart(handler); return this; }
    @JsOverlay public final ImgProps onPause(ReactEventHandler handler) { setOnPause(handler); return this; }
    @JsOverlay public final ImgProps onPlay(ReactEventHandler handler) { setOnPlay(handler); return this; }
    @JsOverlay public final ImgProps onPlaying(ReactEventHandler handler) { setOnPlaying(handler); return this; }
    @JsOverlay public final ImgProps onProgress(ReactEventHandler handler) { setOnProgress(handler); return this; }
    @JsOverlay public final ImgProps onRateChange(ReactEventHandler handler) { setOnRateChange(handler); return this; }
    @JsOverlay public final ImgProps onSeeked(ReactEventHandler handler) { setOnSeeked(handler); return this; }
    @JsOverlay public final ImgProps onSeeking(ReactEventHandler handler) { setOnSeeking(handler); return this; }
    @JsOverlay public final ImgProps onStalled(ReactEventHandler handler) { setOnStalled(handler); return this; }
    @JsOverlay public final ImgProps onSuspend(ReactEventHandler handler) { setOnSuspend(handler); return this; }
    @JsOverlay public final ImgProps onTimeUpdate(ReactEventHandler handler) { setOnTimeUpdate(handler); return this; }
    @JsOverlay public final ImgProps onVolumeChange(ReactEventHandler handler) { setOnVolumeChange(handler); return this; }
    @JsOverlay public final ImgProps onWaiting(ReactEventHandler handler) { setOnWaiting(handler); return this; }

    // MouseEvents
    @JsOverlay public final ImgProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final ImgProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final ImgProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final ImgProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final ImgProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final ImgProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final ImgProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final ImgProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final ImgProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final ImgProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final ImgProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final ImgProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final ImgProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final ImgProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final ImgProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final ImgProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final ImgProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final ImgProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final ImgProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final ImgProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final ImgProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final ImgProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
