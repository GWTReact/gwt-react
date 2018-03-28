package gwt.react.client.proptypes.html;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.proptypes.html.cssPropertyTypes.AnimationFillMode;
import gwt.react.client.proptypes.html.cssPropertyTypes.Visibility;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * This class represents properties of the CSS style object.
 *
 * NOTE: this is very much a work in progress. Further refinements will include
 * defining enumerations for many of the properties
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CssProps extends JsPlainObj {

    @JsProperty public String animationFillMode;
    

    @JsOverlay public final CssProps animationFillMode(AnimationFillMode mode) {
        animationFillMode = mode.name();
        return this;
    }

    @JsProperty public String backgroundColor;
    
    @JsOverlay public final CssProps backgroundColor(String s) {
        backgroundColor = s;
        return this;
    }

    @JsProperty public int boxFlex;
    
    

    @JsOverlay public final CssProps boxFlex(int i) {
        boxFlex = i;
        return this;
    }

    @JsProperty public int boxFlexGroup;
    

    @JsOverlay public final CssProps boxFlexGroup(int i) {
        boxFlexGroup = i;
        return this;
    }

    @JsProperty public int columnCount;
    

    @JsOverlay public final CssProps columnCount(int i) {
        columnCount = i;
        return this;
    }

    @JsProperty public String flex;
    

    @JsOverlay public final CssProps flex(int i) {
        flex = Integer.toString(i);
        return this;
    }

    @JsOverlay public final CssProps flex(String s) {
        flex = s;
        return this;
    }

    @JsProperty public int flexGrow;
    

    @JsOverlay public final CssProps flexGrow(int i) {
        flexGrow = i;
        return this;
    }

    @JsProperty public int flexShrink;
    

    @JsOverlay public final CssProps flexShrink(int i) {
        flexShrink = i;
        return this;
    }

    @JsProperty public double fontWeight;
    

    @JsOverlay public final CssProps fontWeight(double d) {
        fontWeight = d;
        return this;
    }

    @JsProperty public double lineClamp;
    

    @JsOverlay public final CssProps lineClamp(double d) {
        lineClamp = d;
        return this;
    }

    @JsProperty public String lineHeight;
    

    @JsOverlay public final CssProps lineHeight(String s) {
        lineHeight = s;
        return this;
    }

    @JsProperty public double opacity;
    

    @JsOverlay public final CssProps opacity(double d) {
        opacity = d;
        return this;
    }

    @JsProperty public int order;
    

    @JsOverlay public final CssProps order(int i) {
        order = i;
        return this;
    }
    @JsProperty public int orphans;
    

    @JsOverlay public final CssProps orphans(int i) {
        orphans = i;
        return this;
    }

    @JsProperty public int widows;
    

    @JsOverlay public final CssProps widows(int i) {
        widows = i;
        return this;
    }

    @JsProperty public double zIndex;
    

    @JsOverlay public final CssProps zIndex(double d) {
        zIndex = d;
        return this;
    }

    @JsProperty public double zoom;
    

    @JsOverlay public final CssProps zoom(double d) {
        zoom = d;
        return this;
    }

    @JsProperty public String fontSize;
    

    @JsOverlay public final CssProps fontSize(String s) {
        fontSize = s;
        return this;
    }

    // SVG-related properties

    @JsProperty public double fillOpacity;
    

    @JsOverlay public final CssProps fillOpacity(double d) {
        fillOpacity = d;
        return this;
    }

    @JsProperty public String stroke;
    

    @JsOverlay public final CssProps stroke(String s) {
        stroke = s;
        return this;
    }

    @JsProperty public double strokeOpacity;
    

    @JsOverlay public final CssProps strokeOpacity(double d) {
        strokeOpacity = d;
        return this;
    }

    @JsProperty public String strokeWidth;
    

    @JsOverlay public final CssProps strokeWidth(String s) {
        strokeWidth = s;
        return this;
    }

    @JsProperty public String alignContent;
    

    /**
     * Aligns a flex container's lines within the flex container when there is extra space in the
     * cross-axis, similar to how justify-content aligns individual items within the main-axis.
     */
    @JsOverlay public final CssProps alignContent(String s) {
        alignContent = s;
        return this;
    }
    @JsProperty public String alignItems;
    

    /**
     * Sets the default alignment in the cross axis for all of the flex container's items,
     * including anonymous flex items, similarly to how justify-content aligns items along
     * the main axis.
     */
    @JsOverlay public final CssProps alignItems(String s) {
        alignItems = s;
        return this;
    }

    @JsProperty public String alignSelf;
    

    /**
     * Allows the default alignment to be overridden for individual flex items.
     */
    @JsOverlay public final CssProps alignSelf(String s) {
        alignSelf = s;
        return this;
    }

    @JsProperty public String alignmentAdjust;
    

    /**
     * This property allows precise alignment of elements, such as graphics, that do not have a
     * baseline-table or lack the desired baseline in their baseline-table. With the
     * alignment-adjust property, the position of the baseline identified by the
     * alignment-baseline can be explicitly determined. It also determines precisely the
     * alignment point for each glyph within a textual element.
     */
    @JsOverlay public final CssProps alignmentAdjust(String s) {
        alignmentAdjust = s;
        return this;
    }

    @JsProperty public String alignmentBaseline;
    
    @JsOverlay public final CssProps alignmentBaseline(String s) {
        alignmentBaseline = s;
        return this;
    }

    @JsProperty public String animationDelay;
    

    /**
     * Defines a length of time to elapse before an animation starts, allowing an animation to
     * begin execution some time after it is applied.
     */
    @JsOverlay public final CssProps animationDelay(String s) {
        animationDelay = s;
        return this;
    }

    @JsProperty public String animationDirection;
    

    /*
     * Defines whether an animation should run in reverse on some or all cycles.
    */
    @JsOverlay public final CssProps animationDirection(String s) {
        animationDirection = s;
        return this;
    }

    @JsProperty public String animationIterationCount;
    

    /**
     * Specifies how many times an animation cycle should play.
     */
    @JsOverlay public final CssProps animationIterationCount(String s) {
        animationIterationCount = s;
        return this;
    }

    @JsProperty public String animationName;
    

    /**
     * Defines the list of animations that apply to the element.
     */
    @JsOverlay public final CssProps animationName(String s) {
        animationName = s;
        return this;
    }

    @JsProperty public String animationPlayState;
    

    /**
     * Defines whether an animation is running or paused.
     */
    @JsOverlay public final CssProps animationPlayState(String s) {
        animationPlayState = s;
        return this;
    }

    @JsProperty public String appearance;
    

    /**
     * Allows changing the style of any element to platform-based interface elements or vice versa.
     */
    @JsOverlay public final CssProps appearance(String s) {
        appearance = s;
        return this;
    }

    @JsProperty public String backfaceVisibility;
    

    /**
     * Determines whether or not the "back" side of a transformed element is visible when facing
     * the viewer.
     */
    @JsOverlay public final CssProps backfaceVisibility(String s) {
        backfaceVisibility = s;
        return this;
    }

    @JsProperty public String backgroundBlendMode;
    

    /**
     * This property describes how the element's background images should blend with each other
     * and the element's background color. The value is a list of blend modes that corresponds
     * to each background image. Each element in the list will apply to the corresponding
     * element of background-image. If a property doesn't have enough comma-separated values to
     * match the number of layers, the UA must calculate its used value by repeating the list of
     * values until there are enough.
     */
    @JsOverlay public final CssProps backgroundBlendMode(String s) {
        backgroundBlendMode = s;
        return this;
    }

    @JsProperty public String backgroundComposite;
    

    @JsOverlay public final CssProps backgroundComposite(String s) {
        backgroundComposite = s;
        return this;
    }

    @JsProperty public String backgroundImage;
    

    /**
     * Applies one or more background images to an element. These can be any valid CSS image,
     * including url() paths to image files or CSS gradients.
     */
    @JsOverlay public final CssProps backgroundImage(String s) {
        backgroundImage = s;
        return this;
    }

    @JsProperty public String backgroundOrigin;
    

    /**
     * Specifies what the background-position property is relative to.
     */
    @JsOverlay public final CssProps backgroundOrigin(String s) {
        backgroundOrigin = s;
        return this;
    }

    @JsProperty public String backgroundPositionX;
    

    /**
     * Sets the horizontal position of a background image.
     */
    @JsOverlay public final CssProps backgroundPositionX(String s) {
        backgroundPositionX = s;
        return this;
    }

    @JsProperty public String backgroundRepeat;
    

    /**
     * Background-repeat defines if and how background images will be repeated after they have
     * been sized and positioned
     */
    @JsOverlay public final CssProps backgroundRepeat(String s) {
        backgroundRepeat = s;
        return this;
    }

    @JsProperty public String border;
    

    /**
     * Shorthand property that defines the different properties of all four sides of an element's
     * border in a single declaration. It can be used to set border-width, border-style and
     * border-color, or a subset of these.
     */
    @JsOverlay public final CssProps border(String s) {
        border = s;
        return this;
    }

    @JsProperty public String borderBottomLeftRadius;
    

    /**
     * Defines the shape of the border of the bottom-left corner.
     */
    @JsOverlay public final CssProps borderBottomLeftRadius(String s) {
        borderBottomLeftRadius = s;
        return this;
    }

    @JsProperty public String borderBottomRightRadius;
    

    /**
     * Defines the shape of the border of the bottom-right corner.
     */
    @JsOverlay public final CssProps borderBottomRightRadius(String s) {
        borderBottomRightRadius = s;
        return this;
    }

    @JsProperty public String borderBottomWidth;
    

    /**
     * Sets the width of an element's bottom border. To set all four borders, use the border-width
     * shorthand property which sets the values simultaneously for border-top-width,
     * border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderBottomWidth(String s) {
        borderBottomWidth = s;
        return this;
    }

    @JsProperty public String borderCollapse;
    

    /**
     * Border-collapse can be used for collapsing the borders between table cells
     */
    @JsOverlay public final CssProps borderCollapse(String s) {
        borderCollapse = s;
        return this;
    }

    @JsProperty public String borderColor;
    

    /**
     * The CSS border-color property sets the color of an element's four borders. This property can
     * have from one to four values, made up of the elementary properties:
     *      - border-top-color
     *      - border-right-color
     *      - border-bottom-color
     *      - border-left-color The default color is the currentColor of each of these values.
     * If you provide one value, it sets the color for the element. Two values set the horizontal
     * and vertical values, respectively. Providing three values sets the top, vertical, and bottom
     * values, in that order. Four values set all for sides: top, right, bottom, and left, in that
     * order.
     */
    @JsOverlay public final CssProps borderColor(String s) {
        borderColor = s;
        return this;
    }

    @JsProperty public String borderCornerShape;
    

    /**
     * Specifies different corner clipping effects, such as scoop (inner curves), bevel (straight
     * cuts) or notch (cut-off rectangles). Works along with border-radius to specify the size of each
     * corner effect.
     */
    @JsOverlay public final CssProps borderCornerShape(String s) {
        borderCornerShape = s;
        return this;
    }

    @JsProperty public String borderImageSource;
    

    /**
     * The property border-image-source is used to set the image to be used instead of the border
     * style. If this is set to none the border-style is used instead.
     */
    @JsOverlay public final CssProps borderImageSource(String s) {
        borderImageSource = s;
        return this;
    }

    @JsProperty public String borderImageWidth;
    

    /**
     * The border-image-width CSS property defines the offset to use for dividing the border image
     * in nine parts, the top-left corner, central top edge, top-right-corner, central right edge,
     * bottom-right corner, central bottom edge, bottom-left corner, and central right edge. They
     * represent inward distance from the top, right, bottom, and left edges.
     */
    @JsOverlay public final CssProps borderImageWidth(String s) {
        borderImageWidth = s;
        return this;
    }

    @JsProperty public String borderLeft;
    

    /**
     * Shorthand property that defines the border-width, border-style and border-color of an
     * element's left border in a single declaration. Note that you can use the corresponding
     * longhand properties to set specific individual properties of the left
     * border: border-left-width, border-left-style and border-left-color.
     */
    @JsOverlay public final CssProps borderLeft(String s) {
        borderLeft = s;
        return this;
    }

    @JsProperty public String borderLeftColor;
    

    /**
     * The CSS border-left-color property sets the color of an element's left border. This page
     * explains the border-left-color value, but often you will find it more convenient to fix
     * the border's left color as part of a shorthand set, either border-left or border-color.
     * Colors can be defined several ways. For more information, see Usage.
     */
    @JsOverlay public final CssProps borderLeftColor(String s) {
        borderLeftColor = s;
        return this;
    }

    @JsProperty public String borderLeftStyle;
    

    /**
     * Sets the style of an element's left border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderLeftStyle(String s) {
        borderLeftStyle = s;
        return this;
    }

    @JsProperty public String borderLeftWidth;
    

    /**
     * Sets the width of an element's left border. To set all four borders, use the border-width
     * shorthand property which sets the values simultaneously for border-top-width,
     * border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderLeftWidth(String s) {
        borderLeftWidth = s;
        return this;
    }

    @JsProperty public String borderRight;
    

    /**
     * Shorthand property that defines the border-width, border-style and border-color of an
     * element's right border in a single declaration. Note that you can use the corresponding
     * longhand properties to set specific individual properties of the right border:
     * border-right-width, border-right-style and border-right-color.
     */
    @JsOverlay public final CssProps borderRight(String s) {
        borderRight = s;
        return this;
    }

    @JsProperty public String borderRightColor;
    

    /**
     * Sets the color of an element's right border. This page explains the border-right-color
     * value, but often you will find it more convenient to fix the border's right color as
     * part of a shorthand set, either border-right or border-color.
     * Colors can be defined several ways. For more information, see Usage.
     */
    @JsOverlay public final CssProps borderRightColor(String s) {
        borderRightColor = s;
        return this;
    }

    @JsProperty public String borderRightStyle;
    

    /**
     * Sets the style of an element's right border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderRightStyle(String s) {
        borderRightStyle = s;
        return this;
    }

    @JsProperty public String borderRightWidth;
    

    /**
     * Sets the width of an element's right border. To set all four borders, use the
     * border-width shorthand property which sets the values simultaneously for
     * border-top-width, border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderRightWidth(String s) {
        borderRightWidth = s;
        return this;
    }
    @JsProperty public String borderSpacing;
    

    /**
     * Specifies the distance between the borders of adjacent cells.
     */
    @JsOverlay public final CssProps borderSpacing(String s) {
        borderSpacing = s;
        return this;
    }

    @JsProperty public String borderStyle;
    

    /**
     * Sets the style of an element's four borders. This property can have from one to four values.
     * With only one value, the value will be applied to all four borders; otherwise, this works
     * as a shorthand property for each of border-top-style, border-right-style,
     * border-bottom-style, border-left-style, where each border style may be assigned a separate value.
     */
    @JsOverlay public final CssProps borderStyle(String s) {
        borderStyle = s;
        return this;
    }
    @JsProperty public String borderTop;
    

    /**
     * Shorthand property that defines the border-width, border-style and border-color of an
     * element's top border in a single declaration. Note that you can use the corresponding
     * longhand properties to set specific individual properties of the top border:
     * border-top-width, border-top-style and border-top-color.
     */
    @JsOverlay public final CssProps borderTop(String s) {
        borderTop = s;
        return this;
    }

    @JsProperty public String borderTopColor;
    

    /**
     * Sets the color of an element's top border. This page explains the border-top-color value,
     * but often you will find it more convenient to fix the border's top color as part of a
     * shorthand set, either border-top or border-color.
     * Colors can be defined several ways. For more information, see Usage.
     */
    @JsOverlay public final CssProps borderTopColor(String s) {
        borderTopColor = s;
        return this;
    }

    @JsProperty public String borderTopLeftRadius;
    

    /**
     * Sets the rounding of the top-left corner of the element.
     */
    @JsOverlay public final CssProps borderTopLeftRadius(String s) {
        borderTopLeftRadius = s;
        return this;
    }

    @JsProperty public String borderTopRightRadius;
    

    /**
     * Sets the rounding of the top-right corner of the element.
     */
    @JsOverlay public final CssProps borderTopRightRadius(String s) {
        borderTopRightRadius = s;
        return this;
    }

    @JsProperty public String borderTopStyle;
    

    /**
     * Sets the style of an element's top border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderTopStyle(String s) {
        borderTopStyle = s;
        return this;
    }

    @JsProperty public String borderTopWidth;
    

    /**
     * Sets the width of an element's top border. To set all four borders, use the shorthand
     * property, border-style. Otherwise, you can set the borders individually with
     * border-top-style, border-right-style, border-bottom-style, border-left-style.
     */
    @JsOverlay public final CssProps borderTopWidth(String s) {
        borderTopWidth = s;
        return this;
    }

    @JsProperty public String borderWidth;
    

    /**
     * Sets the width of an element's four borders. This property can have from one to four values.
     * This is a shorthand property for setting values simultaneously for border-top-width,
     * border-right-width, border-bottom-width, and border-left-width.
     */
    @JsOverlay public final CssProps borderWidth(String s) {
        borderWidth = s;
        return this;
    }

    @JsProperty public String boxDecorationBreak;
    

    /**
     * Breaks a box into fragments creating new borders, padding and repeating backgrounds or lets
     * it stay as a continuous box on a page break, column break, or, for inline elements, at a
     * line break.
     */
    @JsOverlay public final CssProps boxDecorationBreak(String s) {
        boxDecorationBreak = s;
        return this;
    }
    @JsProperty public String boxLineProgression;
    

    /**
     * Do not use. This property has been replaced by the flex-wrap property.
     * Gets or sets a value that specifies the direction to add successive rows or columns when
     * the value of box-lines is set to multiple.
     */
    @JsOverlay public final CssProps boxLineProgression(String s) {
        boxLineProgression = s;
        return this;
    }

    @JsProperty public String boxLines;
    

    /**
     * Do not use. This property has been replaced by the flex-wrap property.
     * Gets or sets a value that specifies whether child elements wrap onto multiple lines or
     * columns based on the space available in the object.
     */
    @JsOverlay public final CssProps boxLines(String s) {
        boxLines = s;
        return this;
    }

    @JsProperty public String boxOrdinalGroup;
    

    /**
     * Do not use. This property has been replaced by flex-order.
     * Specifies the ordinal group that a child element of the object belongs to. This ordinal
     * value identifies the display order (along the axis defined by the box-orient property)
     * for the group.
     */
    @JsOverlay public final CssProps boxOrdinalGroup(String s) {
        boxOrdinalGroup = s;
        return this;
    }
    @JsProperty public String breakAfter;
    

    /**
     * The CSS break-after property allows you to force a break on multi-column layouts. More
     * specifically, it allows you to force a break after an element. It allows you to determine
     * if a break should occur, and what type of break it should be. The break-after CSS
     * property describes how the page, column or region break behaves after the generated box.
     * If there is no generated box, the property is ignored.
     */
    @JsOverlay public final CssProps breakAfter(String s) {
        breakAfter = s;
        return this;
    }

    @JsProperty public String breakBefore;
    

    /**
     * Control page/column/region breaks that fall above a block of content
     */
    @JsOverlay public final CssProps breakBefore(String s) {
        breakBefore = s;
        return this;
    }

    @JsProperty public String breakInside;
    

    /**
     * Control page/column/region breaks that fall within a block of content
     */
    @JsOverlay public final CssProps breakInside(String s) {
        breakInside = s;
        return this;
    }

    @JsProperty public String clear;
    

    /**
     * The clear CSS property specifies if an element can be positioned next to or must be
     * positioned below the floating elements that precede it in the markup.
     */
    @JsOverlay public final CssProps clear(String s) {
        clear = s;
        return this;
    }

    @JsProperty public String clipRule;
    

    /**
     * Clipping crops an graphic, so that only a portion of the graphic is rendered, or filled.
     * This clip-rule property, when used with the clip-path property, defines which clip rule,
     * or algorithm, to use when filling the different parts of a graphics.
     */
    @JsOverlay public final CssProps clipRule(String s) {
        clipRule = s;
        return this;
    }
    @JsProperty public String color;
    

    /**
     * The color property sets the color of an element's foreground content (usually text),
     * accepting any standard CSS color from keywords and hex values to RGB(a) and HSL(a).
     */
    @JsOverlay public final CssProps color(String s) {
        this.color = s;
        return this;
    }

    @JsProperty public String columnFill;
    

    /**
     * Specifies how to fill columns (balanced or sequential).
     */
    @JsOverlay public final CssProps columnFill(String s) {
        columnFill = s;
        return this;
    }

    @JsProperty public String columnGap;
    

    /**
     * The column-gap property controls the width of the gap between columns in multi-column
     * elements.
     */
    @JsOverlay public final CssProps columnGap(String s) {
        columnGap = s;
        return this;
    }

    @JsProperty public String columnRule;
    

    /**
     * Sets the width, style, and color of the rule between columns.
     */
    @JsOverlay public final CssProps columnRule(String s) {
        columnRule = s;
        return this;
    }
    @JsProperty public String columnRuleColor;
    

    /**
     * Specifies the color of the rule between columns.
     */
    @JsOverlay public final CssProps columnRuleColor(String s) {
        columnRuleColor = s;
        return this;
    }

    @JsProperty public String columnRuleWidth;
    

    /**
     * Specifies the width of the rule between columns.
     */
    @JsOverlay public final CssProps columnRuleWidth(String s) {
        columnRuleWidth = s;
        return this;
    }

    @JsProperty public String columnSpan;
    

    /**
     * The column-span CSS property makes it possible for an element to span across all columns
     * when its value is set to all. An element that spans more than one column is called a
     * spanning element.
     */
    @JsOverlay public final CssProps columnSpan(String s) {
        columnSpan = s;
        return this;
    }

    @JsProperty public String columnWidth;
    

    /**
     * Specifies the width of columns in multi-column elements.
     */
    @JsOverlay public final CssProps columnWidth(String s) {
        columnWidth = s;
        return this;
    }

    @JsProperty public String columns;
    

    /**
     * This property is a shorthand property for setting column-width and/or column-count.
     */
    @JsOverlay public final CssProps columns(String s) {
        columns = s;
        return this;
    }

    @JsProperty public String counterIncrement;
    

    /**
     * The counter-increment property accepts one or more names of counters (identifiers), each
     * one optionally followed by an integer which specifies the value by which the counter
     * should be incremented (e.g. if the value is 2, the counter increases by 2 each time it is
     * invoked).
     */
    @JsOverlay public final CssProps counterIncrement(String s) {
        counterIncrement = s;
        return this;
    }
    @JsProperty public String counterReset;

    /**
     * The counter-reset property contains a list of one or more names of counters, each one
     * optionally followed by an integer (otherwise, the integer defaults to 0.) Each time the
     * given element is invoked, the counters specified by the property are set to the given
     * integer.
     */
    @JsOverlay public final CssProps counterReset(String s) {
        counterReset = s;
        return this;
    }

    @JsProperty public String cue;
    

    /**
     * The cue property specifies sound files (known as an "auditory icon") to be played by
     * speech media agents before and after presenting an element's content; if only one file
     * is specified, it is played both before and after. The volume at which the file(s)
     * should be played, relative to the volume of the main element, may also be specified.
     * The icon files may also be set separately with the cue-before and cue-after properties.
     */
    @JsOverlay public final CssProps cue(String s) {
        cue = s;
        return this;
    }

    @JsProperty public String cueAfter;
    

    /**
     * The cue-after property specifies a sound file (known as an "auditory icon") to be played
     * by speech media agents after presenting an element's content; the volume at which the
     * file should be played may also be specified. The shorthand property cue sets cue sounds
     * for both before and after the element is presented.
     */
    @JsOverlay public final CssProps cueAfter(String s) {
        cueAfter = s;
        return this;
    }

    @JsProperty public String direction;
    

    /**
     * The direction CSS property specifies the text direction/writing direction. The rtl is
     * used for Hebrew or Arabic text, the ltr is for other languages.
     */
    @JsOverlay public final CssProps direction(String s) {
        direction = s;
        return this;
    }

    @JsProperty public String display;
    

    /**
     * This property specifies the type of rendering box used for an element. It is a shorthand
     * property for many other display properties.
     */
    @JsOverlay public final CssProps display(String s) {
        display = s;
        return this;
    }

    @JsProperty public String fill;
    

    /**
     * The "fill" property paints the interior of the given graphical element. The area to be
     * painted consists of any areas inside the outline of the shape. To determine the inside of
     * the shape, all subpaths are considered, and the interior is determined according to the
     * rules associated with the current value of the "fill-rule" property. The zero-width
     * geometric outline of a shape is included in the area to be painted.
     */
    @JsOverlay public final CssProps fill(String s) {
        fill = s;
        return this;
    }

    @JsProperty public String fillRule;
    

    /**
     * The "fill-rule" property indicates the algorithm which is to be used to determine what
     * parts of the canvas are included inside the shape. For a simple, non-intersecting path, it
     * is intuitively clear what region lies "inside"; however, for a more complex path, such as
     * a path that intersects itself or where one subpath encloses another, the interpretation of
     * "inside" is not so obvious.
     * The "fill-rule" property provides two options for how the inside of a shape is determined:
     */
    @JsOverlay public final CssProps fillRule(String s) {
        fillRule = s;
        return this;
    }

    @JsProperty public String filter;
    

    /**
     * Applies various image processing effects. This property is largely unsupported. See
     * Compatibility section for more information.
     */
    @JsOverlay public final CssProps filter(String s) {
        filter = s;
        return this;
    }

    @JsProperty public String flexBasis;
    

    /**
     * The flex-basis CSS property describes the initial main size of the flex item before any free
     * space is distributed according to the flex factors described in the flex property
     * (flex-grow and flex-shrink).
     */
    @JsOverlay public final CssProps flexBasis(String s) {
        flexBasis = s;
        return this;
    }

    @JsProperty public String flexDirection;
    

    /**
     * The flex-direction CSS property describes how flex items are placed in the flex container,
     * by setting the direction of the flex container's main axis.
     */
    @JsOverlay public final CssProps flexDirection(String s) {
        flexDirection = s;
        return this;
    }

    @JsProperty public String flexFlow;
    

    /**
     * The flex-flow CSS property defines the flex container's main and cross axis. It is a
     * shorthand property for the flex-direction and flex-wrap properties.
     */
    @JsOverlay public final CssProps flexFlow(String s) {
        flexFlow = s;
        return this;
    }

    @JsProperty public String flexItemAlign;
    

    /**
     * Do not use. This property has been renamed to align-self
     * Specifies the alignment (perpendicular to the layout axis defined by flex-direction)
     * of child elements of the object.
     */
    @JsOverlay public final CssProps flexItemAlign(String s) {
        flexItemAlign = s;
        return this;
    }

    @JsProperty public String flexOrder;
    

    /**
     * Gets or sets a value that specifies the ordinal group that a flexbox element belongs to.
     * This ordinal value identifies the display order for the group.
     */
    @JsOverlay public final CssProps flexOrder(String s) {
        flexOrder = s;
        return this;
    }

    @JsProperty(name="float") String cssFloat;

    /**
     * Elements which have the style float are floated horizontally. These elements can move as
     * far to the left or right of the containing element. All elements after the floating
     * element will flow around it, but elements before the floating element are not impacted. If
     * several floating elements are placed after each other, they will float next to each other
     * as long as there is room.
     */
    @JsOverlay public final CssProps cssFloat(String s) {
        cssFloat = s;
        return this;
    }

    @JsProperty public String flowFrom;
    

    /**
     * Flows content from a named flow (specified by a corresponding flow-into) through selected
     * elements to form a dynamic chain of layout regions.
     */
    @JsOverlay public final CssProps flowFrom(String s) {
        flowFrom = s;
        return this;
    }

    @JsProperty public String font;
    

    /**
     * The font property is shorthand that allows you to do one of two things: you can either set
     * up six of the most mature font properties in one line, or you can set one of a choice of
     * keywords to adopt a system font setting.
     */
    @JsOverlay public final CssProps font(String s) {
        font = s;
        return this;
    }

    @JsProperty public String fontFamily;
    

    /**
     * The font-family property allows one or more font family names and/or generic family names
     * to be specified for usage on the selected element(s)' text. The browser then goes through
     * the list; for each character in the selection it applies the first font family that has an
     * available glyph for that character.
     */
    @JsOverlay public final CssProps fontFamily(String s) {
        fontFamily = s;
        return this;
    }

    @JsProperty public String fontKerning;
    

    /**
     * The font-kerning property allows contextual adjustment of inter-glyph spacing, i.e. the
     * spaces between the characters in text. This property controls metric kerning
     * - that utilizes adjustment data contained in the font. Optical Kerning is not supported as
     * yet.
     */
    @JsOverlay public final CssProps fontKerning(String s) {
        fontKerning = s;
        return this;
    }

    @JsProperty public String fontSizeAdjust;
    

    /**
     * The font-size-adjust property adjusts the font-size of the fallback fonts defined with
     * font-family, so that the x-height is the same no matter what font is used. This preserves
     * the readability of the text when fallback happens.
     */
    @JsOverlay public final CssProps fontSizeAdjust(String s) {
        fontSizeAdjust = s;
        return this;
    }

    @JsProperty public String fontStretch;
    

    /**
     * Allows you to expand or condense the widths for a normal, condensed, or expanded font face.
     */
    @JsOverlay public final CssProps fontStretch(String s) {
        fontStretch = s;
        return this;
    }

    @JsProperty public String fontStyle;
    

    /**
     * The font-style property allows normal, italic, or oblique faces to be selected. Italic
     * forms are generally cursive in nature while oblique faces are typically sloped versions
     * of the regular face. Oblique faces can be simulated by artificially sloping the glyphs
     * of the regular face.
     */
    @JsOverlay public final CssProps fontStyle(String s) {
        fontStyle = s;
        return this;
    }

    @JsProperty public String fontSynthesis;
    

    /**
     * This value specifies whether the user agent is allowed to synthesize bold or oblique font
     * faces when a font family lacks bold or italic faces.
     */
    @JsOverlay public final CssProps fontSynthesis(String s) {
        fontSynthesis = s;
        return this;
    }

    @JsProperty public String fontVariant;
    

    /**
     * The font-variant property enables you to select the small-caps font within a font family.
     */
    @JsOverlay public final CssProps fontVariant(String s) {
        fontVariant = s;
        return this;
    }

    @JsProperty public String fontVariantAlternates;
    

    /**
     * Fonts can provide alternate glyphs in addition to default glyph for a character. This
     * property provides control over the selection of these alternate glyphs.
     */
    @JsOverlay public final CssProps fontVariantAlternates(String s) {
        fontVariantAlternates = s;
        return this;
    }

    @JsProperty public String gridArea;
    

    /**
     * Lays out one or more grid items bound by 4 grid lines. Shorthand for setting
     * grid-column-start, grid-column-end, grid-row-start, and grid-row-end in a single
     * declaration.
     */
    @JsOverlay public final CssProps gridArea(String s) {
        gridArea = s;
        return this;
    }

    @JsProperty public String gridColumn;
    

    /**
     * Controls a grid item's placement in a grid area, particularly grid position and a grid span.
     * Shorthand for setting grid-column-start and grid-column-end in a single declaration.
     */
    @JsOverlay public final CssProps gridColumn(String s) {
        gridColumn = s;
        return this;
    }

    @JsProperty public String gridColumnEnd;
    

    /**
     * Controls a grid item's placement in a grid area as well as grid position and a grid span.
     * The grid-column-end property (with grid-row-start, grid-row-end, and grid-column-start)
     * determines a grid item's placement by specifying the grid lines of a grid item's grid area.
     */
    @JsOverlay public final CssProps gridColumnEnd(String s) {
        gridColumnEnd = s;
        return this;
    }

    @JsProperty public String gridColumnStart;
    

    /**
     * Determines a grid item's placement by specifying the starting grid lines of a grid item's
     * grid area . A grid item's placement in a grid area consists of a grid position and a grid
     * span. See also ( grid-row-start, grid-row-end, and grid-column-end)
     */
    @JsOverlay public final CssProps gridColumnStart(String s) {
        gridColumnStart = s;
        return this;
    }

    @JsProperty public String gridRow;
    

    /**
     * Gets or sets a value that indicates which row an element within a Grid should appear in.
     * Shorthand for setting grid-row-start and grid-row-end in a single declaration.
     */
    @JsOverlay public final CssProps gridRow(String s) {
        gridRow = s;
        return this;
    }

    @JsProperty public String gridRowEnd;
    

    /**
     * Determines a grid item's placement by specifying the block-end. A grid item's placement in
     * a grid area consists of a grid position and a grid span. The grid-row-end property
     * (with grid-row-start, grid-column-start, and grid-column-end) determines a grid item's
     * placement by specifying the grid lines of a grid item's grid area.
     */
    @JsOverlay public final CssProps gridRowEnd(String s) {
        gridRowEnd = s;
        return this;
    }

    @JsProperty public String gridRowPosition;
    

    /**
     * Specifies a row position based upon an integer location, string value, or desired row size.
     * css/properties/grid-row is used as short-hand for grid-row-position and grid-row-position
     */
    @JsOverlay public final CssProps gridRowPosition(String s) {
        gridRowPosition = s;
        return this;
    }

    @JsProperty public String gridRowSpan;
    

    @JsOverlay public final CssProps gridRowSpan(String s) {
        gridRowSpan = s;
        return this;
    }

    @JsProperty public String gridTemplateAreas;
    

    /**
     * Specifies named grid areas which are not associated with any particular grid item, but can
     * be referenced from the grid-placement properties. The syntax of the grid-template-areas
     * property also provides a visualization of the structure of the grid, making the overall
     * layout of the grid container easier to understand.
     */
    @JsOverlay public final CssProps gridTemplateAreas(String s) {
        gridTemplateAreas = s;
        return this;
    }

    @JsProperty public String gridTemplateColumns;
    

    /**
     * Specifies (with grid-template-rows) the line names and track sizing functions of the grid.
     * Each sizing function can be specified as a length, a percentage of the grid container's
     * size, a measurement of the contents occupying the column or row, or a fraction of the free
     * space in the grid.
     */
    @JsOverlay public final CssProps gridTemplateColumns(String s) {
        gridTemplateColumns = s;
        return this;
    }

    @JsProperty public String gridTemplateRows;
    

    /**
     * Specifies (with grid-template-columns) the line names and track sizing functions of the
     * grid. Each sizing function can be specified as a length, a percentage of the grid
     * container's size, a measurement of the contents occupying the column or row, or a
     * fraction of the free space in the grid.
     */
    @JsOverlay public final CssProps gridTemplateRows(String s) {
        gridTemplateRows = s;
        return this;
    }

    @JsProperty public String height;
    

    /**
     * Sets the height of an element. The content area of the element height does not include
     * the padding, border, and margin of the element.
     */
    @JsOverlay public final CssProps height(String s) {
        height = s;
        return this;
    }

    @JsProperty public String hyphenateLimitChars;
    

    /**
     * Specifies the minimum number of characters in a hyphenated word
     */
    @JsOverlay public final CssProps hyphenateLimitChars(String s) {
        hyphenateLimitChars = s;
        return this;
    }

    @JsProperty public String hyphenateLimitLines;
    

    /**
     * Indicates the maximum number of successive hyphenated lines in an element. The "no-limit"
     * value means that there is no limit.
     */
    @JsOverlay public final CssProps hyphenateLimitLines(String s) {
        hyphenateLimitLines = s;
        return this;
    }

    @JsProperty public String hyphenateLimitZone;
    

    /**
     * Specifies the maximum amount of trailing whitespace (before justification) that may be
     * left in a line before hyphenation is triggered to pull part of a word from the next
     * line back up into the current one.
     */
    @JsOverlay public final CssProps hyphenateLimitZone(String s) {
        hyphenateLimitZone = s;
        return this;
    }

    @JsProperty public String hyphens;
    

    /**
     * Specifies whether or not words in a sentence can be split by the use of a manual or
     * automatic hyphenation mechanism.
     */
    @JsOverlay public final CssProps hyphens(String s) {
        hyphens = s;
        return this;
    }

    @JsProperty public String imeMode;
    

    @JsOverlay public final CssProps imeMode(String s) {
        imeMode = s;
        return this;
    }

    @JsProperty public String layoutGrid;
    

    @JsOverlay public final CssProps layoutGrid(String s) {
        layoutGrid = s;
        return this;
    }

    @JsProperty public String layoutGridChar;
    

    @JsOverlay public final CssProps layoutGridChar(String s) {
        layoutGridChar = s;
        return this;
    }

    @JsProperty public String layoutGridLine;
    

    @JsOverlay public final CssProps layoutGridLine(String s) {
        layoutGridLine = s;
        return this;
    }

    @JsProperty public String layoutGridMode;
    

    @JsOverlay public final CssProps layoutGridMode(String s) {
        layoutGridMode = s;
        return this;
    }

    @JsProperty public String layoutGridType;
    

    @JsOverlay public final CssProps layoutGridType(String s) {
        layoutGridType = s;
        return this;
    }

    @JsProperty public String left;
    

    /**
     * Sets the left edge of an element
     */
    @JsOverlay public final CssProps left(String s) {
        left = s;
        return this;
    }

    @JsProperty public String letterSpacing;
    

    /**
     * The letter-spacing CSS property specifies the spacing behavior between text characters.
     */
    @JsOverlay public final CssProps letterSpacing(String s) {
        letterSpacing = s;
        return this;
    }

    @JsProperty public String listStyle;
    

    /**
     * Shorthand property that sets the list-style-type, list-style-position and list-style-image
     * properties in one declaration.
     */
    @JsOverlay public final CssProps listStyle(String s) {
        listStyle = s;
        return this;
    }

    @JsProperty public String listStyleImage;
    

    /**
     * This property sets the image that will be used as the list item marker. When the image is
     * available, it will replace the marker set with the 'list-style-type' marker. That also
     * means that if the image is not available, it will show the style specified by
     * list-style-property
     */
    @JsOverlay public final CssProps listStyleImage(String s) {
        listStyleImage = s;
        return this;
    }

    @JsProperty public String listStylePosition;
    

    /**
     * Specifies if the list-item markers should appear inside or outside the content flow.
     */
    @JsOverlay public final CssProps listStylePosition(String s) {
        listStylePosition = s;
        return this;
    }

    @JsProperty public String listStyleType;
    

    /**
     * Specifies the type of list-item marker in a list.
     */
    @JsOverlay public final CssProps listStyleType(String s) {
        listStyleType = s;
        return this;
    }

    @JsProperty public String margin;
    

    /**
     * The margin property is shorthand to allow you to set all four margins of an element at once.
     * Its equivalent longhand properties are margin-top, margin-right, margin-bottom and
     * margin-left. Negative values are also allowed.
     */
    @JsOverlay public final CssProps margin(String s) {
        margin = s;
        return this;
    }

    @JsProperty public String marginBottom;
    

    /**
     * margin-bottom sets the bottom margin of an element.
     */
    @JsOverlay public final CssProps marginBottom(String s) {
        marginBottom = s;
        return this;
    }

    @JsProperty public String marginLeft;
    

    /**
     * margin-left sets the left margin of an element.
     */
    @JsOverlay public final CssProps marginLeft(String s) {
        marginLeft = s;
        return this;
    }

    @JsProperty public String marginRight;
    

    /**
     * margin-right sets the right margin of an element.
     */
    @JsOverlay public final CssProps marginRight(String s) {
        marginRight = s;
        return this;
    }

    @JsProperty public String marginTop;
    

    /**
     * margin-top sets the top margin of an element.
     */
    @JsOverlay public final CssProps marginTop(String s) {
        marginTop = s;
        return this;
    }

    @JsProperty public String mask;
    

    /**
     * This property is shorthand for setting mask-image, mask-mode, mask-repeat, mask-position,
     * mask-clip, mask-origin, mask-composite and mask-size. Omitted values are set to their
     * original properties' initial values.
     */
    @JsOverlay public final CssProps mask(String s) {
        mask = s;
        return this;
    }

    @JsProperty public String maskBorder;
    

    /**
     * This property is shorthand for setting mask-border-source, mask-border-slice,
     * mask-border-width, mask-border-outset, and mask-border-repeat. Omitted values are set to
     * their original properties' initial values.
     */
    @JsOverlay public final CssProps maskBorder(String s) {
        maskBorder = s;
        return this;
    }

    @JsProperty public String maskBorderRepeat;
    

    /**
     * This property specifies how the images for the sides and the middle part of the mask image
     * are scaled and tiled. The first keyword applies to the horizontal sides, the second one
     * applies to the vertical ones. If the second keyword is absent, it is assumed to be the
     * same as the first, similar to the CSS border-image-repeat property.
     */
    @JsOverlay public final CssProps maskBorderRepeat(String s) {
        maskBorderRepeat = s;
        return this;
    }

    @JsProperty public String maskBorderSlice;
    

    /**
     * This property specifies inward offsets from the top, right, bottom, and left edges of the
     * mask image, dividing it into nine regions: four corners, four edges, and a middle. The
     * middle image part is discarded and treated as fully transparent black unless the fill
     * keyword is present. The four values set the top, right, bottom and left offsets in that
     * order, similar to the CSS border-image-slice property.
     */
    @JsOverlay public final CssProps maskBorderSlice(String s) {
        maskBorderSlice = s;
        return this;
    }

    @JsProperty public String maskBorderSource;
    

    /**
     * Specifies an image to be used as a mask. An image that is empty, fails to download, is
     * non-existent, or cannot be displayed is ignored and does not mask the element.
     */
    @JsOverlay public final CssProps maskBorderSource(String s) {
        maskBorderSource = s;
        return this;
    }

    @JsProperty public String maskBorderWidth;
    

    /**
     * This property sets the width of the mask box image, similar to the CSS border-image-width
     * property.
     */
    @JsOverlay public final CssProps maskBorderWidth(String s) {
        maskBorderWidth = s;
        return this;
    }

    @JsProperty public String maskClip;
    

    /**
     * Determines the mask painting area, which defines the area that is affected by the mask.
     * The painted content of an element may be restricted to this area.
     */
    @JsOverlay public final CssProps maskClip(String s) {
        maskClip = s;
        return this;
    }

    @JsProperty public String maskOrigin;
    

    /**
     * For elements rendered as a single box, specifies the mask positioning area. For elements
     * rendered as multiple boxes (e.g., inline boxes on several lines, boxes on several pages)
     * specifies which boxes box-decoration-break operates on to determine the mask positioning
     * area(s).
     */
    @JsOverlay public final CssProps maskOrigin(String s) {
        maskOrigin = s;
        return this;
    }

    @JsProperty public String maxFontSize;
    

    /**
     * This property must not be used. It is no longer included in any standard or standard track
     * specification, nor is it implemented in any browser. It is only used when the
     * text-align-last property is set to size. It controls allowed adjustments of font-size to
     * fit line content.
     */
    @JsOverlay public final CssProps maxFontSize(String s) {
        maxFontSize = s;
        return this;
    }

    @JsProperty public String maxHeight;
    

    /**
     * Sets the maximum height for an element. It prevents the height of the element to exceed
     * the specified value. If min-height is specified and is greater than max-height, max-height
     * is overridden.
     */
    @JsOverlay public final CssProps maxHeight(String s) {
        maxHeight = s;
        return this;
    }

    @JsProperty public String maxWidth;
    

    /**
     * Sets the maximum width for an element. It limits the width property to be larger than the
     * value specified in max-width.
     */
    @JsOverlay public final CssProps maxWidth(String s) {
        maxWidth = s;
        return this;
    }

    @JsProperty public String minHeight;
    

    /**
     * Sets the minimum height for an element. It prevents the height of the element to be
     * smaller than the specified value. The value of min-height overrides both max-height and
     * height.
     */
    @JsOverlay public final CssProps minHeight(String s) {
        minHeight = s;
        return this;
    }

    @JsProperty public String minWidth;
    

    /**
     * Sets the minimum width of an element. It limits the width property to be not smaller
     * than the value specified in min-width.
     */
    @JsOverlay public final CssProps minWidth(String s) {
        minWidth = s;
        return this;
    }

    @JsProperty public String outline;
    

    /**
     * The CSS outline property is a shorthand property for setting one or more of the
     * individual outline properties outline-style, outline-width and outline-color in a single
     * rule. In most cases the use of this shortcut is preferable and more convenient.
     * Outlines differ from borders in the following ways:
     *      - Outlines do not take up space, they are drawn above the content.
     *      - Outlines may be non-rectangular. They are rectangular in Gecko/Firefox.
     *              Internet Explorer attempts to place the smallest contiguous outline around
     *              all elements or shapes that are indicated to have an outline. Opera draws a
     *              non-rectangular shape around a construct.
     */
    @JsOverlay public final CssProps outline(String s) {
        outline = s;
        return this;
    }

    @JsProperty public String outlineColor;
    

    /**
     * The outline-color property sets the color of the outline of an element. An outline is a
     * line that is drawn around elements, outside the border edge, to make the element stand out.
     */
    @JsOverlay public final CssProps outlineColor(String s) {
        outlineColor = s;
        return this;
    }
    @JsProperty public String outlineOffset;

    /**
     * The outline-offset property offsets the outline and draw it beyond the border edge.
     */
    @JsOverlay public final CssProps outlineOffset(String s) {
        outlineOffset = s;
        return this;
    }

    @JsProperty public String overflow;
    

    /**
     * The overflow property controls how extra content exceeding the bounding box of an element
     * is rendered. It can be used in conjunction with an element that has a fixed width and
     * height, to eliminate text-induced page distortion.
     */
    @JsOverlay public final CssProps overflow(String s) {
        overflow = s;
        return this;
    }

    @JsProperty public String overflowStyle;
    

    /**
     * Specifies the preferred scrolling methods for elements that overflow.
     */
    @JsOverlay public final CssProps overflowStyle(String s) {
        overflowStyle = s;
        return this;
    }

    @JsProperty public String overflowX;
    

    /**
     * The overflow-x property is a specific case of the generic overflow property. It controls
     * how extra content exceeding the x-axis of the bounding box of an element is rendered.
     */
    @JsOverlay public final CssProps overflowX(String s) {
        overflowX = s;
        return this;
    }

    @JsProperty public String padding;
    

    /**
     * The padding optional CSS property sets the required padding space on one to four sides of
     * an element. The padding area is the space between an element and its border. Negative
     * values are not allowed but decimal values are permitted. The element size is treated as
     * fixed, and the content of the element shifts toward the center as padding is increased.
     * The padding property is a shorthand to avoid setting each side separately (padding-top,
     * padding-right, padding-bottom, padding-left).
     */
    @JsOverlay public final CssProps padding(String s) {
        padding = s;
        return this;
    }

    @JsProperty public String paddingBottom;
    

    /**
     * The padding-bottom CSS property of an element sets the padding space required on the
     * bottom of an element. The padding area is the space between the content of the element and
     * its border. Contrary to margin-bottom values, negative values of padding-bottom are
     * invalid.
     */
    @JsOverlay public final CssProps paddingBottom(String s) {
        paddingBottom = s;
        return this;
    }

    @JsProperty public String paddingLeft;
    

    /**
     * The padding-left CSS property of an element sets the padding space required on the left
     * side of an element. The padding area is the space between the content of the element and
     * its border. Contrary to margin-left values, negative values of padding-left are invalid.
     */
    @JsOverlay public final CssProps paddingLeft(String s) {
        paddingLeft = s;
        return this;
    }

    @JsProperty public String paddingRight;
    

    /**
     * The padding-right CSS property of an element sets the padding space required on the right
     * side of an element. The padding area is the space between the content of the element and
     * its border. Contrary to margin-right values, negative values of padding-right are invalid.
     */
    @JsOverlay public final CssProps paddingRight(String s) {
        paddingRight = s;
        return this;
    }

    @JsProperty public String paddingTop;
    

    /**
     * The padding-top CSS property of an element sets the padding space required on the top of
     * an element. The padding area is the space between the content of the element and its
     * border. Contrary to margin-top values, negative values of padding-top are invalid.
     */
    @JsOverlay public final CssProps paddingTop(String s) {
        paddingTop = s;
        return this;
    }

    @JsProperty public String pageBreakAfter;
    

    /**
     * The page-break-after property is supported in all major browsers. With CSS3, page-break-*
     * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines
     * breaks for all CSS box fragmentation.
     */
    @JsOverlay public final CssProps pageBreakAfter(String s) {
        pageBreakAfter = s;
        return this;
    }

    @JsProperty public String pageBreakBefore;
    

    /**
     * The page-break-after property is supported in all major browsers. With CSS3, page-break-*
     * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines
     * breaks for all CSS box fragmentation.
     */
    @JsOverlay public final CssProps pageBreakBefore(String s) {
        pageBreakBefore = s;
        return this;
    }

    @JsProperty public String pageBreakInside;
    

    /**
     * Sets the page-breaking behavior inside an element. With CSS3, page-break-* properties
     * are only aliases of the break-* properties. The CSS3 Fragmentation spec defines breaks
     * for all CSS box fragmentation.
     */
    @JsOverlay public final CssProps pageBreakInside(String s) {
        pageBreakInside = s;
        return this;
    }

    @JsProperty public String pause;
    

    /**
     * The pause property determines how long a speech media agent should pause before and after
     * presenting an element. It is a shorthand for the pause-before and pause-after properties.
     */
    @JsOverlay public final CssProps pause(String s) {
        pause = s;
        return this;
    }

    @JsProperty public String pauseAfter;
    

    /**
     * The pause-after property determines how long a speech media agent should pause after
     * presenting an element. It may be replaced by the shorthand property pause, which sets
     * pause time before and after.
     */
    @JsOverlay public final CssProps pauseAfter(String s) {
        pauseAfter = s;
        return this;
    }

    @JsProperty public String pauseBefore;
    

    /**
     * The pause-before property determines how long a speech media agent should pause before
     * presenting an element. It may be replaced by the shorthand property pause, which sets
     * pause time before and after.
     */
    @JsOverlay public final CssProps pauseBefore(String s) {
        pauseBefore = s;
        return this;
    }

    @JsProperty public String perspective;
    

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
    @JsOverlay public final CssProps perspective(String s) {
        perspective = s;
        return this;
    }

    @JsProperty public String perspectiveOrigin;
    

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
    @JsOverlay public final CssProps perspectiveOrigin(String s) {
        perspectiveOrigin = s;
        return this;
    }

    @JsProperty public String pointerEvents;
    

    /**
     * The pointer-events property allows you to control whether an element can be the target
     * for the pointing device (e.g, mouse, pen) events.
     */
    @JsOverlay public final CssProps pointerEvents(String s) {
        pointerEvents = s;
        return this;
    }

    @JsProperty public String position;
    

    /**
     * The position property controls the type of positioning used by an element within its
     * parent elements. The effect of the position property depends on a lot of factors, for
     * example the position property of parent elements.
     */
    @JsOverlay public final CssProps position(String s) {
        position = s;
        return this;
    }

    @JsProperty public String quotes;
    

    /**
     * Sets the type of quotation marks for embedded quotations.
     */
    @JsOverlay public final CssProps quotes(String s) {
        quotes = s;
        return this;
    }

    @JsProperty public String regionFragment;
    

    /**
     * Controls whether the last region in a chain displays additional 'overset' content
     * according its default overflow property, or if it displays a fragment of content as
     * if it were flowing into a subsequent region.
     */
    @JsOverlay public final CssProps regionFragment(String s) {
        regionFragment = s;
        return this;
    }

    @JsProperty public String restAfter;
    

    /**
     * The rest-after property determines how long a speech media agent should pause after
     * presenting an element's main content, before presenting that element's exit cue sound.
     * It may be replaced by the shorthand property rest, which sets rest time before and after.
     */
    @JsOverlay public final CssProps restAfter(String s) {
        restAfter = s;
        return this;
    }

    @JsProperty public String restBefore;
    

    /**
     * The rest-before property determines how long a speech media agent should pause after
     * presenting an intro cue sound for an element, before presenting that element's main
     * content. It may be replaced by the shorthand property rest, which sets rest time before
     * and after.
     */
    @JsOverlay public final CssProps restBefore(String s) {
        restBefore = s;
        return this;
    }

    @JsProperty public String right;
    

    /**
     * Specifies the position an element in relation to the right side of the containing element.
     */
    @JsOverlay public final CssProps right(String s) {
        right = s;
        return this;
    }

    @JsProperty public String rubyAlign;
    
    @JsOverlay public final CssProps rubyAlign(String s) {
        rubyAlign = s;
        return this;
    }

    @JsProperty public String rubyPosition;
    
    @JsOverlay public final CssProps rubyPosition(String s) {
        rubyPosition = s;
        return this;
    }

    @JsProperty public String shapeImageThreshold;
    

    /**
     * Defines the alpha channel threshold used to extract a shape from an image. Can be thought
     * of as a "minimum opacity" threshold; that is, a value of 0.5 means that the shape will
     * enclose all the pixels that are more than 50% opaque.
     */
    @JsOverlay public final CssProps shapeImageThreshold(String s) {
        shapeImageThreshold = s;
        return this;
    }

    @JsProperty public String shapeInside;
    

    /**
     * A future level of CSS Shapes will define a shape-inside property, which will define a
     * shape to wrap content within the element. See Editor's Draft
     */
    @JsOverlay public final CssProps shapeInside(String s) {
        shapeInside = s;
        return this;
    }

    @JsProperty public String shapeMargin;
    

    /**
     * Adds a margin to a shape-outside. In effect, defines a new shape that is the smallest
     * contour around all the points that are the shape-margin distance outward perpendicular
     * to each point on the underlying shape. For points where a perpendicular direction is
     * not defined (e.g., a triangle corner), takes all points on a circle centered at the
     * point and with a radius of the shape-margin distance. This property accepts only
     * non-negative values.
     */
    @JsOverlay public final CssProps shapeMargin(String s) {
        shapeMargin = s;
        return this;
    }

    @JsProperty public String shapeOutside;
    

    /**
     * Declares a shape around which text should be wrapped, with possible modifications
     * from the shape-margin property. The shape defined by shape-outside and shape-margin
     * changes the geometry of a float element's float area.
     */
    @JsOverlay public final CssProps shapeOutside(String s) {
        shapeOutside = s;
        return this;
    }

    @JsProperty public String speak;
    

    /**
     * The speak property determines whether or not a speech synthesizer will read aloud
     * the contents of an element.
     */
    @JsOverlay public final CssProps speak(String s) {
        speak = s;
        return this;
    }

    @JsProperty public String speakAs;
    

    /**
     * The speak-as property determines how the speech synthesizer interprets the content:
     * words as whole words or as a sequence of letters, numbers as a numerical value or a
     * sequence of digits, punctuation as pauses in speech or named punctuation characters.
     */
    @JsOverlay public final CssProps speakAs(String s) {
        speakAs = s;
        return this;
    }

    @JsProperty public String tabSize;
    

    /**
     * The tab-size CSS property is used to customise the width of a tab (U+0009) character.
     */
    @JsOverlay public final CssProps tabSize(String s) {
        tabSize = s;
        return this;
    }

    @JsProperty public String tableLayout;
    

    /**
     * The 'table-layout' property controls the algorithm used to lay out the table cells,
     * rows, and columns.
     */
    @JsOverlay public final CssProps tableLayout(String s) {
        tableLayout = s;
        return this;
    }

    @JsProperty public String textAlign;
    

    /**
     * The text-align CSS property describes how inline content like text is aligned in
     * its parent block element. text-align does not control the alignment of block
     * elements itself, only their inline content.
     */
    @JsOverlay public final CssProps textAlign(String s) {
        textAlign = s;
        return this;
    }

    @JsProperty public String textAlignLast;
    

    /**
     * The text-align-last CSS property describes how the last line of a block element or
     * a line before line break is aligned in its parent block element.
     */
    @JsOverlay public final CssProps textAlignLast(String s) {
        textAlignLast = s;
        return this;
    }

    @JsProperty public String textDecoration;
    

    /**
     * The text-decoration CSS property is used to set the text formatting to underline,
     * overline, line-through or blink.
     *
     * underline and overline decorations are positioned under the text, line-through over it.
     */
    @JsOverlay public final CssProps textDecoration(String s) {
        textDecoration = s;
        return this;
    }

    @JsProperty public String textDecorationColor;
    

    /**
     * Sets the color of any text decoration, such as underlines, overlines, and strike throughs.
     */
    @JsOverlay public final CssProps textDecorationColor(String s) {
        textDecorationColor = s;
        return this;
    }

    @JsProperty public String textDecorationLine;
    

    /**
     * Sets what kind of line decorations are added to an element, such as underlines, overlines, etc.
     */
    @JsOverlay public final CssProps textDecorationLine(String s) {
        textDecorationLine = s;
        return this;
    }

    @JsProperty public String textDecorationLineThrough;
    
    @JsOverlay public final CssProps textDecorationLineThrough(String s) {
        textDecorationLineThrough = s;
        return this;
    }

    @JsProperty public String textDecorationNone;
    
    @JsOverlay public final CssProps textDecorationNone(String s) {
        textDecorationNone = s;
        return this;
    }

    @JsProperty public String textDecorationOverline;
    
    @JsOverlay public final CssProps textDecorationOverline(String s) {
        textDecorationOverline = s;
        return this;
    }

    @JsProperty public String textDecorationSkip;
    

    /**
     * Specifies what parts of an element's content are skipped over when applying any text decoration.
     */
    @JsOverlay public final CssProps textDecorationSkip(String s) {
        textDecorationSkip = s;
        return this;
    }

    @JsProperty public String textDecorationStyle;
    

    /**
     * This property specifies the style of the text decoration line drawn on the specified element.
     * The intended meaning for the values are the same as those of the border-style-properties.
     */
    @JsOverlay public final CssProps textDecorationStyle(String s) {
        textDecorationStyle = s;
        return this;
    }

    @JsProperty public String textDecorationUnderline;
    
    @JsOverlay public final CssProps textDecorationUnderline(String s) {
        textDecorationUnderline = s;
        return this;
    }

    @JsProperty public String textEmphasis;
    

    /**
     * The text-emphasis property will apply special emphasis marks to the elements text. Slightly
     * similar to the text-decoration property only that this property can have affect on the
     * line-height. It also is noted that this is shorthand for text-emphasis-style and for
     * text-emphasis-color.
     */
    @JsOverlay public final CssProps textEmphasis(String s) {
        textEmphasis = s;
        return this;
    }

    @JsProperty public String textEmphasisColor;
    

    /**
     * The text-emphasis-color property specifies the foreground color of the emphasis marks.
     */
    @JsOverlay public final CssProps textEmphasisColor(String s) {
        textEmphasisColor = s;
        return this;
    }

    @JsProperty public String textEmphasisStyle;
    

    /**
     * The text-emphasis-style property applies special emphasis marks to an element's text.
     */
    @JsOverlay public final CssProps textEmphasisStyle(String s) {
        textEmphasisStyle = s;
        return this;
    }

    @JsProperty public String textHeight;
    

    /**
     * This property helps determine an inline box's block-progression dimension, derived from
     * the text-height and font-size properties for non-replaced elements, the height or the
     * width for replaced elements, and the stacked block-progression dimension for
     * inline-block elements. The block-progression dimension determines the position of the
     * padding, border and margin for the element.
     */
    @JsOverlay public final CssProps textHeight(String s) {
        textHeight = s;
        return this;
    }

    @JsProperty public String textIndent;
    

    /**
     * Specifies the amount of space horizontally that should be left on the first line of the
     * text of an element. This horizontal spacing is at the beginning of the first line and
     * is in respect to the left edge of the containing block box.
     */
    @JsOverlay public final CssProps textIndent(String s) {
        textIndent = s;
        return this;
    }

    @JsProperty public String textJustifyTrim;
    
    @JsOverlay public final CssProps textJustifyTrim(String s) {
        textJustifyTrim = s;
        return this;
    }

    @JsProperty public String justifyContent;
    
    @JsOverlay public final CssProps justifyContent(String s) {
        justifyContent = s;
        return this;
    }

    @JsProperty public String textKashidaSpace;
    
    @JsOverlay public final CssProps textKashidaSpace(String s) {
        textKashidaSpace = s;
        return this;
    }

    @JsProperty public String textLineThroughWidth;
    

    /**
     * Specifies the line width for the line-through text decoration.
     */
    @JsOverlay public final CssProps textLineThroughWidth(String s) {
        textLineThroughWidth = s;
        return this;
    }

    @JsProperty public String textOverflow;
    

    /**
     * The text-overflow shorthand CSS property determines how overflowed content that is not
     * displayed is signaled to the users. It can be clipped, display an ellipsis (HORIZONTAL ELLIPSIS) 
     * or a Web author-defined string. It covers the two long-hand
     * properties text-overflow-mode and text-overflow-ellipsis
     */
    @JsOverlay public final CssProps textOverflow(String s) {
        textOverflow = s;
        return this;
    }

    @JsProperty public String textOverline;
    

    /**
     * The text-overline property is the shorthand for the text-overline-style,
     * text-overline-width, text-overline-color, and text-overline-mode properties.
     */
    @JsOverlay public final CssProps textOverline(String s) {
        textOverline = s;
        return this;
    }

    @JsProperty public String textOverlineColor;
    

    /**
     * Specifies the line color for the overline text decoration.
     */
    @JsOverlay public final CssProps textOverlineColor(String s) {
        textOverlineColor = s;
        return this;
    }

    @JsProperty public String textOverlineMode;
    

    /**
     * Sets the mode for the overline text decoration, determining whether the text decoration
     * affects the space characters or not.
     */
    @JsOverlay public final CssProps textOverlineMode(String s) {
        textOverlineMode = s;
        return this;
    }

    @JsProperty public String textOverlineStyle;
    

    /**
     * Specifies the line style for overline text decoration.
     */
    @JsOverlay public final CssProps textOverlineStyle(String s) {
        textOverlineStyle = s;
        return this;
    }

    @JsProperty public String textOverlineWidth;
    

    /**
     * Specifies the line width for the overline text decoration.
     */
    @JsOverlay public final CssProps textOverlineWidth(String s) {
        textOverlineWidth = s;
        return this;
    }

    @JsProperty public String textRendering;
    

    /**
     * The text-rendering CSS property provides information to the browser about how to optimize
     * when rendering text. Options are: legibility, speed or geometric precision.
     */
    @JsOverlay public final CssProps textRendering(String s) {
        textRendering = s;
        return this;
    }

    @JsProperty public String textShadow;
    

    /**
     * The CSS text-shadow property applies one or more drop shadows to the text and
     * text-decorations of an element. Each shadow is specified as an offset from the text,
     * along with optional color and blur radius values.
     */
    @JsOverlay public final CssProps textShadow(String s) {
        textShadow = s;
        return this;
    }

    @JsProperty public String textTransform;
    

    /**
     * This property transforms text for styling purposes. (It has no effect on the underlying
     * content.)
     */
    @JsOverlay public final CssProps textTransform(String s) {
        textTransform = s;
        return this;
    }

    @JsProperty public String top;
    

    /**
     * This property specifies how far an absolutely positioned box's top margin edge is offset
     * below the top edge of the box's containing block. For relatively positioned boxes, the
     * offset is with respect to the top edges of the box itself (i.e., the box is given a
     * position in the normal flow, then offset from that position according to these properties).
     */
    @JsOverlay public final CssProps top(String s) {
        top = s;
        return this;
    }

    @JsProperty public String touchAction;
    

    /**
     * Determines whether touch input may trigger default behavior supplied by the user agent,
     * such as panning or zooming.
     */
    @JsOverlay public final CssProps touchAction(String s) {
        touchAction = s;
        return this;
    }

    @JsProperty public String transform;
    

    /**
     * CSS transforms allow elements styled with CSS to be transformed in two-dimensional or
     * three-dimensional space. Using this property, elements can be translated, rotated, scaled,
     * and skewed. The value list may consist of 2D and/or 3D transform values.
     */
    @JsOverlay public final CssProps transform(String s) {
        transform = s;
        return this;
    }

    @JsProperty public String transformOrigin;
    

    /**
     * This property defines the origin of the transformation axes relative to the element to
     * which the transformation is applied.
     */
    @JsOverlay public final CssProps transformOrigin(String s) {
        transformOrigin = s;
        return this;
    }

    @JsProperty public String transformOriginZ;
    

    /**
     * This property allows you to define the relative position of the origin of the transformation
     * grid along the z-axis.
     */
    @JsOverlay public final CssProps transformOriginZ(String s) {
        transformOriginZ = s;
        return this;
    }

    @JsProperty public String transformStyle;
    

    /**
     * This property specifies how nested elements are rendered in 3D space relative to their parent.
     */
    @JsOverlay public final CssProps transformStyle(String s) {
        transformStyle = s;
        return this;
    }

    @JsProperty public String transition;
    

    /**
     * The transition CSS property is a shorthand property for transition-property,
     * transition-duration, transition-timing-function, and transition-delay. It allows to define
     * the transition between two states of an element.
     */
    @JsOverlay public final CssProps transition(String s) {
        transition = s;
        return this;
    }

    @JsProperty public String transitionDelay;
    

    /**
     * Defines when the transition will start. A value of "0s" means the transition will execute
     * as soon as the property is changed. Otherwise, the value specifies an offset from the
     * moment the property is changed, and the transition will delay execution by that offset.
     */
    @JsOverlay public final CssProps transitionDelay(String s) {
        transitionDelay = s;
        return this;
    }

    @JsProperty public String transitionDuration;
    

    /**
     * The 'transition-duration' property specifies the length of time a transition animation
     * takes to complete.
     */
    @JsOverlay public final CssProps transitionDuration(String s) {
        transitionDuration = s;
        return this;
    }

    @JsProperty public String transitionProperty;
    

    /**
     * The 'transition-property' property specifies the name of the CSS property to which the
     * transition is applied.
     */
    @JsOverlay public final CssProps transitionProperty(String s) {
        transitionProperty = s;
        return this;
    }

    @JsProperty public String transitionTimingFunction;
    

    /**
     * Sets the pace of action within a transition
     */
    @JsOverlay public final CssProps transitionTimingFunction(String s) {
        transitionTimingFunction = s;
        return this;
    }

    /**
     * The unicode-bidi CSS property specifies the level of embedding with respect to the
     * bidirectional algorithm.
     */
    @JsProperty public String unicodeBidi;
    
    @JsOverlay public final CssProps unicodeBidi(String s) {
        unicodeBidi = s;
        return this;
    }

    @JsProperty public String unicodeRange;
    

    /**
     * unicode-range allows you to set a specific range of characters to be downloaded from a
     * font (embedded using @font-face) and made available for use on the current page.
     */
    @JsOverlay public final CssProps unicodeRange(String s) {
        unicodeRange = s;
        return this;
    }

    @JsProperty public String userFocus;
    

    /**
     * This is for all the high level UX stuff.
     */
    @JsOverlay public final CssProps userFocus(String s) {
        userFocus = s;
        return this;
    }

    @JsProperty public String userInput;
    

    /**
     * For inputing user content
     */
    @JsOverlay public final CssProps userInput(String s) {
        userInput = s;
        return this;
    }

    @JsProperty public String verticalAlign;
    

    /**
     * The vertical-align property controls how inline elements or text are vertically aligned
     * compared to the baseline. If this property is used on table-cells it controls the vertical
     * alignment of content of the table cell.
     */
    @JsOverlay public final CssProps verticalAlign(String s) {
        verticalAlign = s;
        return this;
    }

    @JsProperty public String visibility;
    

    /**
     * The visibility property specifies whether the boxes generated by an element are rendered.
     */
    @JsOverlay public final CssProps visibility(Visibility v) {
        visibility = v.name();
        return this;
    }

    @JsProperty public String voiceBalance;
    

    /**
     * The voice-balance property sets the apparent position (in stereo sound) of the synthesized
     * voice for spoken media.
     */
    @JsOverlay public final CssProps voiceBalance(String s) {
        voiceBalance = s;
        return this;
    }

    @JsProperty public String voiceDuration;
    

    /**
     * The voice-duration property allows the author to explicitly set the amount of time it should
     * take a speech synthesizer to read an element's content, for example to allow the speech to
     * be synchronized with other media. With a value of auto (the default) the length of time it
     * takes to read the content is determined by the content itself and the voice-rate property.
     */
    @JsOverlay public final CssProps voiceDuration(String s) {
        voiceDuration = s;
        return this;
    }

    @JsProperty public String voiceFamily;
    

    /**
     * The voice-family property sets the speaker's voice used by a speech media agent to read an
     * element. The speaker may be specified as a named character (to match a voice option in the
     * speech reading software) or as a generic description of the age and gender of the voice.
     * Similar to the font-family property for visual media, a comma-separated list of fallback
     * options may be given in case the speech reader does not recognize the character name or
     * cannot synthesize the requested combination of generic properties.
     */
    @JsOverlay public final CssProps voiceFamily(String s) {
        voiceFamily = s;
        return this;
    }

    @JsProperty public String voicePitch;
    

    /**
     * The voice-pitch property sets pitch or tone (high or low) for the synthesized speech when
     * reading an element; the pitch may be specified absolutely or relative to the normal pitch
     * for the voice-family used to read the text.
     */
    @JsOverlay public final CssProps voicePitch(String s) {
        voicePitch = s;
        return this;
    }

    @JsProperty public String voiceRange;
    

    /**
     * The voice-range property determines how much variation in pitch or tone will be created by
     * the speech synthesize when reading an element. Emphasized text, grammatical structures and
     * punctuation may all be rendered as changes in pitch, this property determines how strong
     * or obvious those changes are; large ranges are associated with enthusiastic or emotional
     * speech, while small ranges are associated with flat or mechanical speech.
     */
    @JsOverlay public final CssProps voiceRange(String s) {
        voiceRange = s;
        return this;
    }

    @JsProperty public String voiceRate;
    

    /**
     * The voice-rate property sets the speed at which the voice synthesized by a speech media
     * agent will read content.
     */
    @JsOverlay public final CssProps voiceRate(String s) {
        voiceRate = s;
        return this;
    }

    @JsProperty public String voiceStress;
    

    /**
     * The voice-stress property sets the level of vocal emphasis to be used for synthesized
     * speech reading the element.
     */
    @JsOverlay public final CssProps voiceStress(String s) {
        voiceStress = s;
        return this;
    }

    @JsProperty public String voiceVolume;
    

    /**
     * The voice-volume property sets the volume for spoken content in speech media. It replaces
     * the deprecated volume property.
     */
    @JsOverlay public final CssProps voiceVolume(String s) {
        voiceVolume = s;
        return this;
    }

    @JsProperty public String whiteSpace;
    

    /**
     * The white-space property controls whether and how white space inside the element is
     * collapsed, and whether lines may wrap at unforced "soft wrap" opportunities.
     */
    @JsOverlay public final CssProps whiteSpace(String s) {
        whiteSpace = s;
        return this;
    }

    @JsProperty public String width;
    

    /**
     * Specifies the width of the content area of an element. The content area of the element
     * width does not include the padding, border, and margin of the element.
     */
    @JsOverlay public final CssProps width(String s) {
        width = s;
        return this;
    }

    @JsProperty public String wordBreak;
    

    /**
     * The word-break property is often used when there is long generated content that is
     * strung together without and spaces or hyphens to beak apart. A common case of this is when
     * there is a long URL that does not have any hyphens. This case could potentially cause the
     * breaking of the layout as it could extend past the parent element.
     */
    @JsOverlay public final CssProps wordBreak(String s) {
        wordBreak = s;
        return this;
    }

    @JsProperty public String wordSpacing;
    

    /**
     * The word-spacing CSS property specifies the spacing behavior between "words".
     */
    @JsOverlay public final CssProps wordSpacing(String s) {
        wordSpacing = s;
        return this;
    }

    @JsProperty public String wordWrap;
    

    /**
     * An alias of css/properties/overflow-wrap, word-wrap defines whether to break words when
     * the content exceeds the boundaries of its container.
     */
    @JsOverlay public final CssProps wordWrap(String s) {
        wordWrap = s;
        return this;
    }

    @JsProperty public String wrapFlow;
    

    /**
     * Specifies how exclusions affect inline content within block-level elements. Elements lay
     * out their inline content in their content area but wrap around exclusion areas.
     */
    @JsOverlay public final CssProps wrapFlow(String s) {
        wrapFlow = s;
        return this;
    }

    @JsProperty public String wrapMargin;
    

    /**
     * Set the value that is used to offset the inner wrap shape from other shapes. Inline
     * content that intersects a shape with this property will be pushed by this shape's margin.
     */
    @JsOverlay public final CssProps wrapMargin(String s) {
        wrapMargin = s;
        return this;
    }

    @JsProperty public String writingMode;
    

    /**
     * writing-mode specifies if lines of text are laid out horizontally or vertically, and the
     * direction which lines of text and blocks progress.
     */
    @JsOverlay public final CssProps writingMode(String s) {
        writingMode = s;
        return this;
    }

    // WebKit specific styles

    @JsProperty(name="WebkitMask") public String webKitMask;

    @JsOverlay
    public final CssProps webkitMask(String s) {
        webKitMask = s;
        return this;
    }

    @JsProperty(name="WebkitMaskSize") public String webKitMaskSize;

    @JsOverlay
    public final CssProps webkitMaskSize(String s) {
        webKitMaskSize = s;
        return this;
    }

    @JsProperty public String cursor;
    
    @JsOverlay public final CssProps cursor(String s) {
        cursor = s;
        return this;
    }
}
