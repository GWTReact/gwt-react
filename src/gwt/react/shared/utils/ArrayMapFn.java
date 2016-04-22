package gwt.react.shared.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ArrayMapFn<T extends Object, T2 extends Object> {
    T2 doMap(T currentValue, int index, Array<T> theArray);
}
