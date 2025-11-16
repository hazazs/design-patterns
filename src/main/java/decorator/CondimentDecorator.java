package decorator;

abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    abstract String getDescription();

    Size getSize() {
        return beverage.getSize();
    }

}