# DECORATOR PATTERN

1. Classes should be open for extension, but closed for modification

There is an abstract ```Beverage``` class, which will act as the component. And there are some decorators, with which the
functionality of the components can be extended. These decorators also extend the ```Beverage``` class through another intermediate
abstract class (```CondimentDecorator```).

## The Component

All the concrete components must implement the following method from ```Beverage```:
- cost()

## The Decorators

Instead of creating a new subclass for all the component-decorator(s) variations (for example ```HouseBlendSoy```, ```DarkRoastWhip```
or ```DecafMilkMochaMocha``` (with double mocha)), all the decorators are organized under ```CondimentDecorator``` separately.
In this way if we want to decorate a component with a decorator, then we can wrap it with the decorator by setting the base,
or the already (no matter how many times) decorated component as its ```Beverage``` instance variable (during the instantiation).
In the inherited ```cost()``` method of the decorators we can simply delegate the call to the wrapped beverage for example
by returning ```beverage.cost()``` + the additional cost of the respective decorator. And the wrapped beverage will also delegate
the call further, until the last (innermost) beverage is reached.

---
With the Decorator pattern we can extend the functionality of the components with any number of decorators in runtime, while
all the components themselves will remain unmodified *1*.