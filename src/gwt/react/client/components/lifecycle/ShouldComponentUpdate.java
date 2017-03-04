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
 * Implement this interface when using {@link Component} or {@link PureComponent} to receive the {@link #shouldComponentUpdate(BaseProps, JsPlainObj)} lifecycle event.
 */
@JsType
public interface ShouldComponentUpdate<P extends BaseProps, S extends JsPlainObj> {
	/**
	 * Use {@link #shouldComponentUpdate(BaseProps, JsPlainObj)} to let React know if a component's output is not affected 
	 * by the current change in state or props. The default behavior is to re-render on every state change, and in the vast 
	 * majority of cases you should rely on the default behavior.
	 * 
	 * {@link #shouldComponentUpdate(BaseProps, JsPlainObj)} is invoked before rendering when new props or state are being received. 
	 * Defaults to true. This method is not called for the initial render or when forceUpdate() is used.
	 *
	 * Returning false does not prevent child components from re-rendering when their state changes.
	 * 
	 * Currently, if {@link ShouldComponentUpdate#shouldComponentUpdate(P, S)} returns false, then {@link ComponentWillUpdate#componentWillUpdate},
	 * {@link Component#render()}, and {@link ComponentDidUpdate#componentDidUpdate} will not be invoked. Note that in the future React may treat
	 * {@link #shouldComponentUpdate(P, S)} as a hint rather than a strict directive, and returning false may still
	 * result in a re-rendering of the component.
	 * 
	 * If you determine a specific component is slow after profiling, you may change it to inherit from React.PureComponent which implements 
	 * {@link #shouldComponentUpdate(P, S)} with a shallow prop and state comparison. If you are confident you want to write
	 * it by hand, you may compare this.props with nextProps and this.state with nextState and return false to tell React the update can be skipped.
	 * 
	 * @param nextProps
	 * @param nextState
	 * @return true in case the component should be updated
	 */
	@JsMethod
	boolean shouldComponentUpdate(P nextProps, S nextState);
}
