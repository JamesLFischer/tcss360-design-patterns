package shapes;

public class Rectangle extends Shape {
    private double myHeight;
    private double myWidth;

    Rectangle(double theHeight, double theWidth) {
        myHeight = theHeight;
        myWidth = theWidth;
    }

    public double getArea() {
        return myHeight * myWidth;
    }

    public String getName() {
        return "Rectangle";
    }
}
