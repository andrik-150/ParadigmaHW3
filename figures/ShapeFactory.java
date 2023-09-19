package seminar_3.figures;

public class ShapeFactory {


    public Shape create_shape(ShapeType type){
        Shape shape = null;

        switch (type){
            case TRIANGLE -> shape = new Triangle();
            case SQUARE -> shape = new Square();
            case CIRCLE -> shape = new Circle();
        }
        return shape;
    }
}