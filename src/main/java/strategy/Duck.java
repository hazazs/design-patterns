package strategy;

abstract class Duck {

    /**
     * Has these interfaces as instance variables instead of implementing them.
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * All the subclasses need it in its original form.
     */
    void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * All the subclasses need it in a different way, so they override it in their own classes.
     */
    abstract void display();

    /**
     * These two methods delegate to the underlying object's implementation.
     */
    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    /**
     * With these two setter methods the strategy can be easily changed in runtime.
     */
    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}