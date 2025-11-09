package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        log.info("All ducks float, even decoys!");
    }

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}