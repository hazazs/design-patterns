package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        log.info("Squeak");
    }

}