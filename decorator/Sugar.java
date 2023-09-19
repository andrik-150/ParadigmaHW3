package seminar_3.decorator;

public class Sugar extends CoffeeDecorator{

    public Sugar(double decoratorcost, iCost decoratorName) {
        super(decoratorcost, decoratorName);
    }

    @Override
    public double cost() {
        return super.cost();
    }
}