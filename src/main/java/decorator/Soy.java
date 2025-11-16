package decorator;

@SuppressWarnings("unused")
class Soy extends CondimentDecorator {

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + switch(beverage.getSize()) {
            case Size.TALL -> .10D;
            case Size.GRANDE -> .15D;
            case Size.VENTI -> .20D;
        };
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

}