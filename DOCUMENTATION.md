##Contents

1. Object Literals
2.  gwt-react object literal support
    * 2.1 Typeless literals
    * 2.2 Inline initialization
    * 2.3 Merging objects
    * 2.4 Removing props from objects
3. Working with React props
4. Defining React components
5. Rendering React components
   * 5.1 Java type limitations
6. Java 8 lambda quirks
7. Working around usages of function binding in javascript
8. Creating a javascript bundle of 3rd party components


##1. Object literals

React makes extensive use of object literals <code>{}</code>. For example, you will see objects defined in calls such as

```javascript
   this.setState({editText: event.target.value});

   React.createElement('a', {href: 'mailto:someone@somecompany.com'}, 'someone@somecompany.com')
```

In GWT, the closest we can get to this is defining a JsType annotated class as follows

```java
   @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
   static class TodoListState {
       String editingId;
       String newTodo;
   };

   TodoListState state = new TodoListState();
   state.editingId = 1;
   state.newTodo = "A new todo";
```

The important point to realize with these literal classes is that when you call new on them, the fields are NOT defined on
the object until you actually assign a value to them. So in the above example, after the call to new, state actually
points to a javascript object that looks like <code>{}</code>. After the two assignments, state will look like
<code>{editingId: 1, newTodo: "A new todo"}</code>.

Native JsType classes have a few limitations. Firstly, you cannot define a constructor with any arguments.
To get around this, you can define a static factory method as follows:

```java
   @JsOverlay
   public static TodoListState makeState(int editingId, String newTodo) {
      TodoListState o = new TodoListState();
      o.editingId = editingId;
      o.newTodo = newTodo;
      return o;
   }
```
Secondly, if you subclass one of these types you need to make sure you include the
<code>@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")</code> annotation on
the subclass.

##2. gwt-react object literal support

gwt-react introduces the <code>ObjLiteral</code> class to make life easier to work with object literals. This provides
the following capabilities

####2.1 Typeless literals

You can define an arbritary literal without defining an explicit class. This is useful for quickly converting JS code
before you introduce types e.g.

```java
   ObjLiteral state = new ObjLiteral();
   state.set("editingId", 1);
   state.set("newTodo", "A new todo")
```

####2.2 Inline initialization

Another capability that is very useful is inline initialization e.g.

```java
   import static gwt.react.client.utils.ObjLiteral.$;

   ObjLiteral state = $(new ObjLiteral(), "editingId", 1, newTodo", "A new todo");
```

This will also work for typed literals that subclass <code>ObjLiteral</code>.

####2.3 Merging objects

One common pattern you will see in React code is to take a set of props and merge in additional props.
Typically for ES5 code they will use the <code>Object.assign</code> method and for ES2017 code they will use the object
spread operator <code>...</code> e.g.

```javascript
   //ES5
   var props = {a : 1, b : 1};
   var mergedProps = Object.assign({}, props , {b : 2, c : 3});

   // mergedProps will now be {a : 1, b : 2, c : 3}

   //ES2016 equivalent using the spread operator
   var mergedProps =  { ...props, b : 2, c : 3 };
```

Using ObjLiteral, you can achieve the same as follows:

```java
   ObjLiteral props = $(new ObjLiteral(), "a", 1, "b", 1);
   ObjLiteral mergedProps = props.merge($(new ObjLiteral(), "b", 2, "c", 3));
```

This will also work for typed literals that subclass <code>ObjLiteral</code>.

####2.4 Removing props from objects

Another object operation you will see is where code consumes certain props and then passes the
remaining props onto a child component. <code>ObjLiteral</code> provides the except method to support this:

```java
   ObjLiteral props = $(new ObjLiteral(), "a", 1, "b", 2, "c", 3, "d", 4);
   int a = props.getInt("a");
   int b = props.getInt("b");
   ObjLiteral remainingProps = props.except("a","b");

   // remainingProps will now be {c : 3, d : 4}
```

You can combine merge and except into a pipeline of operations by chaining them together;

