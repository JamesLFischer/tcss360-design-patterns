package shapes;

class Circle extends Shape {
    private double myRadius;

    Circle(double theRadius) {
        myRadius = theRadius;
    }

    public double getArea() {
        return Math.PI * myRadius * myRadius;
    }

    public String getName() {
        return "Circle";
    }
}
