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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An interface for a simple javascript based map that maps a string key to an object
 * of type T. The actual implementation could be different on the client and server
 *
 * @author pstockley
 *
 * @param <T> The type of map entry
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public interface StringMap<T> {

    /**
     * Return the value with the supplied string key
     *
     * @param key The key
     * @return The value or null if no value is defined for that supplied key
     */
    @JsOverlay default T get(String key) {
        return JSHelper.getObjectObjProperty(this, key);
    }

    /**
     * Set the value for the supplied key
     *
     * @param key The key.
     * @param value The value to set
     */
    @JsOverlay default void put(String key, T value) {
        JSHelper.setObjectProperty(this, key, value);
    }

    /**
     * Remove the value with the supplied key
     *
     * @param key The key of the value to remove
     */
    @JsOverlay default void remove(String key) {
        JSHelper.removeProperty(this, key);
    }

    /**
     * Returns is the supplied key is set in the map
     *
     * @param key The key to test
     * @return <code>true</code> if the key is set
     */
    @JsOverlay default boolean hasKey(String key) {
        return JSHelper.hasProperty(this, key);
    }

    /**
     * Returns the keys defined in the map
     *
     * @return
     */
    @JsOverlay default Array<String> keys() {
        return JSHelper.objectProperties(this);
    }

    /**
     * Returns the values defined in the map
     *
     * @return
     */
    @JsOverlay default Array<T> values() {
        return JSHelper.objectValues(this);
    }
}
