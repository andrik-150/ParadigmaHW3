package seminar_3.decorator;

public abstract class CoffeeDecorator implements iCost{

    private double cost;
    protected iCost decoratorName;

    public CoffeeDecorator(double decoratorCost, iCost decoratorName) {
        this.cost = decoratorCost;
        this.decoratorName = decoratorName;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public double cost() {
        return getCost() + decoratorName.cost();
    }
}