# STRATEGY PATTERN

1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an interface, not an implementation.
3. Favor composition over inheritance.

There is an abstract class (```Duck```), from which the subclasses inherit
- non-abstract method (```swim()```) → all of them use it in its original form
- abstract method (```display()```) → all of them use it in a different way, so they override it in their own classes
- interfaces as instance variables (```FlyBehavior/QuackBehavior```) → all of them use it with a different implementation, which can be shared among the subclasses

---
With the Strategy pattern each subclass HAS-A FlyBehavior and QuackBehavior (they are usually ```@FunctionalInterface```s
with an abstract void method) instead of implementing them (IS-A) (*3*). In this way the implementation (which can vary) is
separated from the subclasses (*1*), which can be maintained independently, and also can be easily changed in runtime (*2*)
with setter methods.