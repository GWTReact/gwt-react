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

import gwt.react.client.elements.ReactElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class ReactDOMServer {
    /**
     * This is a static class.
     */
	private ReactDOMServer() {
	}
	
    /**
     * <p>Render a ReactElement to its initial HTML. This should only be used on the server. React
     * will return an HTML string. You can use this method to generate HTML on the server and send
     * the markup down on the initial request for faster page loads and to allow search engines to
     * crawl your pages for SEO purposes.</p>
     *
     * <p>If you call ReactDOM.render() on a node that already has this server-rendered markup,
     * React will preserve it and only attach event handlers, allowing you to have a very
     * performant first-load experience.</p>
     *
     * @param element the element to render
     * @return the HTML markup
     */
    public static native String renderToString(ReactElement element);

    /**
     * <p>Similar to renderToString, except this doesn't create extra DOM attributes such as
     * data-react-id, that React uses internally. This is useful if you want to use React as
     * a simple static page generator, as stripping away the extra attributes can save lots
     * of bytes.</p>
     *
     * @param element the element to render
     * @return the HTML markup
     */
    public static native String renderToStaticMarkup(ReactElement element);
}
