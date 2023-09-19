package seminar_3.decorator;

public class Coffee implements iCost{

    private double сost;

    public Coffee(double сost) {
        this.сost = сost;
    }

    public double getСost() {
        return сost;
    }

    @Override
    public double cost() {
        return getСost();
    }
}