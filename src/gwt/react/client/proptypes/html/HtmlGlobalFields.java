package gwt.react.client.proptypes.html;
import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.events.*;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
@JsType(isNative= true, namespace = JsPackage.GLOBAL, name = "Object")
public class HtmlGlobalFields extends BaseProps {

    @JsOverlay public final void setDangerouslyInnerHTML(String __html) {
        JsPlainObj o = new JsPlainObj();
        o.set("__html", __html);
        protectedDangerouslySetInnerHTML = o;
    }

    @JsProperty(name="dangerouslySetInnerHTML") protected Object protectedDangerouslySetInnerHTML;

    //React Specific
    @JsProperty public boolean defaultChecked;
    @JsProperty public String defaultValue;

    // Standard HTML Attributes
    @JsProperty public String accept;
    @JsProperty public String acceptCharset;
    @JsProperty public String accessKey;
    @JsProperty public String action;
    @JsProperty public boolean allowFullScreen;
    @JsProperty public boolean allowTransparency;
    @JsProperty public String alt;
    @JsProperty public boolean async;
    @JsProperty public String autoComplete;
    @JsProperty public boolean autoFocus;
    @JsProperty public boolean autoPlay;
    @JsProperty public boolean capture;
    @JsProperty public String cellPadding;
    @JsProperty public String cellSpacing;
    @JsProperty public String charSet;
    @JsProperty public String challenge;
    @JsProperty public boolean checked;
    @JsProperty public String classID;
    @JsProperty public String className;
    @JsProperty public int cols;
    @JsProperty public int colSpan;
    @JsProperty public String content;
    @JsProperty public boolean contentEditable;
    @JsProperty public String contextMenu;
    @JsProperty public boolean controls;
    @JsProperty public String coords;
    @JsProperty public String crossOrigin;
    @JsProperty public String data;
    @JsProperty public String dateTime;
    @JsProperty public boolean defer;
    @JsProperty public String dir;
    @JsProperty public boolean disabled;
    @JsProperty public String download;
    @JsProperty public boolean draggable;
    @JsProperty public String encType;
    @JsProperty public String form;
    @JsProperty public String formAction;
    @JsProperty public String formEncType;
    @JsProperty public String formMethod;
    @JsProperty public boolean formNoValidate;
    @JsProperty public String formTarget;
    @JsProperty public String frameBorder;
    @JsProperty public String headers;
    @JsProperty public String height;
    @JsProperty public boolean hidden;
    @JsProperty public int high;
    @JsProperty public String href;
    @JsProperty public String hrefLang;
    @JsProperty public String htmlFor;
    @JsProperty public String httpEquiv;
    @JsProperty public String icon;
    @JsProperty public String id;
    @JsProperty public String inputMode;
    @JsProperty public String integrity;
    @JsProperty public String is;
    @JsProperty public String keyParams;
    @JsProperty public String keyType;
    @JsProperty public String kind;
    @JsProperty public String label;
    @JsProperty public String lang;
    @JsProperty public String list;
    @JsProperty public boolean loop;
    @JsProperty public int low;
    @JsProperty public String manifest;
    @JsProperty public int marginHeight;
    @JsProperty public int marginWidth;
    @JsProperty public String max;
    @JsProperty public int maxLength;
    @JsProperty public String media;
    @JsProperty public String mediaGroup;
    @JsProperty public String method;
    @JsProperty public String min;
    @JsProperty public int minLength;
    @JsProperty public boolean multiple;
    @JsProperty public boolean muted;
    @JsProperty public String name;
    @JsProperty public boolean noValidate;
    @JsProperty public boolean open;
    @JsProperty public int optimum;
    @JsProperty public String pattern;
    @JsProperty public String placeholder;
    @JsProperty public String poster;
    @JsProperty public String preload;
    @JsProperty public String radioGroup;
    @JsProperty public boolean readOnly;
    @JsProperty public String rel;
    @JsProperty public String referrerPolicy;
    @JsProperty public boolean required;
    @JsProperty public String role;
    @JsProperty public int rows;
    @JsProperty public int rowSpan;
    @JsProperty public String sandbox;
    @JsProperty public String scope;
    @JsProperty public boolean scoped;
    @JsProperty public String scrolling;
    @JsProperty public boolean seamless;
    @JsProperty public boolean selected;
    @JsProperty public String shape;
    @JsProperty public int size;
    @JsProperty public String sizes;
    @JsProperty public int span;
    @JsProperty public boolean spellCheck;
    @JsProperty public String src;
    @JsProperty public String srcDoc;
    @JsProperty public String srcLang;
    @JsProperty public String srcSet;
    @JsProperty public int start;
    @JsProperty public String step;
    @JsProperty public CssProps style;
    @JsProperty public String summary;
    @JsProperty public int tabIndex;
    @JsProperty public String target;
    @JsProperty public String title;
    @JsProperty public String type;
    @JsProperty public String translate;
    @JsProperty public String useMap;
    @JsProperty public String value;
    @JsProperty public String width;
    @JsProperty public String wmode;
    @JsProperty public String wrap;

