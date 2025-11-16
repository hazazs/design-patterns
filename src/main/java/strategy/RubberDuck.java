package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class RubberDuck extends Duck {

    RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        log.info("I'm a rubber duckie");
    }

}