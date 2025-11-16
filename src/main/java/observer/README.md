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

It also has a ```private List<Observer> observers``` list, and in the ```notifyObservers()``` method it calls the ```update()```
method on each element in the list after any change in its state (i.e. ```measurementsChanged()```).

## The Observers
All the observers implement the following method from the ```Observer``` interface:
- update()

During the instantiation they can register themselves on the ```WeatherData``` constructor parameter by calling ```registerObserver(this)```.

---
With the Observer pattern the subject and the observers don't know the implementation of each other (*1*), and any number
of observers can be (un)registered in runtime.
This is the pull-based alternative of the Observer pattern, where all the individual displays (concrete observers) will pull
only the necessary measurements from the concrete subject through its getters. In the push-based alternative the ```update()```
method looks like this:
```update(float, float, float)```
Which means the concrete subject will push all the measurements to the concrete observers, even if they don't need them at
all. With this alternative we can cause redundancy.