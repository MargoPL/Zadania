package OOP1;

public class Square extends Figure {
    Point p;
    double side;

    public Square(Point p, double side) {
        this.p = p;
        this.side = side;
    }

    public String toString() {
        return "Side: " + side;
    }

    public double getArea() {
        return Math.pow(side,2);
    }

    public double getCircuit() {
        return 4*side  ;
    }

    public Point[] getEdges() {
        Point[] points = {p, new Point(p.getX()+side,p.getY()),new Point(p.getX()+side,p.getY()+side),new Point(p.getX(), p.getY()+side)};
        return points;
    }
}
