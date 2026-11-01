package shapes;

class Square extends Shape {
    private double myHeight;

    Square(double theHeight) {
        myHeight = theHeight;
    }

    public double getArea() {
        return myHeight * myHeight;
    }

    public String getName() {
        return "Square";
    }
}