package shapes;

public class ShapeFactory {
    public static Shape createShape(String type, double... params) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(params[0]);

            case "square":
                return new Square(params[0]);

            case "rectangle":
                return new Rectangle(params[0], params[1]);

            case "triangle":
                return new Triangle(params[0], params[1]);

            default:
                throw new IllegalArgumentException("Invalid shape");
        }
    }
}
