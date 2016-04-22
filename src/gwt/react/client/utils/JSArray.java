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
import gwt.react.shared.utils.*;

/**
 * A Wrapper around a native JavaScript array
 *
 * @author pstockley
 *
 * TODO Add all the ES5 compatible methods
 *
 * @param <T>
 */
public class JSArray<T extends Object> extends JavaScriptObject implements Array<T> {

    protected JSArray() {}

    /**
     * Return an array that is the concatenation of this array + the supplied array
     *
     * See <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/concat">concat spec</a>
     *
     * @param a the array to concatenate
     * @return the new array
     */
    @Override
    public final native Array<T> concat(Array<T> a) /*-{
        return this.concat(a);
    }-*/;

    /**
     * Return an array that is the concatenation of this array + the supplied value
     *
     * @param a The value to concatenate
     * @return the new array
     */
    @Override
    public final native Array<T> concatValue(T a) /*-{
        return this.concat([a]);
    }-*/;


    /**
     * Gets the object at a given index.
     *
     * @param index the index to be retrieved
     * @return the object at the given index, or <code>null</code> if none exists
     */
    @Override
    public final native T get(int index) /*-{
        return this[index];
    }-*/;

    /**
     * Convert each element of the array to a String and join them with a comma
     * separator. The value returned from this method may vary between browsers
     * based on how JavaScript values are converted into strings.
     */
    @Override
    public final native String join(String separator) /*-{
        return this.join(separator);
    }-*/;

    /**
     * Gets the length of the array.
     *
     * @return the array length
     */
    @Override
    public final native int length() /*-{
        return this.length;
    }-*/;

    /**
     * Reset the length of the array.
     *
     * @param newLength the new length of the array
     */
    @Override
    public final native void setLength(int newLength) /*-{
        this.length = newLength;
    }-*/;

    /**
     * Pushes the given value onto the end of the array.
     */
    @Override
    public final native void push(T value) /*-{
        this[this.length] = value;
    }-*/;

    /**
     * Sets the object value at a given index.
     *
     * If the index is out of bounds, the value will still be set. The array's
     * length will be updated to encompass the bounds implied by the added object.
     *
     * @param index the index to be set
     * @param value the object to be stored
     */
    @Override
    public final native void set(int index, T value) /*-{
        this[index] = value;
    }-*/;

    /**
     * Shifts the first value off the array.
     *
     * @return the shifted value
     */
    @Override
    public final native T shift() /*-{
        return this.shift();
    }-*/;

    /**
     * Shifts a value onto the beginning of the array.
     *
     * @param value the value to the stored
     */
    @Override
    public final native void unshift(T value) /*-{
        this.unshift(value);
    }-*/;

    /**
     * Return the reversed contents of the array
     *
     * @return
     */
    @Override
    public final native JSArray<T> reverse() /*-{
        return this.reverse();
    }-*/;

    /**
     * Return a slice of this array
     *
     * @param startIndx
     * @param endIndx
     * @return
     */
    @Override
    public final native JSArray<T> slice(int startIndx, int endIndx) /*-{
        return this.slice(startIndx, endIndx);
    }-*/;

    /**
     * Return an array with the specified elements removed
     *
     * @param startIndx     The index to start removing items from
     * @param numElements   The number of items to remove
     * @return  A new array containing the items that have been removed
     */
    @Override
    public final native JSArray<T> remove(int startIndx, int numElements) /*-{
        return this.splice(startIndx, numElements);
    }-*/;

    /**
     *
     * @param callback
     */
    @Override
    public final native void forEach(ArrayForEachFn<T> callback) /*-{
        this.forEach(callback);
    }-*/;

    /**
     *
     * @param callback
     * @return
     */
    @Override
    public final native JSArray<T> filter(ArrayFilterFn<T> callback) /*-{
        return this.filter(callback);
    }-*/;

    /**
     *
     * @param callback
     * @param <T2>
     * @return
     */
    @Override
    public final native <T2 extends Object> JSArray<T2> map(ArrayMapFn<T, T2> callback) /*-{
        return this.map(callback);
    }-*/;

    /**
     *
     * @param callback
     * @param initialValue
     * @param <A>
     * @return
     */
    @Override
    public final native <A extends Object> A reduce(ArrayReduceFn<A, T> callback, A initialValue) /*-{
        return this.reduce(callback, initialValue);
    }-*/;

    /**
     *
     * @param callback
     * @param initialValue
     * @param <A>
     * @return
     */
    @Override
    public final native <A extends Object> A reduceRight(ArrayReduceFn<A, T> callback, A initialValue) /*-{
        return this.reduceRight(callback, initialValue);
    }-*/;

    /**
     *
     * @param <T>
     * @return
     */
    public static native <T extends Object> JSArray<T> createJsArray() /*-{
        return [];
    }-*/;
}

