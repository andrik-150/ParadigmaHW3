package seminar_3.decorator;

public class Milk extends CoffeeDecorator{

    public Milk(double decoratorcost, iCost decoratorName) {
        super(decoratorcost, decoratorName);
    }

    @Override
    public double cost() {
        return super.cost();
    }
}