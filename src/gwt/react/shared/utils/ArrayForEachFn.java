package gwt.react.shared.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ArrayForEachFn<T extends Object> {
    void exec(T currentValue, int index, Array<T> theArray);
}
