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
 * Implement this interface when using {@link Component} or {@link PureComponent} to receive the {@link #componentWillUpdate(P,S)} lifecycle event.
 */
@Deprecated
@JsType
public interface ComponentWillUpdate<P extends BaseProps, S extends JsPlainObj> {
	/**
	 * {@link #componentWillUpdate(BaseProps, JsPlainObj)} is invoked immediately before rendering when new props or state are being received. 
	 * Use this as an opportunity to perform preparation before an update occurs. This method is not called for the initial render.
	 * 
	 * Note that you cannot call {@link Component#setState(S)} here. If you need to update state in response to a prop change,
	 * use {@link ComponentWillReceiveProps#componentWillReceiveProps(BaseProps)} instead.
	 * 
	 * Note: {@link #componentWillUpdate(BaseProps, JsPlainObj)} will not be invoked if {@link ShouldComponentUpdate#shouldComponentUpdate(BaseProps, JsPlainObj)} returns false.
	 * 
	 * @param nextProps
	 * @param nextState
	 */
	@JsMethod
	void componentWillUpdate(P nextProps, S nextState);
}
