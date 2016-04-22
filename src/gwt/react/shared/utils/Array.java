package gwt.react.shared.utils;
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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

/**
 * An interface to a JS like array. The implementation may be different on the client
 * and server
 *
 * @author pstockley
 *
 * TODO Add all the ES5 compatible methods
 *
 * @param <T>
 */
@JsType
public interface Array<T extends Object> {
    /**
     * Returns if an array is not emppty or null
     *
     * @param a the array
     * @return <code>true</code> if not empty
     */
    @JsOverlay
    static boolean isNotEmpty(Array a){

        return !isEmpty(a);
    }

    /**
     * Returns if an array is empty or null
     *
     * @param a the array
     * @return <code>true</code> if empty or null
     */
    @JsOverlay
    static boolean isEmpty(Array a){

        return null==a || a.length()==0;
    }

    /**
     * Return an array that is the concatenation of this array + the supplied array
     *
     * See <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/concat">concat spec</a>
     *
     * @param a the array to concatenate
     * @return the new array
     */
    Array<T> concat(Array<T> a);

    /**
     * Return an array that is the concatenation of this array + the supplied value
     *
     * @param a The value to concatenate
     * @return the new array
     */
    Array<T> concatValue(T a);

    /**
     * Gets the object at a given index.
     *
     * @param index the index to be retrieved
     * @return the object at the given index, or <code>null</code> if none exists
     */
    T get(int index);

    /**
     * Convert each element of the array to a String and join them with a comma
     * separator. The value returned from this method may vary between browsers
     * based on how JavaScript values are converted into strings.
     */
    String join(String separator);

    /**
     * Gets the length of the array.
     *
     * @return the array length
     */
    int length();

    /**
     * Reset the length of the array.
     *
     * @param newLength the new length of the array
     */
    void setLength(int newLength);

    /**
     * Pushes the given value onto the end of the array.
     */
    void push(T value);

    /**
     * Sets the object value at a given index.
     *
     * If the index is out of bounds, the value will still be set. The array's
     * length will be updated to encompass the bounds implied by the added object.
     *
     * @param index the index to be set
     * @param value the object to be stored
     */
    void set(int index, T value);

    /**
     * Shifts the first value off the array.
     *
     * @return the shifted value
     */
    T shift() ;

    /**
     * Shifts a value onto the beginning of the array.
     *
     * @param value the value to the stored
     */
    void unshift(T value);

    /**
     * Return the reversed contents of the array
     *
     * @return
     */
    Array<T> reverse();

    /**
     * Return a slice of this array
     *
     * @param startIndx
     * @param endIndx
     * @return
     */
    Array<T> slice(int startIndx, int endIndx);

    /**
     * Return an array with the specified elements removed
     *
     * @param startIndx     The index to start removing items from
     * @param numElements   The number of items to remove
     * @return  A new array containing the items that have been removed
     */
    Array<T> remove(int startIndx, int numElements);

    /**
     *
     * @param callback
     */
    void forEach(ArrayForEachFn<T> callback) ;

    /**
     *
     * @param callback
     * @return
     */
    Array<T> filter(ArrayFilterFn<T> callback);

    /**
     *
     * @param callback
     * @return
     */
    <T2 extends Object> Array<T2> map(ArrayMapFn<T, T2> callback);

    /**
     *
     * @param callback
     * @param initialValue
     * @return
     */
    <A extends Object> A reduce(ArrayReduceFn<A, T> callback, A initialValue);

    /**
     *
     * @param callback
     * @param initialValue
     * @return
     */
    <A extends Object> A reduceRight(ArrayReduceFn<A, T> callback, A initialValue);
}
