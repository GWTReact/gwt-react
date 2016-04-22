package gwt.react.client.events;

import com.google.gwt.uibinder.client.UiField;
import jsinterop.annotations.JsFunction;

/**
 * Created by paul on 2016-03-15.
 */
@JsFunction
public interface UIEventHandler {
    void onUIEvent(UiField event);
}
