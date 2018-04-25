package gwt.react.client.components.lifecycle;
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

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.components.Component;
import gwt.react.client.components.PureComponent;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Implement this interface when using {@link Component} or {@link PureComponent} to receive the {@link #componentDidUpdate(BaseProps, JsPlainObj)} lifecycle event.
 */
@JsType
public interface ComponentDidUpdate<P extends BaseProps, S extends JsPlainObj> {
	/**
	 * {@link #componentDidUpdate(P, S)} is invoked immediately after updating occurs. This method is not called for the initial render.
	 * 
	 * Use this as an opportunity to operate on the DOM when the component has been updated. This is also a good place to do network requests as long as 
	 * you compare the current props to previous props (e.g. a network request may not be necessary if the props have not changed).
	 * 
	 * Note: {@link #componentDidUpdate(P, S)} will not be invoked if {@link ShouldComponentUpdate#shouldComponentUpdate(BaseProps, JsPlainObj)} returns false.
	 * 
	 * @param nextProps
	 * @param nextState
	 * @param snapshotValue
	 */
	@JsMethod
	void componentDidUpdate(P nextProps, S nextState, Object snapshotValue);
}
