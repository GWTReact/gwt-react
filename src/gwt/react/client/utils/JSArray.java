package gwt.react.client.utils;
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

import gwt.react.shared.utils.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


/**
 * A Factory to create native JavaScript arrays
 *
 * @author pstockley
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="GWTReact")
public class JSArray {

    @JsMethod(name = "ca")
    public static native <T extends Object> Array<T> create();

    @JsOverlay
    public static <T extends Object> Array<T> create(T ...values) {
        Array<T> a = create();

        for(T v : values) {
            a.push(v);
        }
        return a;
    }

    @JsOverlay
    public static <T extends Object> Array<T> create(Iterable<T> srcCollection) {
        Array<T> a = create();

        for(T v : srcCollection) {
            a.push(v);
        }
        return a;
    }
}

