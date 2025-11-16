package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        log.info("Squeak");
    }

}