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

import com.google.gwt.core.client.JavaScriptObject;
import gwt.react.shared.utils.StringMap;

/**
 * A simple javascript based map that maps a string key to an object of type T
 *
 * @author pstockley
 *
 * @param <T> The type of map entry
 */
public class JSStringMap<T> extends JavaScriptObject implements StringMap<T> {

    protected JSStringMap() {
    }

    @Override
    public final native T get(String key) /*-{
        return this[key] || null;
    }-*/;

    @Override
    public final native void put(String key, T value) /*-{
        this[key] = value;
    }-*/;

    @Override
    public final native void remove(String key) /*-{
        delete this[key];
    }-*/;

    @Override
    public final native boolean hasKey(String key) /*-{
        return this[key] !== undefined;
    }-*/;

    @Override
    public final native JSArray<String> keys() /*-{
        var o = [];

        for (var prop in this) {
            if (this.hasOwnProperty(prop))
                o.push(prop);
        }

        return o;
    }-*/;

    @Override
    public final native JSArray<T> values() /*-{
        var o = [];
        for (var prop in this) {
            if (this.hasOwnProperty(prop)) {
                o.push(this[prop]);
            }
        }
        return o;
    }-*/;

    public static native <O> JSStringMap<O> createMap() /*-{
        return {};
    }-*/;

}