##3. Working with React props

React props in gwt-react are defined by the <code>BaseProps</code> class that itself extends <code>ObjLiteral</code>.
Typically you will want to create a subclass that defines the properties for your component.
This will give your the advantage of strong typing e.g.

```java
    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    static class TodoItemProps extends BaseProps {
        TodoModel.Todo todo;
        boolean isEditing;
        JSFunc2Args<TodoModel.Todo, String> doSave;
        JSFunc2Args<TodoList.Action, TodoModel.Todo> doAction;
    }
```

There will however be some situations where you cannot always use strong typing. For example,
some components will push additional props down to their children. In this case, you will probably
want to use the typeless access capabilities provided by <code>ObjLiteral</code> to access these properties.

##4. Defining React components

gwt-react currently supports two methods for defining React components, <code>React.createClass</code> and Stateless
component functions. ES6 style components are NOT currently supported due to limitations in the JsInterop
capabilities. Hopefully, these will be supported in the future. However, you should ideally try and make as
many of your components stateless functions as possible.

##5. Rendering React components

The majority of javascript React code you will see uses something called JSX. This is just a preprocessor that allows you
to write React component hierarchies in HTML style e.g.

```javascript
var rootElement =
    (<div>
        <h1>Contacts</h1>
        <ul>
            <li>
                <h2>James Nelson</h2>
                <a href="mailto:someone@somecompany.com">someone@somecompany.com</a>
            </li>
        </ul>
    </div>);
```

This preprocessor compiles down to a bunch of <code>React.createElement</code> calls.

```javascript
    var rootElement =
        React.createElement('div', {},
            React.createElement('h1', {}, "Contacts"),
            React.createElement('ul', {},
                React.createElement('li', {},
                    React.createElement('h2', {}, "Some One"),
                    React.createElement('a', {href: 'mailto:someone@somecompany.com'}, 'someone@somecompany.com')
                )
            )
        )

    ReactDOM.render(rootElement, document.getElementById('react-app'))
```

