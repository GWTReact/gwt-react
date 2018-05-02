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
 * Implement this interface when using {@link Component} or {@link PureComponent} to receive the {@link #getSnapshotBeforeUpdate(P,S)} lifecycle event.
 */
@JsType
public interface GetSnapshotBeforeUpdate<P extends BaseProps, S extends JsPlainObj> {
	/**
	 * The new getSnapshotBeforeUpdate lifecycle is called right before mutations are made (e.g. before the DOM is updated).
	 * The return value for this lifecycle will be passed as the third parameter to componentDidUpdate.
	 * (This lifecycle isn't often needed, but can be useful in cases like manually preserving scroll position during rerenders.)
     *
	 * Together with componentDidUpdate, this new lifecycle should cover all use cases for the legacy componentWillUpdate.
	 * 
	 * @param prevProps
	 * @param prevState
	 * @return The new snapshot value or null
	 */
	@JsMethod
	Object getSnapshotBeforeUpdate(P prevProps, S prevState);
}
