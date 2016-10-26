package gwt.react.client.events;

import com.google.gwt.uibinder.client.UiField;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface UIEventHandler {
    void onUIEvent(UiField event);
}
