package gwt.react.shared.utils;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ArrayReduceFn<A extends Object, T extends Object> {
    A doReduce(A PreviousAccumulator, T currentValue, int index, Array<T> theArray);
}
