import shapes.*;
import java.util.*;

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(ShapeFactory.createShape("circle", 5));
        shapes.add(ShapeFactory.createShape("rectangle", 4, 6));
        shapes.add(ShapeFactory.createShape("triangle", 3, 7));
        shapes.add(ShapeFactory.createShape("square", 6.32455532034));



        for (Shape s : shapes) {
            String num = String.format("%.4f", s.getArea());
            num = num.replaceAll("0+$", "");
            num = num.replaceAll("\\.$", ".0");
            System.out.printf("%s area: %s%n", s.getName(), num);
        }
    }
}
