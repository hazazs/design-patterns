package decorator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

abstract class Beverage {

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.PACKAGE)
    private Size size = Size.TALL;

    @Getter(AccessLevel.PACKAGE)
    String description = "Unknown Beverage";

    abstract double cost();

    enum Size {
        TALL,
        GRANDE,
        VENTI

    }

}