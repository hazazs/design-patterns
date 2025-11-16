package decorator;

@SuppressWarnings("unused")
class Milk extends CondimentDecorator {

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + switch(beverage.getSize()) {
            case Size.TALL -> .05D;
            case Size.GRANDE -> .10D;
            case Size.VENTI -> .15D;
        };
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

}