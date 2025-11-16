package decorator;

@SuppressWarnings("unused")
class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    double cost() {
        return .89D;
    }

}