# FACTORY PATTERN

1. Depend upon abstractions. Do not depend upon concrete classes.

There are two main types of the Factory pattern.

## Factory Method

There is an abstract class (```PizzaStore```), from which the subclasses inherit
- abstract factory method (```Pizza createPizza(String)```), in which they provide their implementation, to decide which subclass of the abstract product (```Pizza```) they instantiate
- non-abstract method (```Pizza orderPizza(String)```), which depends on the result of the abstract factory method (it operates on the final pizza)

## Abstract Factory

There is an interface, which acts as an instance variable (composition) in the abstract product class (```Pizza```). In the
abstract factory there are several (abstract) factory methods for the various ingredients. The subclasses of the ```Pizza```
class inherit
- abstract method (```prepare()```), in which they can decide which factory methods they are using from the implementation of the abstract factory (which is set during the instantiation of the concrete pizza)

---
With the Factory pattern the object creation is encapsulated, therefore the creator classes (for example ```PizzaStore```)
depend on the abstract type (for example ```Pizza```), not the actual implementations (for example ```CheesePizza```) *1*.