package decorator;

@SuppressWarnings("unused")
class Mocha extends CondimentDecorator {

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + switch(beverage.getSize()) {
            case Size.TALL -> .15D;
            case Size.GRANDE -> .20D;
            case Size.VENTI -> .25D;
        };
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}