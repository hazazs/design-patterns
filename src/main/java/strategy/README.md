# STRATEGY PATTERN

1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an interface, not an implementation.
3. Favor composition over inheritance.

There is an abstract class (*Duck*), from which the subclasses inherit
- non-abstract method (*swim()*) → all of them need it in its original form
- abstract method (*display()*) → all of them need it in a different way, so they override it in their own classes
- instance variables as interfaces (*FlyBehavior/QuackBehavior*) → all of them need it in a different way, but there can be shared implementations, so re-usability is a must

With the strategy pattern each subclass HAS-A FlyBehavior and QuackBehavior instead of implementing them (IS-A)
(3). In this way the implementation (which can vary) is separated from the subclasses (1), which can be maintained
independently, and also can be easily changed in runtime (2) with setter methods.