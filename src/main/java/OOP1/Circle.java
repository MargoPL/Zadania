package OOP1;

public class Circle extends Figure {
    Point p;
    double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public String toString() {
        return "Radius: " + r + " Center: " + p;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getCircuit() {
        return 2 * Math.PI * r;
    }

    public Point[] getEdges() {
        Point[] points = {p, new Point(p.getX()+r, p.getY())};
        return points;
    }
}
