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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This class represents a Javascript Object literal e.g. var a = {}.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public class ObjLiteral {

    /**
     * Initialize an object literal with the specified property values. For example,
     * $(new ObjLiteral(), "a",1, "b","somevalue) is eqivalent to the following javascript
     * object literal { a: 1, b: "somevalue" }
     */
    @JsOverlay
    public static <O> O $(O literal, Object ...fieldValues) {
        String fieldName = null;

        for(Object f : fieldValues) {
            if (fieldName == null)
                fieldName = (String)f;
            else {
                if (f instanceof String)
                    JSHelper.setObjectProperty(literal, fieldName, f);
                else if (f instanceof Integer)
                    JSHelper.setObjectProperty(literal, fieldName, ((Integer) f).intValue());
                else if (f instanceof Double)
                    JSHelper.setObjectProperty(literal, fieldName, ((Double) f).doubleValue());
                else if (f instanceof Boolean)
                    JSHelper.setObjectProperty(literal, fieldName, ((Boolean) f).booleanValue());
                else if (f instanceof Byte)
                    JSHelper.setObjectProperty(literal, fieldName, ((Byte) f).intValue());
                if (f instanceof Byte)
                    JSHelper.setObjectProperty(literal, fieldName, ((Short) f).intValue());
                else
                    JSHelper.setObjectProperty(literal, fieldName, f);

                fieldName = null;
            }
        }

        return literal;
    }

    /**
     * Return an int parameter from an object literal. NOTE this is method is NOT type safe. If if you access
     * a property that isn't an int you will get an undefined result. Also if you access a property
     * that does not exist you will get an undefined error
     *
     * @param prop  The property to access
     * @return      The integer property value
     */
    @JsOverlay
    final public int getInt(String prop) {
        return JSHelper.getObjectIntProperty(this, prop);
    }

    /**
     * Return an double parameter from an object literal. NOTE this is method is NOT type safe. If you access
     * a property that isn't a double you will get an undefined result. Also if you access a property
     * that does not exist you will get an undefined error
     *
     * @param prop  The property to access
     * @return      The double property value
     */
    @JsOverlay
    final public double getDbl(String prop) {
        return JSHelper.getObjectDblProperty(this, prop);
    }

    /**
     * Return an boolean parameter from an object literal. NOTE this is method is NOT type safe. If you access
     * a property that isn't a boolean you will get an undefined result. Also if you access a property
     * that does not exist you will get an undefined error
     *
     * @param prop  The property to access
     * @return      The boolean property value
     */
    @JsOverlay
    final public boolean getBool(String prop) {
        return JSHelper.getObjectBoolProperty(this, prop);
    }

    /**
     * Return an String parameter from an object literal. NOTE this is method is NOT type safe. If you access
     * a property that isn't an String you will get an undefined result. Also if you access a property
     * that does not exist you will get an undefined error
     *
     * @param prop  The property to access
     * @return      The String property value
     */
    @JsOverlay
    final public String getStr(String prop) {
        return JSHelper.getObjectStrProperty(this, prop);
    }

    /**
     * Return an Object parameter from an object literal. NOTE this is method is NOT type safe. If
     * you access a property that isn't an Object you will get an undefined result. Also if you
     * access a property that does not exist you will get an undefined error
     *
     * @param prop  The property to access
     * @param <O>   The Object property value
     * @return      The Object property value
     */
    @JsOverlay
    final public <O> O getObj(String prop) {
        return JSHelper.getObjectObjProperty(this, prop);
    }

    /**
     * Set the specified property on this object literal. The property will be added if it doesn't
     * currently exist
     *
     * @param prop  The property to set
     * @param v     The value to set the property to
     */
    @JsOverlay
    final public void set(String prop, int v) {
        JSHelper.setObjectProperty(this, prop, v);
    }

    /**
     * Set the specified property on this object literal. The property will be added if it doesn't
     * currently exist
     *
     * @param prop  The property to set
     * @param v     The value to set the property to
     */
    @JsOverlay
    final public void set(String prop, double v) {
        JSHelper.setObjectProperty(this, prop, v);
    }

    /**
     * Set the specified property on this object literal. The property will be added if it doesn't
     * currently exist
     *
     * @param prop  The property to set
     * @param v     The value to set the property to
     */
    @JsOverlay
    final public void set(String prop, boolean v) {
        JSHelper.setObjectProperty(this, prop, v);
    }

    /**
     * Set the specified property on this object literal. The property will be added if it doesn't
     * currently exist
     *
     * @param prop  The property to set
     * @param v     The value to set the property to
     */
    @JsOverlay
    final public void set(String prop, String v) {
        JSHelper.setObjectProperty(this, prop, v);
    }

    /**
     * Set the specified property on this object literal. The property will be added if it doesn't
     * currently exist
     *
     * @param prop  The property to set
     * @param v     The value to set the property to
     */
    @JsOverlay
    final public <O> void set(String prop, O v) {
        JSHelper.setObjectProperty(this, prop, v);
    }

    @JsOverlay
    final public String toString() {
        return JSHelper.toJSON(this);
    }

    /**
     * Return a new object literal that is the result of merging this object literal with the supplied literal.
     * If the same property is defined in toMerge as this it's value will be applied to the result
     * literal e.g {a:1, b:1}.merge({b:2, c:3} would result in {a:1, b:2, c:3}
     *
     * @param toMerge The object to merge
     * @return        The merged literal
     */
    @JsOverlay
    final public <R extends ObjLiteral, O extends ObjLiteral> R merge(O toMerge) {
        return JSHelper.merge(this, toMerge);
    }

    /**
     * Return a new object literal that contains all the properties of this literal except the ones defined
     * in the exclude list e.g {a:1, b:2, c:3}.exclude("a","c") would result in {b:2}
     *
     * @param exclude The properties to exclude
     * @return        The new literal
     */
    @JsOverlay
    final public <R extends ObjLiteral, O extends ObjLiteral> R except(String ...exclude) {
        return JSHelper.except(this, exclude);
    }
}
