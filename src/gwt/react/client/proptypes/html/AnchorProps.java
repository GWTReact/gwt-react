package gwt.react.client.proptypes.html;

import gwt.react.client.events.*;
import gwt.react.client.proptypes.ReactRefCallback;
import gwt.react.client.proptypes.html.attributeTypes.YesNo;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Props for a elements. Refer to http://www.w3schools.com/tags/tag_a.asp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AnchorProps extends HtmlGlobalFields {

    @JsOverlay public final AnchorProps download(String s) { setDownload(s); return this; }
    @JsOverlay public final AnchorProps href(String s) { setHref(s); return this; }
    @JsOverlay public final AnchorProps hrefLang(String s) { setHrefLang(s); return this; }
    @JsOverlay public final AnchorProps media(String s) { setMedia(s); return this; }
    @JsOverlay public final AnchorProps rel(String s) { setRel(s); return this; }
    @JsOverlay public final AnchorProps referrerPolicy(String s) { setReferrerPolicy(s); return this; }
    @JsOverlay public final AnchorProps target(String s) { setTarget(s); return this; }
    @JsOverlay public final AnchorProps type(String t) { setType(t); return this; }

    //React Specific

    @JsOverlay public final AnchorProps ref(String s) { ref = s; return this; }
    @JsOverlay public final AnchorProps ref(ReactRefCallback callback) { ref = callback; return this; }
    @JsOverlay public final AnchorProps key(String s) { key = s; return this; }

    //Global HTML props

    @JsOverlay public final AnchorProps accessKey(String s) { setAccessKey(s);return this;}
    @JsOverlay public final AnchorProps className(String s) { setClassName(s); return this; }
    @JsOverlay public final AnchorProps contentEditable(boolean b) { setContentEditable(b); return this; }
    @JsOverlay public final AnchorProps contextMenu(String s) { setContextMenu(s); return this; }
    @JsOverlay public final AnchorProps dir(String s) { setDir(s); return this; }
    @JsOverlay public final AnchorProps draggable(boolean b) { setDraggable(b); return this; }
    @JsOverlay public final AnchorProps hidden(boolean b) { setHidden(b); return this; }
    @JsOverlay public final AnchorProps id(String s) { setId(s); return this; }
    @JsOverlay public final AnchorProps lang(String s) { setLang(s); return this; }
    @JsOverlay public final AnchorProps style(CssProps s) { setStyle(s); return this; }
    @JsOverlay public final AnchorProps spellcheck(boolean b) { setSpellCheck(b); return this; }
    @JsOverlay public final AnchorProps tabIndex(int i) { setTabIndex(i); return this; }
    @JsOverlay public final AnchorProps title(String s) { setTitle(s); return this; }
    @JsOverlay public final AnchorProps translate(YesNo s) { setTranslate(s.name()); return this; }

    //Applicable Event Handlers

    // Focus Events
    @JsOverlay public final AnchorProps onBlur(FocusEventHandler handler) { setOnBlur(handler); return this; }
    @JsOverlay public final AnchorProps onFocus(FocusEventHandler handler) { setOnFocus(handler); return this; }

    // Keyboard Events
    @JsOverlay public final AnchorProps onKeyDown(KeyboardEventHandler handler) { setOnKeyDown(handler); return this; }
    @JsOverlay public final AnchorProps onKeyPress(KeyboardEventHandler handler) { setOnKeyPress(handler); return this; }
    @JsOverlay public final AnchorProps onKeyUp(KeyboardEventHandler handler) { setOnKeyUp(handler); return this; }

    @JsOverlay public final AnchorProps onClick(MouseEventHandler handler) { setOnClick(handler); return this; }
    @JsOverlay public final AnchorProps onContextMenu(MouseEventHandler handler) { setOnContextMenu(handler); return this; }
    @JsOverlay public final AnchorProps onDoubleClick(MouseEventHandler handler) { setOnDoubleClick(handler); return this; }
    @JsOverlay public final AnchorProps onDrag(DragEventHandler handler) { setOnDrag(handler); return this; }
    @JsOverlay public final AnchorProps onDragEnd(DragEventHandler handler) { setOnDragEnd(handler); return this; }
    @JsOverlay public final AnchorProps onDragEnter(DragEventHandler handler) { setOnDragEnter(handler); return this; }
    @JsOverlay public final AnchorProps onDragExit(DragEventHandler handler) { setOnDragExit(handler); return this; }
    @JsOverlay public final AnchorProps onDragLeave(DragEventHandler handler) { setOnDragLeave(handler); return this; }
    @JsOverlay public final AnchorProps onDragOver(DragEventHandler handler) { setOnDragOver(handler); return this; }
    @JsOverlay public final AnchorProps onDragStart(DragEventHandler handler) { setOnDragStart(handler); return this; }
    @JsOverlay public final AnchorProps onDrop(DragEventHandler handler) { setOnDrop(handler); return this; }
    @JsOverlay public final AnchorProps onMouseDown(MouseEventHandler handler) { setOnMouseDown(handler); return this; }
    @JsOverlay public final AnchorProps onMouseEnter(MouseEventHandler handler) { setOnMouseEnter(handler); return this; }
    @JsOverlay public final AnchorProps onMouseLeave(MouseEventHandler handler) { setOnMouseLeave(handler); return this; }
    @JsOverlay public final AnchorProps onMouseMove(MouseEventHandler handler) { setOnMouseMove(handler); return this; }
    @JsOverlay public final AnchorProps onMouseOut(MouseEventHandler handler) { setOnMouseOut(handler); return this; }
    @JsOverlay public final AnchorProps onMouseOver(MouseEventHandler handler) { setOnMouseOver(handler); return this; }
    @JsOverlay public final AnchorProps onMouseUp(MouseEventHandler handler) { setOnMouseUp(handler); return this; }

    // Touch Events
    @JsOverlay public final AnchorProps onTouchCancel(TouchEventHandler handler) { setOnTouchCancel(handler); return this; }
    @JsOverlay public final AnchorProps onTouchEnd(TouchEventHandler handler) { setOnTouchEnd(handler); return this; }
    @JsOverlay public final AnchorProps onTouchMove(TouchEventHandler handler) { setOnTouchMove(handler); return this; }
    @JsOverlay public final AnchorProps onTouchStart(TouchEventHandler handler) { setOnTouchStart(handler); return this; }
}
