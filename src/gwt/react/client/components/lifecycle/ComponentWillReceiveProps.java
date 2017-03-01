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
 * Implement this interface when using {@link Component} or {@link PureComponent} to receive the {@link #componentWillReceiveProps(BaseProps)} lifecycle event.
 */
@JsType
public interface ComponentWillReceiveProps<P extends BaseProps> {
	/**
	 * {@link #componentWillReceiveProps(BaseProps)} is invoked before a mounted component receives new props. 
	 * If you need to update the state in response to prop changes (for example, to reset it), you may compare 
	 * this.props and nextProps and perform state transitions using {@link #setState(JsPlainObj)} in this method.
	 * Note that React may call this method even if the props have not changed, so make sure to compare the current 
	 * and next values if you only want to handle changes. This may occur when the parent component causes your component to re-render.
	 * React doesn't call {@link #componentWillReceiveProps(BaseProps)} with initial props during mounting. It only calls this method 
	 * if some of component's props may update. Calling {@link #setState(JsPlainObj)} generally doesn't trigger 
	 * {@link #componentWillReceiveProps(BaseProps)}
	 * 
	 * @param nextProps
	 */
	@JsMethod
	void componentWillReceiveProps(P nextProps);
}
