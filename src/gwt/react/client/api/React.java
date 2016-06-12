package gwt.react.client.api;
/* The MIT License (MIT)

Copyright (c) 2016 GWT React

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE. */

import gwt.interop.utils.shared.collections.Array;
import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.components.*;
import gwt.react.client.elements.DOMElement;
import gwt.react.client.elements.ReactElement;
import gwt.react.client.elements.ReactElementChildren;
import gwt.react.client.proptypes.*;
import gwt.react.client.proptypes.html.*;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

import static gwt.react.client.api.GwtReact.makeSpec;

@SuppressWarnings("unused")
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class React {

    /**
     * Create a component class, given a specification. A component implements a render method which returns
     * one single child. That child may have an arbitrarily deep child structure.
     *
     * @param component A class derived from {@link ReactClassSpec} to create the class from
     * @param <P>       The type of Props the component accepts
     * @return          A component class that can be passed to {@link React#createElement} or
     *                  {@link React#createFactory}
     */
    @JsOverlay
    public static <P extends BaseProps, S extends JsPlainObj> ReactClass<P> createClass(ReactClassSpec<P,S> component) {
        return _createClass(makeSpec(component));
    }

    @JsMethod(name="createClass")
    private static native <P extends BaseProps> ReactClass<P> _createClass(InternalClassSpec spec);

    /**
     * <p>Create and return a new ReactElement of the given type.
     *
     * @param type  a HTML tag name (eg. 'div', 'span', etc)
     * @param props the props to pass to the element
     * @return  a {@link DOMElement}
     */
    public static native <P extends HtmlProps> DOMElement<P> createElement(String type, P props);
    public static native <P extends HtmlProps> DOMElement<P> createElement(String type, P props, String value);
    public static native <P extends HtmlProps> DOMElement<P> createElement(String type, P props, ReactElement ...child);

    /**
     * Create and return a new ReactElement of the given type.
     *
     * @param type a ReactClass (created via React.createClass).
     * @param props
     * @return a {@link ReactElement}
     */
    public static native <P extends BaseProps> ReactElement<P, ReactClass<P>> createElement(ReactClass<P> type, P props);
    public static native <P extends BaseProps> ReactElement<P, ReactClass<P>> createElement(ReactClass<P> type, P props, ReactElement ...child);

    //Create Stateless Components

    public static native <P extends BaseProps> ReactElement<P, String> createElement(StatelessComponent type, P props);
    public static native <P extends BaseProps> ReactElement<P, String> createElement(StatelessComponent type, P props, String value);
    public static native <P extends BaseProps> ReactElement<P, String> createElement(StatelessComponent type, P props, ReactElement ...child);

    //Create ES6 Components (NOT SUPPORTED CURRENTLY)

    /**
     * Return a function that produces ReactElements of a given type. Like React.createElement,
     * the type argument can be either an html tag name string (eg. 'div', 'span', etc), or a
     * ReactClass.
     *
     * @param componentClass The class of the compoment to create the factory for
     * @return
     */
    public static native <P extends BaseProps> ElementFactory<P> createFactory(ReactClass<P> componentClass);

    /**
     * <p>Clone and return a new ReactElement using element as the starting point. The resulting
     * element will have the original element's props with the new props merged in shallowly.
     * New children will replace existing children. Unlike React.addons.cloneWithProps, key and
     * ref from the original element will be preserved. There is no special behavior for merging
     * any props (unlike cloneWithProps). See the v0.13 RC2 blog post for additional details.</p>
     *
     * @param element the element to clone
     * @param props the props to merge
     * @return the cloned element
     */
    public static native <P extends BaseProps> ReactElement cloneElement(ReactElement element, P props);

    public static native boolean isValidElement(Object object);

    /**
     * React.DOM provides convenience wrappers around React.createElement for DOM components.
     * For example React.DOM.div(null, 'Hello World!')
     */
    @JsType(isNative = true)
    public static class DOM {
        public static native DOMElement<HtmlProps> a(AnchorProps props, String value);
        public static native DOMElement<HtmlProps> a(AnchorProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> article(HtmlProps props, ReactElement ...child);
        public static native DOMElement<HtmlProps> audio(AudioProps props, ReactElement ...child);

        public static native DOMElement<BtnProps> br(HtmlProps props);

        public static native DOMElement<BtnProps> button(BtnProps props);
        public static native DOMElement<BtnProps> button(BtnProps props, String value);

        public static native DOMElement<BtnProps> canvas(HtmlProps props);

        public static native DOMElement<HtmlProps> caption(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> caption(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> col(ColProps props, ReactElement ...child);
        public static native DOMElement<HtmlProps> colgroup(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> div(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> div(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> footer(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> form(FormProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> header(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> h1(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> h2(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> h3(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> h4(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> h5(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> h6(HtmlProps props, String value);

        public static native DOMElement<HtmlProps> iframe(IFrameProps props);

        public static native DOMElement<HtmlProps> img(ImgProps props);

        public static native DOMElement<HtmlProps> input(InputProps props);

        public static native DOMElement<HtmlProps> label(LabelProps props, String value);

        public static native DOMElement<HtmlProps> li(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> li(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> ol(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> option(OptionProps props, String value);
        public static native DOMElement<HtmlProps> optgroup(OptGroupProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> p(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> p(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> span(HtmlProps props, String value);
        public static native DOMElement<HtmlProps> span(HtmlProps props, ReactElement child1);
        public static native DOMElement<HtmlProps> span(HtmlProps props, ReactElement child1, String value);

        public static native DOMElement<HtmlProps> select(SelectProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> section(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> strong(HtmlProps props, String value);

        public static native DOMElement<HtmlProps> source(SourceProps props);

        public static native DOMElement<HtmlProps> table(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> td(TdProps props, String value);
        public static native DOMElement<HtmlProps> td(TdProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> th(ThProps props, String value);
        public static native DOMElement<HtmlProps> th(ThProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> tr(HtmlProps props, ReactElement ...child);

        public static native DOMElement<HtmlProps> ul(HtmlProps props, ReactElement ...child);
    }

    /**
     * React.Children provides utilities for dealing with the this.props.children opaque data
     * structure.
     */
    @JsType(isNative = true)
    public static class Children {

        /**
         * Invoke fn on every immediate child contained within children. If children is a nested
         * object or array it will be traversed: fn will never be passed the container objects.
         * If children is null returns null rather than an array.
         *
         * @param children  The opaque children structure to iterate over
         * @param Fn The function to execute
         * @return
         */
        public final static native Array<ReactElement> map(ReactElementChildren children, ChildrenMapFn Fn); // Object thisArg);

        /**
         * Like React.Children.map() but does not return an array.
         *
         * @param children The opaque children structure to iterate over
         * @param fn The function to execute
         */
        public final static native void forEach(ReactElementChildren children, ChildrenForEachFn fn); // [, object thisArg]);

        /**
         * Return the total number of components in children, equal to the number of times that a
         * callback passed to map or forEach would be invoked.
         *
         * @param children The opaque children structure to count
         * @return the number of child components
         */
        public final static native int count(ReactElementChildren children);

        /**
         * Return the only child in children. Throws otherwise.
         *
         * @param children The opaque children structure to access
         * @return the first and only child. Throws an exception if more than one exis
         */
        public final static native ReactElement only(ReactElementChildren children);

        /**
         * Return the children opaque data structure as a flat array with keys assigned to
         * each child. Useful if you want to manipulate collections of children in your render
         * methods, especially if you want to reorder or slice this.props.children before passing
         * it down.
         *
         * @param children The opaque children structure to iterate over
         * @return a {@link Array} of {@link ReactElement}
         */
        public final static native Array<ReactElement> toArray(ReactElementChildren children);
    }

    @JsType(isNative = true, name="Component")
    public static class Component {
    }
}
