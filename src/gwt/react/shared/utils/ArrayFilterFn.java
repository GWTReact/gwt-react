package gwt.react.shared.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ArrayFilterFn<T extends Object> {
    boolean filter(T currentValue, int index, Array<T> theArray);
}