    // RDFa Attributes
    @JsProperty public String about;
    @JsProperty public String datatype;
    @JsProperty public String inlist;
    @JsProperty public String prefix;
    @JsProperty public String property;
    @JsProperty public String resource;
    @JsProperty public String typeof;
    @JsProperty public String vocab;

    // Non-standard Attributes
    @JsProperty public String autoCapitalize;
    @JsProperty public String autoCorrect;
    @JsProperty public String autoSave;
    @JsProperty public String color;
    @JsProperty public String itemProp;
    @JsProperty public boolean itemScope;
    @JsProperty public String itemType;
    @JsProperty public String itemID;
    @JsProperty public String itemRef;
    @JsProperty public int results;
    @JsProperty public String security;
    @JsProperty public boolean unselectable;

    // clipboard Events
    @JsProperty public ClipboardEventHandler onCopy;
    @JsProperty public ClipboardEventHandler onCut;
    @JsProperty public ClipboardEventHandler onPaste;

    // composition Events
    @JsProperty public CompositionEventHandler onCompositionEnd;
    @JsProperty public CompositionEventHandler onCompositionStart;
    @JsProperty public CompositionEventHandler onCompositionUpdate;

    // focus Events
    @JsProperty public FocusEventHandler onFocus;
    @JsProperty public FocusEventHandler onBlur;

    // form Events
    @JsProperty public FormEventHandler onChange;
    @JsProperty public FormEventHandler onInput;
    @JsProperty public FormEventHandler onSubmit;

    // Image Events
    @JsProperty public ReactEventHandler onLoad;
    @JsProperty public ReactEventHandler onError;

    // Keyboard Events
    @JsProperty public KeyboardEventHandler onKeyDown;
    @JsProperty public KeyboardEventHandler onKeyPress;
    @JsProperty public KeyboardEventHandler onKeyUp;

    // media Events
    @JsProperty public ReactEventHandler onAbort;
    @JsProperty public ReactEventHandler onCanPlay;
    @JsProperty public ReactEventHandler onCanPlayThrough;
    @JsProperty public ReactEventHandler onDurationChange;
    @JsProperty public ReactEventHandler onEmptied;
    @JsProperty public ReactEventHandler onEncrypted;
    @JsProperty public ReactEventHandler onEnded;
    @JsProperty public ReactEventHandler onLoadedData;
    @JsProperty public ReactEventHandler onLoadedMetadata;
    @JsProperty public ReactEventHandler onLoadStart;
    @JsProperty public ReactEventHandler onPause;
    @JsProperty public ReactEventHandler onPlay;
    @JsProperty public ReactEventHandler onPlaying;
    @JsProperty public ReactEventHandler onProgress;
    @JsProperty public ReactEventHandler onRateChange;
    @JsProperty public ReactEventHandler onSeeked;
    @JsProperty public ReactEventHandler onSeeking;
    @JsProperty public ReactEventHandler onStalled;
    @JsProperty public ReactEventHandler onSuspend;
    @JsProperty public ReactEventHandler onTimeUpdate;
    @JsProperty public ReactEventHandler onVolumeChange;
    @JsProperty public ReactEventHandler onWaiting;

    // MouseEvents
    @JsProperty public MouseEventHandler onClick;
    @JsProperty public MouseEventHandler onContextMenu;
    @JsProperty public MouseEventHandler onDoubleClick;
    @JsProperty public DragEventHandler onDrag;
    @JsProperty public DragEventHandler onDragEnd;
    @JsProperty public DragEventHandler onDragEnter;
    @JsProperty public DragEventHandler onDragExit;
    @JsProperty public DragEventHandler onDragLeave;
    @JsProperty public DragEventHandler onDragOver;
    @JsProperty public DragEventHandler onDragStart;
    @JsProperty public DragEventHandler onDrop;
    @JsProperty public MouseEventHandler onMouseDown;
    @JsProperty public MouseEventHandler onMouseEnter;
    @JsProperty public MouseEventHandler onMouseLeave;
    @JsProperty public MouseEventHandler onMouseMove;
    @JsProperty public MouseEventHandler onMouseOut;
    @JsProperty public MouseEventHandler onMouseOver;
    @JsProperty public MouseEventHandler onMouseUp;

    // Selection Events
    @JsProperty public ReactEventHandler onSelect;

    // Touch Events
    @JsProperty public TouchEventHandler onTouchCancel;
    @JsProperty public TouchEventHandler onTouchEnd;
    @JsProperty public TouchEventHandler onTouchMove;
    @JsProperty public TouchEventHandler onTouchStart;

    // UI Events
    @JsProperty public UIEventHandler onScroll;
    // Wheel Events
    @JsProperty public WheelEventHandler onWheel;
}