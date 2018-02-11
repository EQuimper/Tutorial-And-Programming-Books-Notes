# Functions

### Small

The first rule of functions is that they should be small. The second rule of functions is that they should be smaller than that.

### Block and Indenting

This implies that the blocks withing `if` statements, `else` or `while` should be one line long. That line should probably be a function call.

### Do One Thing

Functions should do one thing. They should do it well. They should do it only. We can describe the function with a TO paragraph.

A way to find is that function do more then one thing, it's if you can extract another function from it with a name that is not merely a restatement of its implementation.

### One Level of Abstraction per Function

### Reading Code from Top to Bottom

We want to read code like a top-down narrative

### Factory

From [Wikipedia](https://en.wikipedia.org/wiki/Abstract_factory_pattern)

A factory is the location of a concrete class in the code at which objects are constructed. The intent in employing the pattern is to **insulate the creation of objects from their usage and to create families of related objects without having to depend on their concrete classes**. This allows for new derived types to be introduced with no change to the code that uses the base class.

### Abstract factory pattern

The abstract factory pattern provides a way to **encapsulate a group of individual factories that have a common theme without specifying their concrete classes**. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client doesn't know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.

Use of this pattern makes it possible to interchange concrete implementations without changing the code that uses them

This Resolve 3 main problems

- How can an application be independent of how its objects are created?
- How can a class be independent of how the objects it requires are created?
- How can families of related or dependent objects be created?

### Use descriptive Names

Don't be afraid to make name long. A long desciptive name is better than a short enigmatic one.

### Function Arguments

Not more than 3 arguments. Only if this is justifiable. Cause at 3 arguments, you need to make sure to follow the order, understand how you can skip etc. So if more than 3 -> go with an object argument.