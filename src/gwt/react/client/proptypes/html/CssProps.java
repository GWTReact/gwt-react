package gwt.react.client.proptypes.html;

import gwt.react.client.utils.ObjLiteral;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * This class represents propeties of the CSS style object.
 *
 * NOTE: this is very much a work in progress. Further refinements will include
 * defining enumerations for many of the properties
 */
@SuppressWarnings("unused")
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CssProps extends ObjLiteral {

    @JsProperty public native int getBoxFlex();
    @JsProperty public native void setBoxFlex(int boxFlex);
    

    @JsOverlay public final CssProps boxFlex(int boxFlex) {
        setBoxFlex(boxFlex);
        return this;
    }

    @JsProperty public native int getBoxFlexGroup();
    @JsProperty public native void setBoxFlexGroup(int boxFlexGroup);

    @JsOverlay public final CssProps boxFlexGroup(int boxFlexGroup) {
        setBoxFlexGroup(boxFlexGroup);
        return this;
    }

    @JsProperty public native int getColumnCount();
    @JsProperty public native void setColumnCount(int columnCount);

    @JsOverlay public final CssProps columnCount(int columnCount) {
        setColumnCount(columnCount);
        return this;
    }

    @JsProperty public native int getFlex();
    @JsProperty public native void setFlex(int flex);

    @JsOverlay public final CssProps flex(int flex) {
        setFlex(flex);
        return this;
    }

    @JsProperty public native int getFlexGrow();
    @JsProperty public native void setFlexGrow(int flexGrow);

    @JsOverlay public final CssProps flexGrow(int flexGrow) {
        setFlexGrow(flexGrow);
        return this;
    }

    @JsProperty public native int getFlexShrink();
    @JsProperty public native void setFlexShrink(int flexShrink);

    @JsOverlay public final CssProps flexShrink(int flexShrink) {
        setFlexShrink(flexShrink);
        return this;
    }

    @JsProperty public native double getFontWeight();
    @JsProperty public native void setFontWeight(double fontWeight);

    @JsOverlay public final CssProps fontWeight(double fontWeight) {
        setFontWeight(fontWeight);
        return this;
    }

    @JsProperty public native double getLineClamp();
    @JsProperty public native void setLineClamp(double lineClamp);

    @JsOverlay public final CssProps lineClamp(double lineClamp) {
        setLineClamp(lineClamp);
        return this;
    }

    @JsProperty public native String getLineHeight();
    @JsProperty public native void setLineHeight(String lineHeight);

    @JsOverlay public final CssProps lineHeight(String lineHeight) {
        setLineHeight(lineHeight);
        return this;
    }

    @JsProperty public native double getOpacity();
    @JsProperty public native void setOpacity(double opacity);

    @JsOverlay public final CssProps opacity(double opacity) {
        setOpacity(opacity);
        return this;
    }

    @JsProperty public native int getOrder();
    @JsProperty public native void setOrder(int order);

    @JsOverlay public final CssProps order(int order) {
        setOrder(order);
        return this;
    }


    @JsProperty public native int getOrphans();
    @JsProperty public native void setOrphans(int orphans);

    @JsOverlay public final CssProps orphans(int orphans) {
        setOrphans(orphans);
        return this;
    }

    @JsProperty public native int getWidows();
    @JsProperty public native void setWidows(int widows);

    @JsOverlay public final CssProps widows(int widows) {
        setWidows(widows);
        return this;
    }

    @JsProperty public native double getZIndex();
    @JsProperty public native void setZIndex(double zIndex);

    @JsOverlay public final CssProps zIndex(double zIndex) {
        setZIndex(zIndex);
        return this;
    }

    @JsProperty public native double getZoom();
    @JsProperty public native void setZoom(double zoom);

    @JsOverlay public final CssProps zoom(double zoom) {
        setZoom(zoom);
        return this;
    }

    @JsProperty public native String getFontSize();
    @JsProperty public native void setFontSize(String fontSize);

    @JsOverlay public final CssProps fontSize(String fontSize) {
        setFontSize(fontSize);
        return this;
    }

    // SVG-related properties

    @JsProperty public native double getFillOpacity();
    @JsProperty public native void setFillOpacity(double fillOpacity);

    @JsOverlay public final CssProps fillOpacity(double fillOpacity) {
        setFillOpacity(fillOpacity);
        return this;
    }

    @JsProperty public native double getStrokeOpacity();
    @JsProperty public native void setStrokeOpacity(double strokeOpacity);

    @JsOverlay public final CssProps strokeOpacity(double strokeOpacity) {
        setStrokeOpacity(strokeOpacity);
        return this;
    }

    @JsProperty public native double getStrokeWidth();
    @JsProperty public native void setStrokeWidth(double strokeWidth);

    @JsOverlay public final CssProps strokeWidth(double strokeWidth) {
        setStrokeWidth(strokeWidth);
        return this;
    }

    @JsProperty public native String getAlignContent();
    @JsProperty public native void setAlignContent(String alignContent);

    /**
     * Aligns a flex container's lines within the flex container when there is extra space in the
     * cross-axis, similar to how justify-content aligns individual items within the main-axis.
     */
    @JsOverlay public final CssProps alignContent(String alignContent) {
        setAlignContent(alignContent);
        return this;
    }


    @JsProperty public native String getAlignItems();
    @JsProperty public native void setAlignItems(String alignItems);

    /**
     * Sets the default alignment in the cross axis for all of the flex container's items,
     * including anonymous flex items, similarly to how justify-content aligns items along
     * the main axis.
     */
    @JsOverlay public final CssProps alignItems(String alignItems) {
        setAlignItems(alignItems);
        return this;
    }

    @JsProperty public native String getAlignSelf();
    @JsProperty public native void setAlignSelf(String alignSelf);

    /**
     * Allows the default alignment to be overridden for individual flex items.
     */
    @JsOverlay public final CssProps alignSelf(String alignSelf) {
        setAlignSelf(alignSelf);
        return this;
    }

    @JsProperty public native String getAlignmentAdjust();
    @JsProperty public native void setAlignmentAdjust(String alignmentAdjust);

    /**
     * This property allows precise alignment of elements, such as graphics, that do not have a
     * baseline-table or lack the desired baseline in their baseline-table. With the
     * alignment-adjust property, the position of the baseline identified by the
     * alignment-baseline can be explicitly determined. It also determines precisely the
     * alignment point for each glyph within a textual element.
     */
    @JsOverlay public final CssProps alignmentAdjust(String alignmentAdjust) {
        setAlignmentAdjust(alignmentAdjust);
        return this;
    }

    @JsProperty public native String getAlignmentBaseline();
    @JsProperty public native void setAlignmentBaseline(String alignmentBaseline);


    @JsOverlay public final CssProps alignmentBaseline(String alignmentBaseline) {
        setAlignmentBaseline(alignmentBaseline);
        return this;
    }

    @JsProperty public native String getAnimationDelay();
    @JsProperty public native void setAnimationDelay(String animationDelay);

    /**
     * Defines a length of time to elapse before an animation starts, allowing an animation to
     * begin execution some time after it is applied.
     */
    @JsOverlay public final CssProps animationDelay(String animationDelay) {
        setAnimationDelay(animationDelay);
        return this;
    }

    @JsProperty public native String getAnimationDirection();
    @JsProperty public native void setAnimationDirection(String animationDirection);

    /*
     * Defines whether an animation should run in reverse on some or all cycles.
    */
    @JsOverlay public final CssProps animationDirection(String animationDirection) {
        setAnimationDirection(animationDirection);
        return this;
    }

    @JsProperty public native String getAnimationIterationCount();
    @JsProperty public native void setAnimationIterationCount(String animationIterationCount);

    /**
     * Specifies how many times an animation cycle should play.
     */
    @JsOverlay public final CssProps animationIterationCount(String animationIterationCount) {
        setAnimationIterationCount(animationIterationCount);
        return this;
    }

    @JsProperty public native String getAnimationName();
    @JsProperty public native void setAnimationName(String animationName);

    /**
     * Defines the list of animations that apply to the element.
     */
    @JsOverlay public final CssProps animationName(String animationName) {
        setAnimationName(animationName);
        return this;
    }

    @JsProperty public native String getAnimationPlayState();
    @JsProperty public native void setAnimationPlayState(String animationPlayState);

    /**
     * Defines whether an animation is running or paused.
     */
    @JsOverlay public final CssProps animationPlayState(String animationPlayState) {
        setAnimationPlayState(animationPlayState);
        return this;
    }

    @JsProperty public native String getAppearance();
    @JsProperty public native void setAppearance(String appearance);

    /**
     * Allows changing the style of any element to platform-based interface elements or vice versa.
     */
    @JsOverlay public final CssProps appearance(String appearance) {
        setAppearance(appearance);
        return this;
    }

    @JsProperty public native String getBackfaceVisibility();
    @JsProperty public native void setBackfaceVisibility(String backfaceVisibility);

    /**
     * Determines whether or not the “back” side of a transformed element is visible when facing
     * the viewer.
     */
    @JsOverlay public final CssProps backfaceVisibility(String backfaceVisibility) {
        setBackfaceVisibility(backfaceVisibility);
        return this;
    }

    @JsProperty public native String getBackgroundBlendMode();
    @JsProperty public native void setBackgroundBlendMode(String backgroundBlendMode);

    /**
     * This property describes how the element's background images should blend with each other
     * and the element's background color. The value is a list of blend modes that corresponds
     * to each background image. Each element in the list will apply to the corresponding
     * element of background-image. If a property doesn’t have enough comma-separated values to
     * match the number of layers, the UA must calculate its used value by repeating the list of
     * values until there are enough.
     */
    @JsOverlay public final CssProps backgroundBlendMode(String backgroundBlendMode) {
        setBackgroundBlendMode(backgroundBlendMode);
        return this;
    }

    @JsProperty public native String getBackgroundComposite();
    @JsProperty public native void setBackgroundComposite(String backgroundComposite);

    @JsOverlay public final CssProps backgroundComposite(String backgroundComposite) {
        setBackgroundComposite(backgroundComposite);
        return this;
    }

    @JsProperty public native String getBackgroundImage();
    @JsProperty public native void setBackgroundImage(String backgroundImage);

    /**
     * Applies one or more background images to an element. These can be any valid CSS image,
     * including url() paths to image files or CSS gradients.
     */
    @JsOverlay public final CssProps backgroundImage(String backgroundImage) {
        setBackgroundImage(backgroundImage);
        return this;
    }

    @JsProperty public native String getBackgroundOrigin();
    @JsProperty public native void setBackgroundOrigin(String backgroundOrigin);

    /**
     * Specifies what the background-position property is relative to.
     */
    @JsOverlay public final CssProps backgroundOrigin(String backgroundOrigin) {
        setBackgroundOrigin(backgroundOrigin);
        return this;
    }

    @JsProperty public native String getBackgroundPositionX();
    @JsProperty public native void setBackgroundPositionX(String backgroundPositionX);

    /**
     * Sets the horizontal position of a background image.
     */
    @JsOverlay public final CssProps backgroundPositionX(String backgroundPositionX) {
        setBackgroundPositionX(backgroundPositionX);
        return this;
    }

    @JsProperty public native String getBackgroundRepeat();
    @JsProperty public native void setBackgroundRepeat(String backgroundRepeat);

    /**
     * Background-repeat defines if and how background images will be repeated after they have
     * been sized and positioned
     */
    @JsOverlay public final CssProps backgroundRepeat(String backgroundRepeat) {
        setBackgroundRepeat(backgroundRepeat);
        return this;
    }

    @JsProperty public native String getBorder();
    @JsProperty public native void setBorder(String border);

    /**
     * Shorthand property that defines the different properties of all four sides of an element's
     * border in a single declaration. It can be used to set border-width, border-style and
     * border-color, or a subset of these.
     */
    @JsOverlay public final CssProps border(String border) {
        setBorder(border);
        return this;
    }

    @JsProperty public native String getBorderBottomLeftRadius();
    @JsProperty public native void setBorderBottomLeftRadius(String borderBottomLeftRadius);

    /**
     * Defines the shape of the border of the bottom-left corner.
     */
    @JsOverlay public final CssProps borderBottomLeftRadius(String borderBottomLeftRadius) {
        setBorderBottomLeftRadius(borderBottomLeftRadius);
        return this;
    }

    @JsProperty public native String getBorderBottomRightRadius();
    @JsProperty public native void setBorderBottomRightRadius(String borderBottomRightRadius);

    /**
     * Defines the shape of the border of the bottom-right corner.
     */
    @JsOverlay public final CssProps borderBottomRightRadius(String borderBottomRightRadius) {
        setBorderBottomRightRadius(borderBottomRightRadius);
        return this;
    }

    @JsProperty public native String getBorderBottomWidth();
    @JsProperty public native void setBorderBottomWidth(String borderBottomWidth);

    /**
     * Sets the width of an element's bottom border. To set all four borders, use the border-width
     * shorthand property which sets the values simultaneously for border-top-width,
     * border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderBottomWidth(String borderBottomWidth) {
        setBorderBottomWidth(borderBottomWidth);
        return this;
    }

    @JsProperty public native String getBorderCollapse();
    @JsProperty public native void setBorderCollapse(String borderCollapse);

    /**
     * Border-collapse can be used for collapsing the borders between table cells
     */
    @JsOverlay public final CssProps borderCollapse(String borderCollapse) {
        setBorderCollapse(borderCollapse);
        return this;
    }

    @JsProperty public native String getBorderColor();
    @JsProperty public native void setBorderColor(String borderColor);

    /**
     * The CSS border-color property sets the color of an element's four borders. This property can
     * have from one to four values, made up of the elementary properties:
     *      •       border-top-color
     *      •       border-right-color
     *      •       border-bottom-color
     *      •       border-left-color The default color is the currentColor of each of these values.
     * If you provide one value, it sets the color for the element. Two values set the horizontal
     * and vertical values, respectively. Providing three values sets the top, vertical, and bottom
     * values, in that order. Four values set all for sides: top, right, bottom, and left, in that
     * order.
     */
    @JsOverlay public final CssProps borderColor(String borderColor) {
        setBorderColor(borderColor);
        return this;
    }

    @JsProperty public native String getBorderCornerShape();
    @JsProperty public native void setBorderCornerShape(String borderCornerShape);

    /**
     * Specifies different corner clipping effects, such as scoop (inner curves), bevel (straight
     * cuts) or notch (cut-off rectangles). Works along with border-radius to specify the size of each
     * corner effect.
     */
    @JsOverlay public final CssProps borderCornerShape(String borderCornerShape) {
        setBorderCornerShape(borderCornerShape);
        return this;
    }

    @JsProperty public native String getBorderImageSource();
    @JsProperty public native void setBorderImageSource(String borderImageSource);

    /**
     * The property border-image-source is used to set the image to be used instead of the border
     * style. If this is set to none the border-style is used instead.
     */
    @JsOverlay public final CssProps borderImageSource(String borderImageSource) {
        setBorderImageSource(borderImageSource);
        return this;
    }

    @JsProperty public native String getBorderImageWidth();
    @JsProperty public native void setBorderImageWidth(String borderImageWidth);

    /**
     * The border-image-width CSS property defines the offset to use for dividing the border image
     * in nine parts, the top-left corner, central top edge, top-right-corner, central right edge,
     * bottom-right corner, central bottom edge, bottom-left corner, and central right edge. They
     * represent inward distance from the top, right, bottom, and left edges.
     */
    @JsOverlay public final CssProps borderImageWidth(String borderImageWidth) {
        setBorderImageWidth(borderImageWidth);
        return this;
    }

    @JsProperty public native String getBorderLeft();
    @JsProperty public native void setBorderLeft(String borderLeft);

    /**
     * Shorthand property that defines the border-width, border-style and border-color of an
     * element's left border in a single declaration. Note that you can use the corresponding
     * longhand properties to set specific individual properties of the left
     * border — border-left-width, border-left-style and border-left-color.
     */
    @JsOverlay public final CssProps borderLeft(String borderLeft) {
        setBorderLeft(borderLeft);
        return this;
    }

    @JsProperty public native String getBorderLeftColor();
    @JsProperty public native void setBorderLeftColor(String borderLeftColor);

    /**
     * The CSS border-left-color property sets the color of an element's left border. This page
     * explains the border-left-color value, but often you will find it more convenient to fix
     * the border's left color as part of a shorthand set, either border-left or border-color.
     * Colors can be defined several ways. For more information, see Usage.
     */
    @JsOverlay public final CssProps borderLeftColor(String borderLeftColor) {
        setBorderLeftColor(borderLeftColor);
        return this;
    }

    @JsProperty public native String getBorderLeftStyle();
    @JsProperty public native void setBorderLeftStyle(String borderLeftStyle);

    /**
     * Sets the style of an element's left border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderLeftStyle(String borderLeftStyle) {
        setBorderLeftStyle(borderLeftStyle);
        return this;
    }

    @JsProperty public native String getBorderLeftWidth();
    @JsProperty public native void setBorderLeftWidth(String borderLeftWidth);

    /**
     * Sets the width of an element's left border. To set all four borders, use the border-width
     * shorthand property which sets the values simultaneously for border-top-width,
     * border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderLeftWidth(String borderLeftWidth) {
        setBorderLeftWidth(borderLeftWidth);
        return this;
    }

    @JsProperty public native String getBorderRight();
    @JsProperty public native void setBorderRight(String borderRight);

    /**
     * Shorthand property that defines the border-width, border-style and border-color of an
     * element's right border in a single declaration. Note that you can use the corresponding
     * longhand properties to set specific individual properties of the right border
     * — border-right-width, border-right-style and border-right-color.
     */
    @JsOverlay public final CssProps borderRight(String borderRight) {
        setBorderRight(borderRight);
        return this;
    }

    @JsProperty public native String getBorderRightColor();
    @JsProperty public native void setBorderRightColor(String borderRightColor);

    /**
     * Sets the color of an element's right border. This page explains the border-right-color
     * value, but often you will find it more convenient to fix the border's right color as
     * part of a shorthand set, either border-right or border-color.
     * Colors can be defined several ways. For more information, see Usage.
     */
    @JsOverlay public final CssProps borderRightColor(String borderRightColor) {
        setBorderRightColor(borderRightColor);
        return this;
    }

    @JsProperty public native String getBorderRightStyle();
    @JsProperty public native void setBorderRightStyle(String borderRightStyle);

    /**
     * Sets the style of an element's right border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderRightStyle(String borderRightStyle) {
        setBorderRightStyle(borderRightStyle);
        return this;
    }

    @JsProperty public native String getBorderRightWidth();
    @JsProperty public native void setBorderRightWidth(String borderRightWidth);

    /**
     * Sets the width of an element's right border. To set all four borders, use the
     * border-width shorthand property which sets the values simultaneously for
     * border-top-width, border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderRightWidth(String borderRightWidth) {
        setBorderRightWidth(borderRightWidth);
        return this;
    }


    @JsProperty public native String getBorderSpacing();
    @JsProperty public native void setBorderSpacing(String borderSpacing);

    /**
     * Specifies the distance between the borders of adjacent cells.
     */
    @JsOverlay public final CssProps borderSpacing(String borderSpacing) {
        setBorderSpacing(borderSpacing);
        return this;
    }

    @JsProperty public native String getBorderStyle();
    @JsProperty public native void setBorderStyle(String borderStyle);

    /**
     * Sets the style of an element's four borders. This property can have from one to four values.
     * With only one value, the value will be applied to all four borders; otherwise, this works
     * as a shorthand property for each of border-top-style, border-right-style,
     * border-bottom-style, border-left-style, where each border style may be assigned a separate value.
     */
    @JsOverlay public final CssProps borderStyle(String borderStyle) {
        setBorderStyle(borderStyle);
        return this;
    }


    @JsProperty public native String getBorderTop();
    @JsProperty public native void setBorderTop(String borderTop);

    /**
     * Shorthand property that defines the border-width, border-style and border-color of an
     * element's top border in a single declaration. Note that you can use the corresponding
     * longhand properties to set specific individual properties of the top border —
     * border-top-width, border-top-style and border-top-color.
     */
    @JsOverlay public final CssProps borderTop(String borderTop) {
        setBorderTop(borderTop);
        return this;
    }

    @JsProperty public native String getBorderTopColor();
    @JsProperty public native void setBorderTopColor(String borderTopColor);

    /**
     * Sets the color of an element's top border. This page explains the border-top-color value,
     * but often you will find it more convenient to fix the border's top color as part of a
     * shorthand set, either border-top or border-color.
     * Colors can be defined several ways. For more information, see Usage.
     */
    @JsOverlay public final CssProps borderTopColor(String borderTopColor) {
        setBorderTopColor(borderTopColor);
        return this;
    }

    @JsProperty public native String getBorderTopLeftRadius();
    @JsProperty public native void setBorderTopLeftRadius(String borderTopLeftRadius);

    /**
     * Sets the rounding of the top-left corner of the element.
     */
    @JsOverlay public final CssProps borderTopLeftRadius(String borderTopLeftRadius) {
        setBorderTopLeftRadius(borderTopLeftRadius);
        return this;
    }

    @JsProperty public native String getBorderTopRightRadius();
    @JsProperty public native void setBorderTopRightRadius(String borderTopRightRadius);

    /**
     * Sets the rounding of the top-right corner of the element.
     */
    @JsOverlay public final CssProps borderTopRightRadius(String borderTopRightRadius) {
        setBorderTopRightRadius(borderTopRightRadius);
        return this;
    }

    @JsProperty public native String getBorderTopStyle();
    @JsProperty public native void setBorderTopStyle(String borderTopStyle);

    /**
     * Sets the style of an element's top border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderTopStyle(String borderTopStyle) {
        setBorderTopStyle(borderTopStyle);
        return this;
    }

    @JsProperty public native String getBorderTopWidth();
    @JsProperty public native void setBorderTopWidth(String borderTopWidth);

    /**
     * Sets the width of an element's top border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderTopWidth(String borderTopWidth) {
        setBorderTopWidth(borderTopWidth);
        return this;
    }

    @JsProperty public native String getBorderWidth();
    @JsProperty public native void setBorderWidth(String borderWidth);

    /**
     * Sets the width of an element's four borders. This property can have from one to four values.
     * This is a shorthand property for setting values simultaneously for border-top-width,
     * border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderWidth(String borderWidth) {
        setBorderWidth(borderWidth);
        return this;
    }

    @JsProperty public native String getBoxDecorationBreak();
    @JsProperty public native void setBoxDecorationBreak(String boxDecorationBreak);

    /**
     * Breaks a box into fragments creating new borders, padding and repeating backgrounds or lets
     * it stay as a continuous box on a page break, column break, or, for inline elements, at a
     * line break.
     */
    @JsOverlay public final CssProps boxDecorationBreak(String boxDecorationBreak) {
        setBoxDecorationBreak(boxDecorationBreak);
        return this;
    }


    @JsProperty public native String getBoxLineProgression();
    @JsProperty public native void setBoxLineProgression(String boxLineProgression);

    /**
     * Do not use. This property has been replaced by the flex-wrap property.
     * Gets or sets a value that specifies the direction to add successive rows or columns when
     * the value of box-lines is set to multiple.
     */
    @JsOverlay public final CssProps boxLineProgression(String boxLineProgression) {
        setBoxLineProgression(boxLineProgression);
        return this;
    }

    @JsProperty public native String getBoxLines();
    @JsProperty public native void setBoxLines(String boxLines);

    /**
     * Do not use. This property has been replaced by the flex-wrap property.
     * Gets or sets a value that specifies whether child elements wrap onto multiple lines or
     * columns based on the space available in the object.
     */
    @JsOverlay public final CssProps boxLines(String boxLines) {
        setBoxLines(boxLines);
        return this;
    }

    @JsProperty public native String getBoxOrdinalGroup();
    @JsProperty public native void setBoxOrdinalGroup(String boxOrdinalGroup);

    /**
     * Do not use. This property has been replaced by flex-order.
     * Specifies the ordinal group that a child element of the object belongs to. This ordinal
     * value identifies the display order (along the axis defined by the box-orient property)
     * for the group.
     */
    @JsOverlay public final CssProps boxOrdinalGroup(String boxOrdinalGroup) {
        setBoxOrdinalGroup(boxOrdinalGroup);
        return this;
    }


    @JsProperty public native String getBreakAfter();
    @JsProperty public native void setBreakAfter(String breakAfter);

    /**
     * The CSS break-after property allows you to force a break on multi-column layouts. More
     * specifically, it allows you to force a break after an element. It allows you to determine
     * if a break should occur, and what type of break it should be. The break-after CSS
     * property describes how the page, column or region break behaves after the generated box.
     * If there is no generated box, the property is ignored.
     */
    @JsOverlay public final CssProps breakAfter(String breakAfter) {
        setBreakAfter(breakAfter);
        return this;
    }

    @JsProperty public native String getBreakBefore();
    @JsProperty public native void setBreakBefore(String breakBefore);

    /**
     * Control page/column/region breaks that fall above a block of content
     */
    @JsOverlay public final CssProps breakBefore(String breakBefore) {
        setBreakBefore(breakBefore);
        return this;
    }

    @JsProperty public native String getBreakInside();
    @JsProperty public native void setBreakInside(String breakInside);

    /**
     * Control page/column/region breaks that fall within a block of content
     */
    @JsOverlay public final CssProps breakInside(String breakInside) {
        setBreakInside(breakInside);
        return this;
    }

    @JsProperty public native String getClear();
    @JsProperty public native void setClear(String clear);

    /**
     * The clear CSS property specifies if an element can be positioned next to or must be
     * positioned below the floating elements that precede it in the markup.
     */
    @JsOverlay public final CssProps clear(String clear) {
        setClear(clear);
        return this;
    }

    @JsProperty public native String getClipRule();
    @JsProperty public native void setClipRule(String clipRule);

    /**
     * Clipping crops an graphic, so that only a portion of the graphic is rendered, or filled.
     * This clip-rule property, when used with the clip-path property, defines which clip rule,
     * or algorithm, to use when filling the different parts of a graphics.
     */
    @JsOverlay public final CssProps clipRule(String clipRule) {
        setClipRule(clipRule);
        return this;
    }


    @JsProperty public native String getColor();
    @JsProperty public native void setColor(String color);

    /**
     * The color property sets the color of an element's foreground content (usually text),
     * accepting any standard CSS color from keywords and hex values to RGB(a) and HSL(a).
     */
    @JsOverlay public final CssProps color(String color) {
        this.setColor(color);
        return this;
    }

    @JsProperty public native String getColumnFill();
    @JsProperty public native void setColumnFill(String columnFill);

    /**
     * Specifies how to fill columns (balanced or sequential).
     */
    @JsOverlay public final CssProps columnFill(String columnFill) {
        setColumnFill(columnFill);
        return this;
    }

    @JsProperty public native String getColumnGap();
    @JsProperty public native void setColumnGap(String columnGap);

    /**
     * The column-gap property controls the width of the gap between columns in multi-column
     * elements.
     */
    @JsOverlay public final CssProps columnGap(String columnGap) {
        setColumnGap(columnGap);
        return this;
    }

    @JsProperty public native String getColumnRule();
    @JsProperty public native void setColumnRule(String columnRule);

    /**
     * Sets the width, style, and color of the rule between columns.
     */
    @JsOverlay public final CssProps columnRule(String columnRule) {
        setColumnRule(columnRule);
        return this;
    }


    @JsProperty public native String getColumnRuleColor();
    @JsProperty public native void setColumnRuleColor(String columnRuleColor);

    /**
     * Specifies the color of the rule between columns.
     */
    @JsOverlay public final CssProps columnRuleColor(String columnRuleColor) {
        setColumnRuleColor(columnRuleColor);
        return this;
    }

    @JsProperty public native String getColumnRuleWidth();
    @JsProperty public native void setColumnRuleWidth(String columnRuleWidth);

    /**
     * Specifies the width of the rule between columns.
     */
    @JsOverlay public final CssProps columnRuleWidth(String columnRuleWidth) {
        setColumnRuleWidth(columnRuleWidth);
        return this;
    }

    @JsProperty public native String getColumnSpan();
    @JsProperty public native void setColumnSpan(String columnSpan);

    /**
     * The column-span CSS property makes it possible for an element to span across all columns
     * when its value is set to all. An element that spans more than one column is called a
     * spanning element.
     */
    @JsOverlay public final CssProps columnSpan(String columnSpan) {
        setColumnSpan(columnSpan);
        return this;
    }

    @JsProperty public native String getColumnWidth();
    @JsProperty public native void setColumnWidth(String columnWidth);

    /**
     * Specifies the width of columns in multi-column elements.
     */
    @JsOverlay public final CssProps columnWidth(String columnWidth) {
        setColumnWidth(columnWidth);
        return this;
    }

    @JsProperty public native String getColumns();
    @JsProperty public native void setColumns(String columns);

    /**
     * This property is a shorthand property for setting column-width and/or column-count.
     */
    @JsOverlay public final CssProps columns(String columns) {
        setColumns(columns);
        return this;
    }

    @JsProperty public native String getCounterIncrement();
    @JsProperty public native void setCounterIncrement(String counterIncrement);

    /**
     * The counter-increment property accepts one or more names of counters (identifiers), each
     * one optionally followed by an integer which specifies the value by which the counter
     * should be incremented (e.g. if the value is 2, the counter increases by 2 each time it is
     * invoked).
     */
    @JsOverlay public final CssProps counterIncrement(String counterIncrement) {
        setCounterIncrement(counterIncrement);
        return this;
    }

    @JsProperty public native String getCounterReset();
    @JsProperty public native void setCounterReset(String counterReset);

    /**
     * The counter-reset property contains a list of one or more names of counters, each one
     * optionally followed by an integer (otherwise, the integer defaults to 0.) Each time the
     * given element is invoked, the counters specified by the property are set to the given
     * integer.
     */
    @JsOverlay public final CssProps counterReset(String counterReset) {
        setCounterReset(counterReset);
        return this;
    }

    @JsProperty public native String getCue();
    @JsProperty public native void setCue(String cue);

    /**
     * The cue property specifies sound files (known as an "auditory icon") to be played by
     * speech media agents before and after presenting an element's content; if only one file
     * is specified, it is played both before and after. The volume at which the file(s)
     * should be played, relative to the volume of the main element, may also be specified.
     * The icon files may also be set separately with the cue-before and cue-after properties.
     */
    @JsOverlay public final CssProps cue(String cue) {
        setCue(cue);
        return this;
    }

    @JsProperty public native String getCueAfter();
    @JsProperty public native void setCueAfter(String cueAfter);

    /**
     * The cue-after property specifies a sound file (known as an "auditory icon") to be played
     * by speech media agents after presenting an element's content; the volume at which the
     * file should be played may also be specified. The shorthand property cue sets cue sounds
     * for both before and after the element is presented.
     */
    @JsOverlay public final CssProps cueAfter(String cueAfter) {
        setCueAfter(cueAfter);
        return this;
    }

    @JsProperty public native String getDirection();
    @JsProperty public native void setDirection(String direction);

    /**
     * The direction CSS property specifies the text direction/writing direction. The rtl is
     * used for Hebrew or Arabic text, the ltr is for other languages.
     */
    @JsOverlay public final CssProps direction(String direction) {
        setDirection(direction);
        return this;
    }

    @JsProperty public native String getDisplay();
    @JsProperty public native void setDisplay(String display);

    /**
     * This property specifies the type of rendering box used for an element. It is a shorthand
     * property for many other display properties.
     */
    @JsOverlay public final CssProps display(String display) {
        setDisplay(display);
        return this;
    }

    @JsProperty public native String getFill();
    @JsProperty public native void setFill(String fill);

    /**
     * The ‘fill’ property paints the interior of the given graphical element. The area to be
     * painted consists of any areas inside the outline of the shape. To determine the inside of
     * the shape, all subpaths are considered, and the interior is determined according to the
     * rules associated with the current value of the ‘fill-rule’ property. The zero-width
     * geometric outline of a shape is included in the area to be painted.
     */
    @JsOverlay public final CssProps fill(String fill) {
        setFill(fill);
        return this;
    }

    @JsProperty public native String getFillRule();
    @JsProperty public native void setFillRule(String fillRule);

    /**
     * The ‘fill-rule’ property indicates the algorithm which is to be used to determine what
     * parts of the canvas are included inside the shape. For a simple, non-intersecting path, it
     * is intuitively clear what region lies "inside"; however, for a more complex path, such as
     * a path that intersects itself or where one subpath encloses another, the interpretation of
     * "inside" is not so obvious.
     * The ‘fill-rule’ property provides two options for how the inside of a shape is determined:
     */
    @JsOverlay public final CssProps fillRule(String fillRule) {
        setFillRule(fillRule);
        return this;
    }

    @JsProperty public native String getFilter();
    @JsProperty public native void setFilter(String filter);

    /**
     * Applies various image processing effects. This property is largely unsupported. See
     * Compatibility section for more information.
     */
    @JsOverlay public final CssProps filter(String filter) {
        setFilter(filter);
        return this;
    }

    @JsProperty public native String getFlexBasis();
    @JsProperty public native void setFlexBasis(String flexBasis);

    /**
     * The flex-basis CSS property describes the initial main size of the flex item before any free
     * space is distributed according to the flex factors described in the flex property
     * (flex-grow and flex-shrink).
     */
    @JsOverlay public final CssProps flexBasis(String flexBasis) {
        setFlexBasis(flexBasis);
        return this;
    }

    @JsProperty public native String getFlexDirection();
    @JsProperty public native void setFlexDirection(String flexDirection);

    /**
     * The flex-direction CSS property describes how flex items are placed in the flex container,
     * by setting the direction of the flex container's main axis.
     */
    @JsOverlay public final CssProps flexDirection(String flexDirection) {
        setFlexDirection(flexDirection);
        return this;
    }

    @JsProperty public native String getFlexFlow();
    @JsProperty public native void setFlexFlow(String flexFlow);

    /**
     * The flex-flow CSS property defines the flex container's main and cross axis. It is a
     * shorthand property for the flex-direction and flex-wrap properties.
     */
    @JsOverlay public final CssProps flexFlow(String flexFlow) {
        setFlexFlow(flexFlow);
        return this;
    }

    @JsProperty public native String getFlexItemAlign();
    @JsProperty public native void setFlexItemAlign(String flexItemAlign);

    /**
     * Do not use. This property has been renamed to align-self
     * Specifies the alignment (perpendicular to the layout axis defined by flex-direction)
     * of child elements of the object.
     */
    @JsOverlay public final CssProps flexItemAlign(String flexItemAlign) {
        setFlexItemAlign(flexItemAlign);
        return this;
    }

    @JsProperty public native String getFlexOrder();
    @JsProperty public native void setFlexOrder(String flexOrder);

    /**
     * Gets or sets a value that specifies the ordinal group that a flexbox element belongs to.
     * This ordinal value identifies the display order for the group.
     */
    @JsOverlay public final CssProps flexOrder(String flexOrder) {
        setFlexOrder(flexOrder);
        return this;
    }

    @JsProperty(name="float") public native String getCssFloat();
    @JsProperty(name="float") public native void setCssFloat(String cssFloat);

    /**
     * Elements which have the style float are floated horizontally. These elements can move as
     * far to the left or right of the containing element. All elements after the floating
     * element will flow around it, but elements before the floating element are not impacted. If
     * several floating elements are placed after each other, they will float next to each other
     * as long as there is room.
     */
    @JsOverlay public final CssProps cssFloat(String cssFloat) {
        setCssFloat(cssFloat);
        return this;
    }

    @JsProperty public native String getFlowFrom();
    @JsProperty public native void setFlowFrom(String flowFrom);

    /**
     * Flows content from a named flow (specified by a corresponding flow-into) through selected
     * elements to form a dynamic chain of layout regions.
     */
    @JsOverlay public final CssProps flowFrom(String flowFrom) {
        setFlowFrom(flowFrom);
        return this;
    }

    @JsProperty public native String getFont();
    @JsProperty public native void setFont(String font);

    /**
     * The font property is shorthand that allows you to do one of two things: you can either set
     * up six of the most mature font properties in one line, or you can set one of a choice of
     * keywords to adopt a system font setting.
     */
    @JsOverlay public final CssProps font(String font) {
        setFont(font);
        return this;
    }

    @JsProperty public native String getFontFamily();
    @JsProperty public native void setFontFamily(String fontFamily);

    /**
     * The font-family property allows one or more font family names and/or generic family names
     * to be specified for usage on the selected element(s)' text. The browser then goes through
     * the list; for each character in the selection it applies the first font family that has an
     * available glyph for that character.
     */
    @JsOverlay public final CssProps fontFamily(String fontFamily) {
        setFontFamily(fontFamily);
        return this;
    }

    @JsProperty public native String getFontKerning();
    @JsProperty public native void setFontKerning(String fontKerning);

    /**
     * The font-kerning property allows contextual adjustment of inter-glyph spacing, i.e. the
     * spaces between the characters in text. This property controls metric kerning
     * - that utilizes adjustment data contained in the font. Optical Kerning is not supported as
     * yet.
     */
    @JsOverlay public final CssProps fontKerning(String fontKerning) {
        setFontKerning(fontKerning);
        return this;
    }

    @JsProperty public native String getFontSizeAdjust();
    @JsProperty public native void setFontSizeAdjust(String fontSizeAdjust);

    /**
     * The font-size-adjust property adjusts the font-size of the fallback fonts defined with
     * font-family, so that the x-height is the same no matter what font is used. This preserves
     * the readability of the text when fallback happens.
     */
    @JsOverlay public final CssProps fontSizeAdjust(String fontSizeAdjust) {
        setFontSizeAdjust(fontSizeAdjust);
        return this;
    }

    @JsProperty public native String getFontStretch();
    @JsProperty public native void setFontStretch(String fontStretch);

    /**
     * Allows you to expand or condense the widths for a normal, condensed, or expanded font face.
     */
    @JsOverlay public final CssProps fontStretch(String fontStretch) {
        setFontStretch(fontStretch);
        return this;
    }

    @JsProperty public native String getFontStyle();
    @JsProperty public native void setFontStyle(String fontStyle);

    /**
     * The font-style property allows normal, italic, or oblique faces to be selected. Italic
     * forms are generally cursive in nature while oblique faces are typically sloped versions
     * of the regular face. Oblique faces can be simulated by artificially sloping the glyphs
     * of the regular face.
     */
    @JsOverlay public final CssProps fontStyle(String fontStyle) {
        setFontStyle(fontStyle);
        return this;
    }

    @JsProperty public native String getFontSynthesis();
    @JsProperty public native void setFontSynthesis(String fontSynthesis);

    /**
     * This value specifies whether the user agent is allowed to synthesize bold or oblique font
     * faces when a font family lacks bold or italic faces.
     */
    @JsOverlay public final CssProps fontSynthesis(String fontSynthesis) {
        setFontSynthesis(fontSynthesis);
        return this;
    }

    @JsProperty public native String getFontVariant();
    @JsProperty public native void setFontVariant(String fontVariant);

    /**
     * The font-variant property enables you to select the small-caps font within a font family.
     */
    @JsOverlay public final CssProps fontVariant(String fontVariant) {
        setFontVariant(fontVariant);
        return this;
    }

    @JsProperty public native String getFontVariantAlternates();
    @JsProperty public native void setFontVariantAlternates(String fontVariantAlternates);

    /**
     * Fonts can provide alternate glyphs in addition to default glyph for a character. This
     * property provides control over the selection of these alternate glyphs.
     */
    @JsOverlay public final CssProps fontVariantAlternates(String fontVariantAlternates) {
        setFontVariantAlternates(fontVariantAlternates);
        return this;
    }

    @JsProperty public native String getGridArea();
    @JsProperty public native void setGridArea(String gridArea);

    /**
     * Lays out one or more grid items bound by 4 grid lines. Shorthand for setting
     * grid-column-start, grid-column-end, grid-row-start, and grid-row-end in a single
     * declaration.
     */
    @JsOverlay public final CssProps gridArea(String gridArea) {
        setGridArea(gridArea);
        return this;
    }

    @JsProperty public native String getGridColumn();
    @JsProperty public native void setGridColumn(String gridColumn);

    /**
     * Controls a grid item's placement in a grid area, particularly grid position and a grid span.
     * Shorthand for setting grid-column-start and grid-column-end in a single declaration.
     */
    @JsOverlay public final CssProps gridColumn(String gridColumn) {
        setGridColumn(gridColumn);
        return this;
    }

    @JsProperty public native String getGridColumnEnd();
    @JsProperty public native void setGridColumnEnd(String gridColumnEnd);

    /**
     * Controls a grid item's placement in a grid area as well as grid position and a grid span.
     * The grid-column-end property (with grid-row-start, grid-row-end, and grid-column-start)
     * determines a grid item's placement by specifying the grid lines of a grid item's grid area.
     */
    @JsOverlay public final CssProps gridColumnEnd(String gridColumnEnd) {
        setGridColumnEnd(gridColumnEnd);
        return this;
    }

    @JsProperty public native String getGridColumnStart();
    @JsProperty public native void setGridColumnStart(String gridColumnStart);

    /**
     * Determines a grid item's placement by specifying the starting grid lines of a grid item's
     * grid area . A grid item's placement in a grid area consists of a grid position and a grid
     * span. See also ( grid-row-start, grid-row-end, and grid-column-end)
     */
    @JsOverlay public final CssProps gridColumnStart(String gridColumnStart) {
        setGridColumnStart(gridColumnStart);
        return this;
    }

    @JsProperty public native String getGridRow();
    @JsProperty public native void setGridRow(String gridRow);

    /**
     * Gets or sets a value that indicates which row an element within a Grid should appear in.
     * Shorthand for setting grid-row-start and grid-row-end in a single declaration.
     */
    @JsOverlay public final CssProps gridRow(String gridRow) {
        setGridRow(gridRow);
        return this;
    }

    @JsProperty public native String getGridRowEnd();
    @JsProperty public native void setGridRowEnd(String gridRowEnd);

    /**
     * Determines a grid item’s placement by specifying the block-end. A grid item's placement in
     * a grid area consists of a grid position and a grid span. The grid-row-end property
     * (with grid-row-start, grid-column-start, and grid-column-end) determines a grid item's
     * placement by specifying the grid lines of a grid item's grid area.
     */
    @JsOverlay public final CssProps gridRowEnd(String gridRowEnd) {
        setGridRowEnd(gridRowEnd);
        return this;
    }

    @JsProperty public native String getGridRowPosition();
    @JsProperty public native void setGridRowPosition(String gridRowPosition);

    /**
     * Specifies a row position based upon an integer location, string value, or desired row size.
     * css/properties/grid-row is used as short-hand for grid-row-position and grid-row-position
     */
    @JsOverlay public final CssProps gridRowPosition(String gridRowPosition) {
        setGridRowPosition(gridRowPosition);
        return this;
    }

    @JsProperty public native String getGridRowSpan();
    @JsProperty public native void setGridRowSpan(String gridRowSpan);

    @JsOverlay public final CssProps gridRowSpan(String gridRowSpan) {
        setGridRowSpan(gridRowSpan);
        return this;
    }

    @JsProperty public native String getGridTemplateAreas();
    @JsProperty public native void setGridTemplateAreas(String gridTemplateAreas);

    /**
     * Specifies named grid areas which are not associated with any particular grid item, but can
     * be referenced from the grid-placement properties. The syntax of the grid-template-areas
     * property also provides a visualization of the structure of the grid, making the overall
     * layout of the grid container easier to understand.
     */
    @JsOverlay public final CssProps gridTemplateAreas(String gridTemplateAreas) {
        setGridTemplateAreas(gridTemplateAreas);
        return this;
    }

    @JsProperty public native String getGridTemplateColumns();
    @JsProperty public native void setGridTemplateColumns(String gridTemplateColumns);

    /**
     * Specifies (with grid-template-rows) the line names and track sizing functions of the grid.
     * Each sizing function can be specified as a length, a percentage of the grid container’s
     * size, a measurement of the contents occupying the column or row, or a fraction of the free
     * space in the grid.
     */
    @JsOverlay public final CssProps gridTemplateColumns(String gridTemplateColumns) {
        setGridTemplateColumns(gridTemplateColumns);
        return this;
    }

    @JsProperty public native String getGridTemplateRows();
    @JsProperty public native void setGridTemplateRows(String gridTemplateRows);

    /**
     * Specifies (with grid-template-columns) the line names and track sizing functions of the
     * grid. Each sizing function can be specified as a length, a percentage of the grid
     * container’s size, a measurement of the contents occupying the column or row, or a
     * fraction of the free space in the grid.
     */
    @JsOverlay public final CssProps gridTemplateRows(String gridTemplateRows) {
        setGridTemplateRows(gridTemplateRows);
        return this;
    }

    @JsProperty public native String getHeight();
    @JsProperty public native void setHeight(String height);

    /**
     * Sets the height of an element. The content area of the element height does not include
     * the padding, border, and margin of the element.
     */
    @JsOverlay public final CssProps height(String height) {
        setHeight(height);
        return this;
    }

    @JsProperty public native String getHyphenateLimitChars();
    @JsProperty public native void setHyphenateLimitChars(String hyphenateLimitChars);

    /**
     * Specifies the minimum number of characters in a hyphenated word
     */
    @JsOverlay public final CssProps hyphenateLimitChars(String hyphenateLimitChars) {
        setHyphenateLimitChars(hyphenateLimitChars);
        return this;
    }

    @JsProperty public native String getHyphenateLimitLines();
    @JsProperty public native void setHyphenateLimitLines(String hyphenateLimitLines);

    /**
     * Indicates the maximum number of successive hyphenated lines in an element. The ‘no-limit’
     * value means that there is no limit.
     */
    @JsOverlay public final CssProps hyphenateLimitLines(String hyphenateLimitLines) {
        setHyphenateLimitLines(hyphenateLimitLines);
        return this;
    }

    @JsProperty public native String getHyphenateLimitZone();
    @JsProperty public native void setHyphenateLimitZone(String hyphenateLimitZone);

    /**
     * Specifies the maximum amount of trailing whitespace (before justification) that may be
     * left in a line before hyphenation is triggered to pull part of a word from the next
     * line back up into the current one.
     */
    @JsOverlay public final CssProps hyphenateLimitZone(String hyphenateLimitZone) {
        setHyphenateLimitZone(hyphenateLimitZone);
        return this;
    }

    @JsProperty public native String getHyphens();
    @JsProperty public native void setHyphens(String hyphens);

    /**
     * Specifies whether or not words in a sentence can be split by the use of a manual or
     * automatic hyphenation mechanism.
     */
    @JsOverlay public final CssProps hyphens(String hyphens) {
        setHyphens(hyphens);
        return this;
    }

    @JsProperty public native String getImeMode();
    @JsProperty public native void setImeMode(String imeMode);

    @JsOverlay public final CssProps imeMode(String imeMode) {
        setImeMode(imeMode);
        return this;
    }

    @JsProperty public native String getLayoutGrid();
    @JsProperty public native void setLayoutGrid(String layoutGrid);

    @JsOverlay public final CssProps layoutGrid(String layoutGrid) {
        setLayoutGrid(layoutGrid);
        return this;
    }

    @JsProperty public native String getLayoutGridChar();
    @JsProperty public native void setLayoutGridChar(String layoutGridChar);

    @JsOverlay public final CssProps layoutGridChar(String layoutGridChar) {
        setLayoutGridChar(layoutGridChar);
        return this;
    }

    @JsProperty public native String getLayoutGridLine();
    @JsProperty public native void setLayoutGridLine(String layoutGridLine);

    @JsOverlay public final CssProps layoutGridLine(String layoutGridLine) {
        setLayoutGridLine(layoutGridLine);
        return this;
    }

    @JsProperty public native String getLayoutGridMode();
    @JsProperty public native void setLayoutGridMode(String layoutGridMode);

    @JsOverlay public final CssProps layoutGridMode(String layoutGridMode) {
        setLayoutGridMode(layoutGridMode);
        return this;
    }

    @JsProperty public native String getLayoutGridType();
    @JsProperty public native void setLayoutGridType(String layoutGridType);

    @JsOverlay public final CssProps layoutGridType(String layoutGridType) {
        setLayoutGridType(layoutGridType);
        return this;
    }

    @JsProperty public native String getLeft();
    @JsProperty public native void setLeft(String left);

    /**
     * Sets the left edge of an element
     */
    @JsOverlay public final CssProps left(String left) {
        setLeft(left);
        return this;
    }

    @JsProperty public native String getLetterSpacing();
    @JsProperty public native void setLetterSpacing(String letterSpacing);

    /**
     * The letter-spacing CSS property specifies the spacing behavior between text characters.
     */
    @JsOverlay public final CssProps letterSpacing(String letterSpacing) {
        setLetterSpacing(letterSpacing);
        return this;
    }

    @JsProperty public native String getListStyle();
    @JsProperty public native void setListStyle(String listStyle);

    /**
     * Shorthand property that sets the list-style-type, list-style-position and list-style-image
     * properties in one declaration.
     */
    @JsOverlay public final CssProps listStyle(String listStyle) {
        setListStyle(listStyle);
        return this;
    }

    @JsProperty public native String getListStyleImage();
    @JsProperty public native void setListStyleImage(String listStyleImage);

    /**
     * This property sets the image that will be used as the list item marker. When the image is
     * available, it will replace the marker set with the 'list-style-type' marker. That also
     * means that if the image is not available, it will show the style specified by
     * list-style-property
     */
    @JsOverlay public final CssProps listStyleImage(String listStyleImage) {
        setListStyleImage(listStyleImage);
        return this;
    }

    @JsProperty public native String getListStylePosition();
    @JsProperty public native void setListStylePosition(String listStylePosition);

    /**
     * Specifies if the list-item markers should appear inside or outside the content flow.
     */
    @JsOverlay public final CssProps listStylePosition(String listStylePosition) {
        setListStylePosition(listStylePosition);
        return this;
    }

    @JsProperty public native String getListStyleType();
    @JsProperty public native void setListStyleType(String listStyleType);

    /**
     * Specifies the type of list-item marker in a list.
     */
    @JsOverlay public final CssProps listStyleType(String listStyleType) {
        setListStyleType(listStyleType);
        return this;
    }

    @JsProperty public native String getMargin();
    @JsProperty public native void setMargin(String margin);

    /**
     * The margin property is shorthand to allow you to set all four margins of an element at once.
     * Its equivalent longhand properties are margin-top, margin-right, margin-bottom and
     * margin-left. Negative values are also allowed.
     */
    @JsOverlay public final CssProps margin(String margin) {
        setMargin(margin);
        return this;
    }

    @JsProperty public native String getMarginBottom();
    @JsProperty public native void setMarginBottom(String marginBottom);

    /**
     * margin-bottom sets the bottom margin of an element.
     */
    @JsOverlay public final CssProps marginBottom(String marginBottom) {
        setMarginBottom(marginBottom);
        return this;
    }

    @JsProperty public native String getMarginLeft();
    @JsProperty public native void setMarginLeft(String marginLeft);

    /**
     * margin-left sets the left margin of an element.
     */
    @JsOverlay public final CssProps marginLeft(String marginLeft) {
        setMarginLeft(marginLeft);
        return this;
    }

    @JsProperty public native String getMarginRight();
    @JsProperty public native void setMarginRight(String marginRight);

    /**
     * margin-right sets the right margin of an element.
     */
    @JsOverlay public final CssProps marginRight(String marginRight) {
        setMarginRight(marginRight);
        return this;
    }

    @JsProperty public native String getMarginTop();
    @JsProperty public native void setMarginTop(String marginTop);

    /**
     * margin-top sets the top margin of an element.
     */
    @JsOverlay public final CssProps marginTop(String marginTop) {
        setMarginTop(marginTop);
        return this;
    }

    @JsProperty public native String getMask();
    @JsProperty public native void setMask(String mask);

    /**
     * This property is shorthand for setting mask-image, mask-mode, mask-repeat, mask-position,
     * mask-clip, mask-origin, mask-composite and mask-size. Omitted values are set to their
     * original properties' initial values.
     */
    @JsOverlay public final CssProps mask(String mask) {
        setMask(mask);
        return this;
    }

    @JsProperty public native String getMaskBorder();
    @JsProperty public native void setMaskBorder(String maskBorder);

    /**
     * This property is shorthand for setting mask-border-source, mask-border-slice,
     * mask-border-width, mask-border-outset, and mask-border-repeat. Omitted values are set to
     * their original properties' initial values.
     */
    @JsOverlay public final CssProps maskBorder(String maskBorder) {
        setMaskBorder(maskBorder);
        return this;
    }

    @JsProperty public native String getMaskBorderRepeat();
    @JsProperty public native void setMaskBorderRepeat(String maskBorderRepeat);

    /**
     * This property specifies how the images for the sides and the middle part of the mask image
     * are scaled and tiled. The first keyword applies to the horizontal sides, the second one
     * applies to the vertical ones. If the second keyword is absent, it is assumed to be the
     * same as the first, similar to the CSS border-image-repeat property.
     */
    @JsOverlay public final CssProps maskBorderRepeat(String maskBorderRepeat) {
        setMaskBorderRepeat(maskBorderRepeat);
        return this;
    }

    @JsProperty public native String getMaskBorderSlice();
    @JsProperty public native void setMaskBorderSlice(String maskBorderSlice);

    /**
     * This property specifies inward offsets from the top, right, bottom, and left edges of the
     * mask image, dividing it into nine regions: four corners, four edges, and a middle. The
     * middle image part is discarded and treated as fully transparent black unless the fill
     * keyword is present. The four values set the top, right, bottom and left offsets in that
     * order, similar to the CSS border-image-slice property.
     */
    @JsOverlay public final CssProps maskBorderSlice(String maskBorderSlice) {
        setMaskBorderSlice(maskBorderSlice);
        return this;
    }

    @JsProperty public native String getMaskBorderSource();
    @JsProperty public native void setMaskBorderSource(String maskBorderSource);

    /**
     * Specifies an image to be used as a mask. An image that is empty, fails to download, is
     * non-existent, or cannot be displayed is ignored and does not mask the element.
     */
    @JsOverlay public final CssProps maskBorderSource(String maskBorderSource) {
        setMaskBorderSource(maskBorderSource);
        return this;
    }

    @JsProperty public native String getMaskBorderWidth();
    @JsProperty public native void setMaskBorderWidth(String maskBorderWidth);

    /**
     * This property sets the width of the mask box image, similar to the CSS border-image-width
     * property.
     */
    @JsOverlay public final CssProps maskBorderWidth(String maskBorderWidth) {
        setMaskBorderWidth(maskBorderWidth);
        return this;
    }

    @JsProperty public native String getMaskClip();
    @JsProperty public native void setMaskClip(String maskClip);

    /**
     * Determines the mask painting area, which defines the area that is affected by the mask.
     * The painted content of an element may be restricted to this area.
     */
    @JsOverlay public final CssProps maskClip(String maskClip) {
        setMaskClip(maskClip);
        return this;
    }

    @JsProperty public native String getMaskOrigin();
    @JsProperty public native void setMaskOrigin(String maskOrigin);

    /**
     * For elements rendered as a single box, specifies the mask positioning area. For elements
     * rendered as multiple boxes (e.g., inline boxes on several lines, boxes on several pages)
     * specifies which boxes box-decoration-break operates on to determine the mask positioning
     * area(s).
     */
    @JsOverlay public final CssProps maskOrigin(String maskOrigin) {
        setMaskOrigin(maskOrigin);
        return this;
    }

    @JsProperty public native String getMaxFontSize();
    @JsProperty public native void setMaxFontSize(String maxFontSize);

    /**
     * This property must not be used. It is no longer included in any standard or standard track
     * specification, nor is it implemented in any browser. It is only used when the
     * text-align-last property is set to size. It controls allowed adjustments of font-size to
     * fit line content.
     */
    @JsOverlay public final CssProps maxFontSize(String maxFontSize) {
        setMaxFontSize(maxFontSize);
        return this;
    }

    @JsProperty public native String getMaxHeight();
    @JsProperty public native void setMaxHeight(String maxHeight);

    /**
     * Sets the maximum height for an element. It prevents the height of the element to exceed
     * the specified value. If min-height is specified and is greater than max-height, max-height
     * is overridden.
     */
    @JsOverlay public final CssProps maxHeight(String maxHeight) {
        setMaxHeight(maxHeight);
        return this;
    }

    @JsProperty public native String getMaxWidth();
    @JsProperty public native void setMaxWidth(String maxWidth);

    /**
     * Sets the maximum width for an element. It limits the width property to be larger than the
     * value specified in max-width.
     */
    @JsOverlay public final CssProps maxWidth(String maxWidth) {
        setMaxWidth(maxWidth);
        return this;
    }

    @JsProperty public native String getMinHeight();
    @JsProperty public native void setMinHeight(String minHeight);

    /**
     * Sets the minimum height for an element. It prevents the height of the element to be
     * smaller than the specified value. The value of min-height overrides both max-height and
     * height.
     */
    @JsOverlay public final CssProps minHeight(String minHeight) {
        setMinHeight(minHeight);
        return this;
    }

    @JsProperty public native String getMinWidth();
    @JsProperty public native void setMinWidth(String minWidth);

    /**
     * Sets the minimum width of an element. It limits the width property to be not smaller
     * than the value specified in min-width.
     */
    @JsOverlay public final CssProps minWidth(String minWidth) {
        setMinWidth(minWidth);
        return this;
    }

    @JsProperty public native String getOutline();
    @JsProperty public native void setOutline(String outline);

    /**
     * The CSS outline property is a shorthand property for setting one or more of the
     * individual outline properties outline-style, outline-width and outline-color in a single
     * rule. In most cases the use of this shortcut is preferable and more convenient.
     * Outlines differ from borders in the following ways:
     *      •       Outlines do not take up space, they are drawn above the content.
     *      •       Outlines may be non-rectangular. They are rectangular in Gecko/Firefox.
     *              Internet Explorer attempts to place the smallest contiguous outline around
     *              all elements or shapes that are indicated to have an outline. Opera draws a
     *              non-rectangular shape around a construct.
     */
    @JsOverlay public final CssProps outline(String outline) {
        setOutline(outline);
        return this;
    }

    @JsProperty public native String getOutlineColor();
    @JsProperty public native void setOutlineColor(String outlineColor);

    /**
     * The outline-color property sets the color of the outline of an element. An outline is a
     * line that is drawn around elements, outside the border edge, to make the element stand out.
     */
    @JsOverlay public final CssProps outlineColor(String outlineColor) {
        setOutlineColor(outlineColor);
        return this;
    }

    @JsProperty public native String getOutlineOffset();
    @JsProperty public native void setOutlineOffset(String outlineOffset);

    /**
     * The outline-offset property offsets the outline and draw it beyond the border edge.
     */
    @JsOverlay public final CssProps outlineOffset(String outlineOffset) {
        setOutlineOffset(outlineOffset);
        return this;
    }

    @JsProperty public native String getOverflow();
    @JsProperty public native void setOverflow(String overflow);

    /**
     * The overflow property controls how extra content exceeding the bounding box of an element
     * is rendered. It can be used in conjunction with an element that has a fixed width and
     * height, to eliminate text-induced page distortion.
     */
    @JsOverlay public final CssProps overflow(String overflow) {
        setOverflow(overflow);
        return this;
    }

    @JsProperty public native String getOverflowStyle();
    @JsProperty public native void setOverflowStyle(String overflowStyle);

    /**
     * Specifies the preferred scrolling methods for elements that overflow.
     */
    @JsOverlay public final CssProps overflowStyle(String overflowStyle) {
        setOverflowStyle(overflowStyle);
        return this;
    }

    @JsProperty public native String getOverflowX();
    @JsProperty public native void setOverflowX(String overflowX);

    /**
     * The overflow-x property is a specific case of the generic overflow property. It controls
     * how extra content exceeding the x-axis of the bounding box of an element is rendered.
     */
    @JsOverlay public final CssProps overflowX(String overflowX) {
        setOverflowX(overflowX);
        return this;
    }

    @JsProperty public native String getPadding();
    @JsProperty public native void setPadding(String padding);

    /**
     * The padding optional CSS property sets the required padding space on one to four sides of
     * an element. The padding area is the space between an element and its border. Negative
     * values are not allowed but decimal values are permitted. The element size is treated as
     * fixed, and the content of the element shifts toward the center as padding is increased.
     * The padding property is a shorthand to avoid setting each side separately (padding-top,
     * padding-right, padding-bottom, padding-left).
     */
    @JsOverlay public final CssProps padding(String padding) {
        setPadding(padding);
        return this;
    }

    @JsProperty public native String getPaddingBottom();
    @JsProperty public native void setPaddingBottom(String paddingBottom);

    /**
     * The padding-bottom CSS property of an element sets the padding space required on the
     * bottom of an element. The padding area is the space between the content of the element and
     * its border. Contrary to margin-bottom values, negative values of padding-bottom are
     * invalid.
     */
    @JsOverlay public final CssProps paddingBottom(String paddingBottom) {
        setPaddingBottom(paddingBottom);
        return this;
    }

    @JsProperty public native String getPaddingLeft();
    @JsProperty public native void setPaddingLeft(String paddingLeft);

    /**
     * The padding-left CSS property of an element sets the padding space required on the left
     * side of an element. The padding area is the space between the content of the element and
     * its border. Contrary to margin-left values, negative values of padding-left are invalid.
     */
    @JsOverlay public final CssProps paddingLeft(String paddingLeft) {
        setPaddingLeft(paddingLeft);
        return this;
    }

    @JsProperty public native String getPaddingRight();
    @JsProperty public native void setPaddingRight(String paddingRight);

    /**
     * The padding-right CSS property of an element sets the padding space required on the right
     * side of an element. The padding area is the space between the content of the element and
     * its border. Contrary to margin-right values, negative values of padding-right are invalid.
     */
    @JsOverlay public final CssProps paddingRight(String paddingRight) {
        setPaddingRight(paddingRight);
        return this;
    }

    @JsProperty public native String getPaddingTop();
    @JsProperty public native void setPaddingTop(String paddingTop);

    /**
     * The padding-top CSS property of an element sets the padding space required on the top of
     * an element. The padding area is the space between the content of the element and its
     * border. Contrary to margin-top values, negative values of padding-top are invalid.
     */
    @JsOverlay public final CssProps paddingTop(String paddingTop) {
        setPaddingTop(paddingTop);
        return this;
    }

    @JsProperty public native String getPageBreakAfter();
    @JsProperty public native void setPageBreakAfter(String pageBreakAfter);

    /**
     * The page-break-after property is supported in all major browsers. With CSS3, page-break-*
     * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines
     * breaks for all CSS box fragmentation.
     */
    @JsOverlay public final CssProps pageBreakAfter(String pageBreakAfter) {
        setPageBreakAfter(pageBreakAfter);
        return this;
    }

    @JsProperty public native String getPageBreakBefore();
    @JsProperty public native void setPageBreakBefore(String pageBreakBefore);

    /**
     * The page-break-after property is supported in all major browsers. With CSS3, page-break-*
     * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines
     * breaks for all CSS box fragmentation.
     */
    @JsOverlay public final CssProps pageBreakBefore(String pageBreakBefore) {
        setPageBreakBefore(pageBreakBefore);
        return this;
    }

    @JsProperty public native String getPageBreakInside();
    @JsProperty public native void setPageBreakInside(String pageBreakInside);

    /**
     * Sets the page-breaking behavior inside an element. With CSS3, page-break-* properties
     * are only aliases of the break-* properties. The CSS3 Fragmentation spec defines breaks
     * for all CSS box fragmentation.
     */
    @JsOverlay public final CssProps pageBreakInside(String pageBreakInside) {
        setPageBreakInside(pageBreakInside);
        return this;
    }

    @JsProperty public native String getPause();
    @JsProperty public native void setPause(String pause);

    /**
     * The pause property determines how long a speech media agent should pause before and after
     * presenting an element. It is a shorthand for the pause-before and pause-after properties.
     */
    @JsOverlay public final CssProps pause(String pause) {
        setPause(pause);
        return this;
    }

    @JsProperty public native String getPauseAfter();
    @JsProperty public native void setPauseAfter(String pauseAfter);

    /**
     * The pause-after property determines how long a speech media agent should pause after
     * presenting an element. It may be replaced by the shorthand property pause, which sets
     * pause time before and after.
     */
    @JsOverlay public final CssProps pauseAfter(String pauseAfter) {
        setPauseAfter(pauseAfter);
        return this;
    }

    @JsProperty public native String getPauseBefore();
    @JsProperty public native void setPauseBefore(String pauseBefore);

    /**
     * The pause-before property determines how long a speech media agent should pause before
     * presenting an element. It may be replaced by the shorthand property pause, which sets
     * pause time before and after.
     */
    @JsOverlay public final CssProps pauseBefore(String pauseBefore) {
        setPauseBefore(pauseBefore);
        return this;
    }

    @JsProperty public native String getPerspective();
    @JsProperty public native void setPerspective(String perspective);

    /**
     * The perspective property defines how far an element is placed from the view on the
     * z-axis, from the screen to the viewer.
     *
     * Perspective defines how an object is viewed. In graphic arts, perspective is the
     * representation on a flat surface of what the viewer's eye would see in a 3D space.
     * (See Wikipedia for more information about graphical perspective and for related
     * illustrations.)
     *
     * The illusion of perspective on a flat surface, such as a computer screen, is created
     * by projecting points on the flat surface as they would appear if the flat surface
     * were a window through which the viewer was looking at the object. In discussion of
     * virtual environments, this flat surface is called a projection plane.
     */
    @JsOverlay public final CssProps perspective(String perspective) {
        setPerspective(perspective);
        return this;
    }

    @JsProperty public native String getPerspectiveOrigin();
    @JsProperty public native void setPerspectiveOrigin(String perspectiveOrigin);

    /**
     * The perspective-origin property establishes the origin for the perspective property. It
     * effectively sets the X and Y position at which the viewer appears to be looking at the
     * children of the element.
     *
     * When used with perspective, perspective-origin changes the appearance of an object, as
     * if a viewer were looking at it from a different origin. An object appears differently
     * if a viewer is looking directly at it versus looking at it from below, above, or from
     * the side. Thus, the perspective-origin is like a vanishing point.
     *
     * The default value of perspective-origin is 50% 50%. This displays an object as if the
     * viewer's eye were positioned directly at the center of the screen, both top-to-bottom
     * and left-to-right. A value of 0% 0% changes the object as if the viewer was looking
     * toward the top left angle. A value of 100% 100% changes the appearance as if viewed
     * toward the bottom right angle.
     */
    @JsOverlay public final CssProps perspectiveOrigin(String perspectiveOrigin) {
        setPerspectiveOrigin(perspectiveOrigin);
        return this;
    }

    @JsProperty public native String getPointerEvents();
    @JsProperty public native void setPointerEvents(String pointerEvents);

    /**
     * The pointer-events property allows you to control whether an element can be the target
     * for the pointing device (e.g, mouse, pen) events.
     */
    @JsOverlay public final CssProps pointerEvents(String pointerEvents) {
        setPointerEvents(pointerEvents);
        return this;
    }

    @JsProperty public native String getPosition();
    @JsProperty public native void setPosition(String position);

    /**
     * The position property controls the type of positioning used by an element within its
     * parent elements. The effect of the position property depends on a lot of factors, for
     * example the position property of parent elements.
     */
    @JsOverlay public final CssProps position(String position) {
        setPosition(position);
        return this;
    }

    @JsProperty public native String getQuotes();
    @JsProperty public native void setQuotes(String quotes);

    /**
     * Sets the type of quotation marks for embedded quotations.
     */
    @JsOverlay public final CssProps quotes(String quotes) {
        setQuotes(quotes);
        return this;
    }

    @JsProperty public native String getRegionFragment();
    @JsProperty public native void setRegionFragment(String regionFragment);

    /**
     * Controls whether the last region in a chain displays additional 'overset' content
     * according its default overflow property, or if it displays a fragment of content as
     * if it were flowing into a subsequent region.
     */
    @JsOverlay public final CssProps regionFragment(String regionFragment) {
        setRegionFragment(regionFragment);
        return this;
    }

    @JsProperty public native String getRestAfter();
    @JsProperty public native void setRestAfter(String restAfter);

    /**
     * The rest-after property determines how long a speech media agent should pause after
     * presenting an element's main content, before presenting that element's exit cue sound.
     * It may be replaced by the shorthand property rest, which sets rest time before and after.
     */
    @JsOverlay public final CssProps restAfter(String restAfter) {
        setRestAfter(restAfter);
        return this;
    }

    @JsProperty public native String getRestBefore();
    @JsProperty public native void setRestBefore(String restBefore);

    /**
     * The rest-before property determines how long a speech media agent should pause after
     * presenting an intro cue sound for an element, before presenting that element's main
     * content. It may be replaced by the shorthand property rest, which sets rest time before
     * and after.
     */
    @JsOverlay public final CssProps restBefore(String restBefore) {
        setRestBefore(restBefore);
        return this;
    }

    @JsProperty public native String getRight();
    @JsProperty public native void setRight(String right);

    /**
     * Specifies the position an element in relation to the right side of the containing element.
     */
    @JsOverlay public final CssProps right(String right) {
        setRight(right);
        return this;
    }

    @JsProperty public native String getRubyAlign();
    @JsProperty public native void setRubyAlign(String rubyAlign);


    @JsOverlay public final CssProps rubyAlign(String rubyAlign) {
        setRubyAlign(rubyAlign);
        return this;
    }

    @JsProperty public native String getRubyPosition();
    @JsProperty public native void setRubyPosition(String rubyPosition);


    @JsOverlay public final CssProps rubyPosition(String rubyPosition) {
        setRubyPosition(rubyPosition);
        return this;
    }

    @JsProperty public native String getShapeImageThreshold();
    @JsProperty public native void setShapeImageThreshold(String shapeImageThreshold);

    /**
     * Defines the alpha channel threshold used to extract a shape from an image. Can be thought
     * of as a "minimum opacity" threshold; that is, a value of 0.5 means that the shape will
     * enclose all the pixels that are more than 50% opaque.
     */
    @JsOverlay public final CssProps shapeImageThreshold(String shapeImageThreshold) {
        setShapeImageThreshold(shapeImageThreshold);
        return this;
    }

    @JsProperty public native String getShapeInside();
    @JsProperty public native void setShapeInside(String shapeInside);

    /**
     * A future level of CSS Shapes will define a shape-inside property, which will define a
     * shape to wrap content within the element. See Editor's Draft
     */
    @JsOverlay public final CssProps shapeInside(String shapeInside) {
        setShapeInside(shapeInside);
        return this;
    }

    @JsProperty public native String getShapeMargin();
    @JsProperty public native void setShapeMargin(String shapeMargin);

    /**
     * Adds a margin to a shape-outside. In effect, defines a new shape that is the smallest
     * contour around all the points that are the shape-margin distance outward perpendicular
     * to each point on the underlying shape. For points where a perpendicular direction is
     * not defined (e.g., a triangle corner), takes all points on a circle centered at the
     * point and with a radius of the shape-margin distance. This property accepts only
     * non-negative values.
     */
    @JsOverlay public final CssProps shapeMargin(String shapeMargin) {
        setShapeMargin(shapeMargin);
        return this;
    }

    @JsProperty public native String getShapeOutside();
    @JsProperty public native void setShapeOutside(String shapeOutside);

    /**
     * Declares a shape around which text should be wrapped, with possible modifications
     * from the shape-margin property. The shape defined by shape-outside and shape-margin
     * changes the geometry of a float element's float area.
     */
    @JsOverlay public final CssProps shapeOutside(String shapeOutside) {
        setShapeOutside(shapeOutside);
        return this;
    }

    @JsProperty public native String getSpeak();
    @JsProperty public native void setSpeak(String speak);

    /**
     * The speak property determines whether or not a speech synthesizer will read aloud
     * the contents of an element.
     */
    @JsOverlay public final CssProps speak(String speak) {
        setSpeak(speak);
        return this;
    }

    @JsProperty public native String getSpeakAs();
    @JsProperty public native void setSpeakAs(String speakAs);

    /**
     * The speak-as property determines how the speech synthesizer interprets the content:
     * words as whole words or as a sequence of letters, numbers as a numerical value or a
     * sequence of digits, punctuation as pauses in speech or named punctuation characters.
     */
    @JsOverlay public final CssProps speakAs(String speakAs) {
        setSpeakAs(speakAs);
        return this;
    }

    @JsProperty public native String getTabSize();
    @JsProperty public native void setTabSize(String tabSize);

    /**
     * The tab-size CSS property is used to customise the width of a tab (U+0009) character.
     */
    @JsOverlay public final CssProps tabSize(String tabSize) {
        setTabSize(tabSize);
        return this;
    }

    @JsProperty public native String getTableLayout();
    @JsProperty public native void setTableLayout(String tableLayout);

    /**
     * The 'table-layout' property controls the algorithm used to lay out the table cells,
     * rows, and columns.
     */
    @JsOverlay public final CssProps tableLayout(String tableLayout) {
        setTableLayout(tableLayout);
        return this;
    }

    @JsProperty public native String getTextAlign();
    @JsProperty public native void setTextAlign(String textAlign);

    /**
     * The text-align CSS property describes how inline content like text is aligned in
     * its parent block element. text-align does not control the alignment of block
     * elements itself, only their inline content.
     */
    @JsOverlay public final CssProps textAlign(String textAlign) {
        setTextAlign(textAlign);
        return this;
    }

    @JsProperty public native String getTextAlignLast();
    @JsProperty public native void setTextAlignLast(String textAlignLast);

    /**
     * The text-align-last CSS property describes how the last line of a block element or
     * a line before line break is aligned in its parent block element.
     */
    @JsOverlay public final CssProps textAlignLast(String textAlignLast) {
        setTextAlignLast(textAlignLast);
        return this;
    }

    @JsProperty public native String getTextDecoration();
    @JsProperty public native void setTextDecoration(String textDecoration);

    /**
     * The text-decoration CSS property is used to set the text formatting to underline,
     * overline, line-through or blink.
     *
     * underline and overline decorations are positioned under the text, line-through over it.
     */
    @JsOverlay public final CssProps textDecoration(String textDecoration) {
        setTextDecoration(textDecoration);
        return this;
    }

    @JsProperty public native String getTextDecorationColor();
    @JsProperty public native void setTextDecorationColor(String textDecorationColor);

    /**
     * Sets the color of any text decoration, such as underlines, overlines, and strike throughs.
     */
    @JsOverlay public final CssProps textDecorationColor(String textDecorationColor) {
        setTextDecorationColor(textDecorationColor);
        return this;
    }

    @JsProperty public native String getTextDecorationLine();
    @JsProperty public native void setTextDecorationLine(String textDecorationLine);

    /**
     * Sets what kind of line decorations are added to an element, such as underlines, overlines, etc.
     */
    @JsOverlay public final CssProps textDecorationLine(String textDecorationLine) {
        setTextDecorationLine(textDecorationLine);
        return this;
    }

    @JsProperty public native String getTextDecorationLineThrough();
    @JsProperty public native void setTextDecorationLineThrough(String textDecorationLineThrough);


    @JsOverlay public final CssProps textDecorationLineThrough(String textDecorationLineThrough) {
        setTextDecorationLineThrough(textDecorationLineThrough);
        return this;
    }

    @JsProperty public native String getTextDecorationNone();
    @JsProperty public native void setTextDecorationNone(String textDecorationNone);


    @JsOverlay public final CssProps textDecorationNone(String textDecorationNone) {
        setTextDecorationNone(textDecorationNone);
        return this;
    }

    @JsProperty public native String getTextDecorationOverline();
    @JsProperty public native void setTextDecorationOverline(String textDecorationOverline);


    @JsOverlay public final CssProps textDecorationOverline(String textDecorationOverline) {
        setTextDecorationOverline(textDecorationOverline);
        return this;
    }

    @JsProperty public native String getTextDecorationSkip();
    @JsProperty public native void setTextDecorationSkip(String textDecorationSkip);

    /**
     * Specifies what parts of an element’s content are skipped over when applying any text decoration.
     */
    @JsOverlay public final CssProps textDecorationSkip(String textDecorationSkip) {
        setTextDecorationSkip(textDecorationSkip);
        return this;
    }

    @JsProperty public native String getTextDecorationStyle();
    @JsProperty public native void setTextDecorationStyle(String textDecorationStyle);

    /**
     * This property specifies the style of the text decoration line drawn on the specified element.
     * The intended meaning for the values are the same as those of the border-style-properties.
     */
    @JsOverlay public final CssProps textDecorationStyle(String textDecorationStyle) {
        setTextDecorationStyle(textDecorationStyle);
        return this;
    }

    @JsProperty public native String getTextDecorationUnderline();
    @JsProperty public native void setTextDecorationUnderline(String textDecorationUnderline);


    @JsOverlay public final CssProps textDecorationUnderline(String textDecorationUnderline) {
        setTextDecorationUnderline(textDecorationUnderline);
        return this;
    }

    @JsProperty public native String getTextEmphasis();
    @JsProperty public native void setTextEmphasis(String textEmphasis);

    /**
     * The text-emphasis property will apply special emphasis marks to the elements text. Slightly
     * similar to the text-decoration property only that this property can have affect on the
     * line-height. It also is noted that this is shorthand for text-emphasis-style and for
     * text-emphasis-color.
     */
    @JsOverlay public final CssProps textEmphasis(String textEmphasis) {
        setTextEmphasis(textEmphasis);
        return this;
    }

    @JsProperty public native String getTextEmphasisColor();
    @JsProperty public native void setTextEmphasisColor(String textEmphasisColor);

    /**
     * The text-emphasis-color property specifies the foreground color of the emphasis marks.
     */
    @JsOverlay public final CssProps textEmphasisColor(String textEmphasisColor) {
        setTextEmphasisColor(textEmphasisColor);
        return this;
    }

    @JsProperty public native String getTextEmphasisStyle();
    @JsProperty public native void setTextEmphasisStyle(String textEmphasisStyle);

    /**
     * The text-emphasis-style property applies special emphasis marks to an element's text.
     */
    @JsOverlay public final CssProps textEmphasisStyle(String textEmphasisStyle) {
        setTextEmphasisStyle(textEmphasisStyle);
        return this;
    }

    @JsProperty public native String getTextHeight();
    @JsProperty public native void setTextHeight(String textHeight);

    /**
     * This property helps determine an inline box's block-progression dimension, derived from
     * the text-height and font-size properties for non-replaced elements, the height or the
     * width for replaced elements, and the stacked block-progression dimension for
     * inline-block elements. The block-progression dimension determines the position of the
     * padding, border and margin for the element.
     */
    @JsOverlay public final CssProps textHeight(String textHeight) {
        setTextHeight(textHeight);
        return this;
    }

    @JsProperty public native String getTextIndent();
    @JsProperty public native void setTextIndent(String textIndent);

    /**
     * Specifies the amount of space horizontally that should be left on the first line of the
     * text of an element. This horizontal spacing is at the beginning of the first line and
     * is in respect to the left edge of the containing block box.
     */
    @JsOverlay public final CssProps textIndent(String textIndent) {
        setTextIndent(textIndent);
        return this;
    }

    @JsProperty public native String getTextJustifyTrim();
    @JsProperty public native void setTextJustifyTrim(String textJustifyTrim);


    @JsOverlay public final CssProps textJustifyTrim(String textJustifyTrim) {
        setTextJustifyTrim(textJustifyTrim);
        return this;
    }

    @JsProperty public native String getTextKashidaSpace();
    @JsProperty public native void setTextKashidaSpace(String textKashidaSpace);


    @JsOverlay public final CssProps textKashidaSpace(String textKashidaSpace) {
        setTextKashidaSpace(textKashidaSpace);
        return this;
    }

    @JsProperty public native String getTextLineThroughWidth();
    @JsProperty public native void setTextLineThroughWidth(String textLineThroughWidth);

    /**
     * Specifies the line width for the line-through text decoration.
     */
    @JsOverlay public final CssProps textLineThroughWidth(String textLineThroughWidth) {
        setTextLineThroughWidth(textLineThroughWidth);
        return this;
    }

    @JsProperty public native String getTextOverflow();
    @JsProperty public native void setTextOverflow(String textOverflow);

    /**
     * The text-overflow shorthand CSS property determines how overflowed content that is not
     * displayed is signaled to the users. It can be clipped, display an ellipsis ('…',
     * U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string. It covers the two long-hand
     * properties text-overflow-mode and text-overflow-ellipsis
     */
    @JsOverlay public final CssProps textOverflow(String textOverflow) {
        setTextOverflow(textOverflow);
        return this;
    }

    @JsProperty public native String getTextOverline();
    @JsProperty public native void setTextOverline(String textOverline);

    /**
     * The text-overline property is the shorthand for the text-overline-style,
     * text-overline-width, text-overline-color, and text-overline-mode properties.
     */
    @JsOverlay public final CssProps textOverline(String textOverline) {
        setTextOverline(textOverline);
        return this;
    }

    @JsProperty public native String getTextOverlineColor();
    @JsProperty public native void setTextOverlineColor(String textOverlineColor);

    /**
     * Specifies the line color for the overline text decoration.
     */
    @JsOverlay public final CssProps textOverlineColor(String textOverlineColor) {
        setTextOverlineColor(textOverlineColor);
        return this;
    }

    @JsProperty public native String getTextOverlineMode();
    @JsProperty public native void setTextOverlineMode(String textOverlineMode);

    /**
     * Sets the mode for the overline text decoration, determining whether the text decoration
     * affects the space characters or not.
     */
    @JsOverlay public final CssProps textOverlineMode(String textOverlineMode) {
        setTextOverlineMode(textOverlineMode);
        return this;
    }

    @JsProperty public native String getTextOverlineStyle();
    @JsProperty public native void setTextOverlineStyle(String textOverlineStyle);

    /**
     * Specifies the line style for overline text decoration.
     */
    @JsOverlay public final CssProps textOverlineStyle(String textOverlineStyle) {
        setTextOverlineStyle(textOverlineStyle);
        return this;
    }

    @JsProperty public native String getTextOverlineWidth();
    @JsProperty public native void setTextOverlineWidth(String textOverlineWidth);

    /**
     * Specifies the line width for the overline text decoration.
     */
    @JsOverlay public final CssProps textOverlineWidth(String textOverlineWidth) {
        setTextOverlineWidth(textOverlineWidth);
        return this;
    }

    @JsProperty public native String getTextRendering();
    @JsProperty public native void setTextRendering(String textRendering);

    /**
     * The text-rendering CSS property provides information to the browser about how to optimize
     * when rendering text. Options are: legibility, speed or geometric precision.
     */
    @JsOverlay public final CssProps textRendering(String textRendering) {
        setTextRendering(textRendering);
        return this;
    }

    @JsProperty public native String getTextShadow();
    @JsProperty public native void setTextShadow(String textShadow);

    /**
     * The CSS text-shadow property applies one or more drop shadows to the text and
     * text-decorations of an element. Each shadow is specified as an offset from the text,
     * along with optional color and blur radius values.
     */
    @JsOverlay public final CssProps textShadow(String textShadow) {
        setTextShadow(textShadow);
        return this;
    }

    @JsProperty public native String getTextTransform();
    @JsProperty public native void setTextTransform(String textTransform);

    /**
     * This property transforms text for styling purposes. (It has no effect on the underlying
     * content.)
     */
    @JsOverlay public final CssProps textTransform(String textTransform) {
        setTextTransform(textTransform);
        return this;
    }

    @JsProperty public native String getTop();
    @JsProperty public native void setTop(String top);

    /**
     * This property specifies how far an absolutely positioned box's top margin edge is offset
     * below the top edge of the box's containing block. For relatively positioned boxes, the
     * offset is with respect to the top edges of the box itself (i.e., the box is given a
     * position in the normal flow, then offset from that position according to these properties).
     */
    @JsOverlay public final CssProps top(String top) {
        setTop(top);
        return this;
    }

    @JsProperty public native String getTouchAction();
    @JsProperty public native void setTouchAction(String touchAction);

    /**
     * Determines whether touch input may trigger default behavior supplied by the user agent,
     * such as panning or zooming.
     */
    @JsOverlay public final CssProps touchAction(String touchAction) {
        setTouchAction(touchAction);
        return this;
    }

    @JsProperty public native String getTransform();
    @JsProperty public native void setTransform(String transform);

    /**
     * CSS transforms allow elements styled with CSS to be transformed in two-dimensional or
     * three-dimensional space. Using this property, elements can be translated, rotated, scaled,
     * and skewed. The value list may consist of 2D and/or 3D transform values.
     */
    @JsOverlay public final CssProps transform(String transform) {
        setTransform(transform);
        return this;
    }

    @JsProperty public native String getTransformOrigin();
    @JsProperty public native void setTransformOrigin(String transformOrigin);

    /**
     * This property defines the origin of the transformation axes relative to the element to
     * which the transformation is applied.
     */
    @JsOverlay public final CssProps transformOrigin(String transformOrigin) {
        setTransformOrigin(transformOrigin);
        return this;
    }

    @JsProperty public native String getTransformOriginZ();
    @JsProperty public native void setTransformOriginZ(String transformOriginZ);

    /**
     * This property allows you to define the relative position of the origin of the transformation
     * grid along the z-axis.
     */
    @JsOverlay public final CssProps transformOriginZ(String transformOriginZ) {
        setTransformOriginZ(transformOriginZ);
        return this;
    }

    @JsProperty public native String getTransformStyle();
    @JsProperty public native void setTransformStyle(String transformStyle);

    /**
     * This property specifies how nested elements are rendered in 3D space relative to their parent.
     */
    @JsOverlay public final CssProps transformStyle(String transformStyle) {
        setTransformStyle(transformStyle);
        return this;
    }

    @JsProperty public native String getTransition();
    @JsProperty public native void setTransition(String transition);

    /**
     * The transition CSS property is a shorthand property for transition-property,
     * transition-duration, transition-timing-function, and transition-delay. It allows to define
     * the transition between two states of an element.
     */
    @JsOverlay public final CssProps transition(String transition) {
        setTransition(transition);
        return this;
    }

    @JsProperty public native String getTransitionDelay();
    @JsProperty public native void setTransitionDelay(String transitionDelay);

    /**
     * Defines when the transition will start. A value of ‘0s’ means the transition will execute
     * as soon as the property is changed. Otherwise, the value specifies an offset from the
     * moment the property is changed, and the transition will delay execution by that offset.
     */
    @JsOverlay public final CssProps transitionDelay(String transitionDelay) {
        setTransitionDelay(transitionDelay);
        return this;
    }

    @JsProperty public native String getTransitionDuration();
    @JsProperty public native void setTransitionDuration(String transitionDuration);

    /**
     * The 'transition-duration' property specifies the length of time a transition animation
     * takes to complete.
     */
    @JsOverlay public final CssProps transitionDuration(String transitionDuration) {
        setTransitionDuration(transitionDuration);
        return this;
    }

    @JsProperty public native String getTransitionProperty();
    @JsProperty public native void setTransitionProperty(String transitionProperty);

    /**
     * The 'transition-property' property specifies the name of the CSS property to which the
     * transition is applied.
     */
    @JsOverlay public final CssProps transitionProperty(String transitionProperty) {
        setTransitionProperty(transitionProperty);
        return this;
    }

    @JsProperty public native String getTransitionTimingFunction();
    @JsProperty public native void setTransitionTimingFunction(String transitionTimingFunction);

    /**
     * Sets the pace of action within a transition
     */
    @JsOverlay public final CssProps transitionTimingFunction(String transitionTimingFunction) {
        setTransitionTimingFunction(transitionTimingFunction);
        return this;
    }

    /**
     * The unicode-bidi CSS property specifies the level of embedding with respect to the
     * bidirectional algorithm.
     */
    @JsProperty public native String getUnicodeBidi();
    @JsProperty public native void setUnicodeBidi(String unicodeBidi);


    @JsOverlay public final CssProps unicodeBidi(String unicodeBidi) {
        setUnicodeBidi(unicodeBidi);
        return this;
    }

    @JsProperty public native String getUnicodeRange();
    @JsProperty public native void setUnicodeRange(String unicodeRange);

    /**
     * unicode-range allows you to set a specific range of characters to be downloaded from a
     * font (embedded using @font-face) and made available for use on the current page.
     */
    @JsOverlay public final CssProps unicodeRange(String unicodeRange) {
        setUnicodeRange(unicodeRange);
        return this;
    }

    @JsProperty public native String getUserFocus();
    @JsProperty public native void setUserFocus(String userFocus);

    /**
     * This is for all the high level UX stuff.
     */
    @JsOverlay public final CssProps userFocus(String userFocus) {
        setUserFocus(userFocus);
        return this;
    }

    @JsProperty public native String getUserInput();
    @JsProperty public native void setUserInput(String userInput);

    /**
     * For inputing user content
     */
    @JsOverlay public final CssProps userInput(String userInput) {
        setUserInput(userInput);
        return this;
    }

    @JsProperty public native String getVerticalAlign();
    @JsProperty public native void setVerticalAlign(String verticalAlign);

    /**
     * The vertical-align property controls how inline elements or text are vertically aligned
     * compared to the baseline. If this property is used on table-cells it controls the vertical
     * alignment of content of the table cell.
     */
    @JsOverlay public final CssProps verticalAlign(String verticalAlign) {
        setVerticalAlign(verticalAlign);
        return this;
    }

    @JsProperty public native String getVisibility();
    @JsProperty public native void setVisibility(String visibility);

    /**
     * The visibility property specifies whether the boxes generated by an element are rendered.
     */
    @JsOverlay public final CssProps visibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    @JsProperty public native String getVoiceBalance();
    @JsProperty public native void setVoiceBalance(String voiceBalance);

    /**
     * The voice-balance property sets the apparent position (in stereo sound) of the synthesized
     * voice for spoken media.
     */
    @JsOverlay public final CssProps voiceBalance(String voiceBalance) {
        setVoiceBalance(voiceBalance);
        return this;
    }

    @JsProperty public native String getVoiceDuration();
    @JsProperty public native void setVoiceDuration(String voiceDuration);

    /**
     * The voice-duration property allows the author to explicitly set the amount of time it should
     * take a speech synthesizer to read an element's content, for example to allow the speech to
     * be synchronized with other media. With a value of auto (the default) the length of time it
     * takes to read the content is determined by the content itself and the voice-rate property.
     */
    @JsOverlay public final CssProps voiceDuration(String voiceDuration) {
        setVoiceDuration(voiceDuration);
        return this;
    }

    @JsProperty public native String getVoiceFamily();
    @JsProperty public native void setVoiceFamily(String voiceFamily);

    /**
     * The voice-family property sets the speaker's voice used by a speech media agent to read an
     * element. The speaker may be specified as a named character (to match a voice option in the
     * speech reading software) or as a generic description of the age and gender of the voice.
     * Similar to the font-family property for visual media, a comma-separated list of fallback
     * options may be given in case the speech reader does not recognize the character name or
     * cannot synthesize the requested combination of generic properties.
     */
    @JsOverlay public final CssProps voiceFamily(String voiceFamily) {
        setVoiceFamily(voiceFamily);
        return this;
    }

    @JsProperty public native String getVoicePitch();
    @JsProperty public native void setVoicePitch(String voicePitch);

    /**
     * The voice-pitch property sets pitch or tone (high or low) for the synthesized speech when
     * reading an element; the pitch may be specified absolutely or relative to the normal pitch
     * for the voice-family used to read the text.
     */
    @JsOverlay public final CssProps voicePitch(String voicePitch) {
        setVoicePitch(voicePitch);
        return this;
    }

    @JsProperty public native String getVoiceRange();
    @JsProperty public native void setVoiceRange(String voiceRange);

    /**
     * The voice-range property determines how much variation in pitch or tone will be created by
     * the speech synthesize when reading an element. Emphasized text, grammatical structures and
     * punctuation may all be rendered as changes in pitch, this property determines how strong
     * or obvious those changes are; large ranges are associated with enthusiastic or emotional
     * speech, while small ranges are associated with flat or mechanical speech.
     */
    @JsOverlay public final CssProps voiceRange(String voiceRange) {
        setVoiceRange(voiceRange);
        return this;
    }

    @JsProperty public native String getVoiceRate();
    @JsProperty public native void setVoiceRate(String voiceRate);

    /**
     * The voice-rate property sets the speed at which the voice synthesized by a speech media
     * agent will read content.
     */
    @JsOverlay public final CssProps voiceRate(String voiceRate) {
        setVoiceRate(voiceRate);
        return this;
    }

    @JsProperty public native String getVoiceStress();
    @JsProperty public native void setVoiceStress(String voiceStress);

    /**
     * The voice-stress property sets the level of vocal emphasis to be used for synthesized
     * speech reading the element.
     */
    @JsOverlay public final CssProps voiceStress(String voiceStress) {
        setVoiceStress(voiceStress);
        return this;
    }

    @JsProperty public native String getVoiceVolume();
    @JsProperty public native void setVoiceVolume(String voiceVolume);

    /**
     * The voice-volume property sets the volume for spoken content in speech media. It replaces
     * the deprecated volume property.
     */
    @JsOverlay public final CssProps voiceVolume(String voiceVolume) {
        setVoiceVolume(voiceVolume);
        return this;
    }

    @JsProperty public native String getWhiteSpace();
    @JsProperty public native void setWhiteSpace(String whiteSpace);

    /**
     * The white-space property controls whether and how white space inside the element is
     * collapsed, and whether lines may wrap at unforced "soft wrap" opportunities.
     */
    @JsOverlay public final CssProps whiteSpace(String whiteSpace) {
        setWhiteSpace(whiteSpace);
        return this;
    }

    @JsProperty public native String getWidth();
    @JsProperty public native void setWidth(String width);

    /**
     * Specifies the width of the content area of an element. The content area of the element
     * width does not include the padding, border, and margin of the element.
     */
    @JsOverlay public final CssProps width(String width) {
        setWidth(width);
        return this;
    }

    @JsProperty public native String getWordBreak();
    @JsProperty public native void setWordBreak(String wordBreak);

    /**
     * The word-break property is often used when there is long generated content that is
     * strung together without and spaces or hyphens to beak apart. A common case of this is when
     * there is a long URL that does not have any hyphens. This case could potentially cause the
     * breaking of the layout as it could extend past the parent element.
     */
    @JsOverlay public final CssProps wordBreak(String wordBreak) {
        setWordBreak(wordBreak);
        return this;
    }

    @JsProperty public native String getWordSpacing();
    @JsProperty public native void setWordSpacing(String wordSpacing);

    /**
     * The word-spacing CSS property specifies the spacing behavior between "words".
     */
    @JsOverlay public final CssProps wordSpacing(String wordSpacing) {
        setWordSpacing(wordSpacing);
        return this;
    }

    @JsProperty public native String getWordWrap();
    @JsProperty public native void setWordWrap(String wordWrap);

    /**
     * An alias of css/properties/overflow-wrap, word-wrap defines whether to break words when
     * the content exceeds the boundaries of its container.
     */
    @JsOverlay public final CssProps wordWrap(String wordWrap) {
        setWordWrap(wordWrap);
        return this;
    }

    @JsProperty public native String getWrapFlow();
    @JsProperty public native void setWrapFlow(String wrapFlow);

    /**
     * Specifies how exclusions affect inline content within block-level elements. Elements lay
     * out their inline content in their content area but wrap around exclusion areas.
     */
    @JsOverlay public final CssProps wrapFlow(String wrapFlow) {
        setWrapFlow(wrapFlow);
        return this;
    }

    @JsProperty public native String getWrapMargin();
    @JsProperty public native void setWrapMargin(String wrapMargin);

    /**
     * Set the value that is used to offset the inner wrap shape from other shapes. Inline
     * content that intersects a shape with this property will be pushed by this shape's margin.
     */
    @JsOverlay public final CssProps wrapMargin(String wrapMargin) {
        setWrapMargin(wrapMargin);
        return this;
    }

    @JsProperty public native String getWritingMode();
    @JsProperty public native void setWritingMode(String writingMode);

    /**
     * writing-mode specifies if lines of text are laid out horizontally or vertically, and the
     * direction which lines of text and blocks progress.
     */
    @JsOverlay public final CssProps writingMode(String writingMode) {
        setWritingMode(writingMode);
        return this;
    }
}
