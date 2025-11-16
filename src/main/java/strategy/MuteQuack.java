package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        log.info("<< Silence >>");
    }

}