# OBSERVER PATTERN

1. Strive for loosely coupled designs between objects that interact.

There are two main interfaces, ```Subject``` (publisher) and ```Observer``` (subscriber) with a one-to-many relationship between
them.
There can be optionally other interfaces, like ```DisplayElement``` in our case.

## The Subject

The concrete subject (```WeatherData```) implements the following methods from the ```Subject``` interface:
- registerObserver(Observer)
- removeObserver(Observer)
- notifyObservers()

It also has a ```private List<Observer> observers``` list, and in the ```notifyObservers()``` method it calls the ```update(float, float, float)```
method on each element in the list after any change in its state (i.e. ```measurementsChanged()```).

## The Observers
All the observers implement the following method from the ```Observer``` interface:
- update(float, float, float)

During the instantiation they can register themselves on the ```WeatherData``` constructor parameter by calling ```registerObserver(this)```.

---
With the Observer pattern the subject and the observers don't know the implementation of each other (*1*), and any number
of observers can be (un)registered in runtime.