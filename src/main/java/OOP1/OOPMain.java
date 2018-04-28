package OOP1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OOPMain {
    public static void main(String[] args) {
        Rectangle rectangleExample = new Rectangle(new Point(0,0),2,3);
        Circle circleExample = new Circle(new Point(0,0),2);
        Square squareExample = new Square(new Point(0,0),2);

        System.out.println(rectangleExample.getArea());
        System.out.println(Arrays.toString(rectangleExample.getEdges()));
        System.out.println(rectangleExample.getCircuit());

        System.out.println(circleExample.getArea());
        System.out.println(Arrays.toString(circleExample.getEdges()));
        System.out.println(circleExample.getCircuit());

        System.out.println(squareExample.getArea());
        System.out.println(Arrays.toString(squareExample.getEdges()));
        System.out.println(squareExample.getCircuit());

    }
}
