package shapes;

public class Triangle extends Shape {
    private double myHeight;
    private double myWidth;

    Triangle(double theHeight, double theWidth) {
        myHeight = theHeight;
        myWidth = theWidth;
    }

    public double getArea() {
        return (myHeight * myWidth) / 2.0;
    }

    public String getName() {
        return "Triangle";
    }
}
