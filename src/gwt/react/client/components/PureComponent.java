package gwt.react.client.components;
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
import gwt.interop.utils.shared.collections.StringMap;
import gwt.interop.utils.shared.functional.JsProcedure;
import gwt.react.client.api.React;
import gwt.react.client.components.lifecycle.ComponentDidMount;
import gwt.react.client.components.lifecycle.ComponentDidUpdate;
import gwt.react.client.components.lifecycle.ComponentWillMount;
import gwt.react.client.components.lifecycle.ComponentWillReceiveProps;
import gwt.react.client.components.lifecycle.ComponentWillUnmount;
import gwt.react.client.components.lifecycle.ComponentWillUpdate;
import gwt.react.client.components.lifecycle.ShouldComponentUpdate;
import gwt.react.client.elements.ReactElement;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>You can subclass {@link PureComponent} to define a stateful, but pure ES6-style React component</p>
 *
 * <p>{@link PureComponent} is exactly like {@link Component} but acts as if {@link ShouldComponentUpdate#shouldComponentUpdate(BaseProps, JsPlainObj)} 
 * was automatically implemented for you, with a shallow prop and state comparison.
 *
 * If your React component's {@link Component#render()} function renders the same result given the same props and state, you can use {@link PureComponent}
 * for a performance boost in some cases.
 *
 * <p>To create a {@link ReactElement} based on this component, call {@link React#createElement(Class, BaseProps, ReactElement...)}.
 * In case you need to have the component exported in JavaScript under a name which does not match its Java name, you have to </p>
 *
 * <p>To create {@link ReactElement} based on this component, call {@link React#createElement(Class, BaseProps, ReactElement...)}</p>
 *
 * <p>In addition to the methods defined in this class, you can also define the following lifecyle
 * methods as needed:</p>
 *
 * <p>void componentWillMount()</p>
 * <p>void componentDidMount()</p>
 * <p>void componentWillReceiveProps(P nextProps)</p>
 * <p>void componentWillUpdate(P nextProps, S nextState)</p>
 * <p>void componentDidUpdate(P prevProps, S prevState)</p>
 * <p>void componentWillUnmount()</p>
 *
 * <p>To have extra type safety when defining some of the above methods, you can implement one or more of the following interfaces:</p>
 * <p>{@link ComponentWillMount}</p>
 * <p>{@link ComponentDidMount}</p>
 * <p>{@link ComponentWillReceiveProps}</p>
 * <p>{@link ComponentWillUpdate}</p>
 * <p>{@link ComponentDidUpdate}</p>
 * <p>{@link ComponentWillUnmount}</p>
 *
 * @param <P> the type of props this component expects
 * @param <S> the type of state this component maintains
 */
@JsType(isNative = true, namespace = "React", name = "PureComponent")
public abstract class PureComponent<P extends BaseProps, S extends JsPlainObj> extends Component<P,S>{

    public PureComponent(P props) {
        super(props);
    }
}