A good introduction to this more traditional approach can be found here:
[Learn Raw React — no JSX, no Flux, no ES6, no Webpack…](http://jamesknelson.com/learn-raw-react-no-jsx-flux-es6-webpack/).
Also check out the [official React documentation](https://facebook.github.io/react/docs/displaying-data.html).

gwt-react uses this more traditional <code>React.createElement</code>
approach. The above example would be written in Java as follows:

```java
    DOMElement<HtmlProps> rootElement =
        React.createElement("div", null,
            React.createElement("h1", null, "Contacts"),
            React.createElement("ul", null,
                React.createElement("li", null,
                    React.createElement("h2", null, "Some One"),
                    React.createElement("a", new AnchorProps().href("mailto:someone@somecompany.com"), "someone@somecompany.com")
                )
            )
        );
```

Alternatively, you can use the shorthand <code>React.DOM.xxx</code> methods for the common HTML elements e.g.

```java
    import static gwt.react.client.api.React.DOM.*;

    DOMElement<HtmlProps> rootElement =
        div(null,
            h1(null, "Contacts"),
            ul(null,
                li(null,
                    h2(null, "Some One),
                    a(new AnchorProps().href("mailto:someone@somecompany.com"), "someone@somecompany.com")
                )
            )
        );
```

####5.1 Java type limitations

There were a few situations where all the possible combinations of parameters to create elements
couldn't be represented in Java. The first example is passing child props. In this case, you have to
bypass the type system by using the <code>GwtReact.castAsReactElement</code> method e.g.

```java
    div(null,
        div(null, "There are " + countChildren + " child components"),
        castAsReactElement(props.children),
        br(null)
    );
```

The second situation is where you want to pass an array of elements e.g.

```java
    JSLikeArray<ReactElement> newChildren = React.Children.map(<some function>)

    div(null,
        castAsReactElement(newChildren)
    );
```


The final situation is passing string literals instead of elements. In this case you
can use the <code>GwtReact.stringLiteral</code> method e.g.

```java
    p(null,
        stringLiteral("Clicked: " + getProps().getInt("value") + " times "),
        button(new BtnProps().onClick(getOnIncrementFnProp()), "+"),
        stringLiteral(" "),
        button(new BtnProps().onClick(getOnDecrementFnProp()), "-"),
        stringLiteral(" "),
        button(new BtnProps().onClick(this::incrementIfOdd), "Increment if odd"),
        stringLiteral(" "),
        button(new BtnProps().onClick(this::incrementAsync), "Increment async")
    );
```

##6. Java 8 Lambda quirks

There are a few quirks with using Java 8 lambdas. For example, you cannot assign a lambda directly
to a variable or parameter of type Object because the compiler cannot infer the type of Functional
Interface. This has implications when using typeless properties e.g.

```java
    // The following won't compile
    ObjLiteral someProps = $(new ObjLiteral(), "someCallback", () -> {<some code>));

    //Instead you will have to create a temporary variable
    JSFunc someCallback = () -> { < some code> };
    ObjLiteral someProps = $(new ObjLiteral(), "someCallback", someCallback);
```

Todo list others.


##7. Working around usages of function binding in javascript

In javascript, the concept of what <code>this</code> actually refers to is very nebulous and in may cases can be modified. In addition,
you can dynamically create a function by taking an existing function and adding arguments. Both these cases are typically achieved
by using the [bind method](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_objects/Function/bind). Java
doesn't have the same concepts, so when translating some examples you have to work around the limitation. For example, the todomvc
example passed a set of functions down to each todoitem that had the todo model element bound as an extra argument e.g.

```javascript
    handleSave: function (todoToSave, text) {
       .
    }

    var todoItems = shownTodos.map(function (todo) {
        return (
            <TodoItem
                key={todo.id}
                todo={todo}
                onSave={this.handleSave.bind(this, todo)}
            />
        );
    }, this);

    //In the TodoItem component the code just called the props.onSave and the todo item was
    //automatically added as an extra argument

    handleSubmit: function (event) {
        this.props.onSave(val);
    }
```

Converting this to Java, we have to pass the todo from the other direction

```javascript
    private void handleSave(TodoModel.Todo todoToSave, String text) {
        ..
    }

    JSArray<ReactElement> todoItems = shownTodos.map((todo, index, theArray) -> {
        TodoItem.TodoItemProps todoProps = new TodoItem.TodoItemProps();

        todoProps.key = todo.id;
        todoProps.todo = todo;
        todoProps.doSave = this::handleSave;

        return React.createElement(TodoItem.component, todoProps);
    });

    //In the TodoItem.component we call the props.doSave function and pass the todo from its props

    private void submitTodo(FocusEvent event) {
        .
        getProps().doSave.call(getProps().todo, val);
        .
        .
    }
```

##8. Creating a javascript bundle of 3rd party components

Most React related libraries and components are published on [npm](https://www.npmjs.com/).
Some of the projects will provide a UMD build that exposes their API on the global window object. However, many
don't. The gwt-react project provides an example of how you can use the node package manager and webpack to build a
single bundle of Javascript you can use with gwt-react and its related projects.

1. First install node 4.4.x from [nodejs.org](https://nodejs.org/en/).

2. Edit _gwt-react/dist/src/index.js_ Comment out any of the imports/window assignments for any of the libaries you don't
 need. Add any additional libaries your application will be using.

3. If you are adding additional libraries, edit _gwt-react/dist/package.json_ and add the dependencies to the dependencies section.

4. Open a command line and cd to _gwt-react/dist_. Then type <code>npm install</code> This will download all the required packages.

5. Type <code>npm run build</code> to produce a development bundle. The Javascript you need to include in your
 application will be output to _gwt-react/dist/lib/gwt-react-bundle.js_

6. Type <code>npm run build:min</code> to produce a production minified bundle. The Javascript you need to include in your
   application will be output to _gwt-react/dist/lib/gwt-react-bundle.min.js_
