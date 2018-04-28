package OOP1;

public class Rectangle extends Figure {
    Point startingPoint;
    double width;
    double height;

    public Rectangle(Point startingPoint, double width, double height) {
        this.startingPoint = startingPoint;
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return ""+"Width: "+width+" Height: "+height;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircuit() {
        return (2*width) + (2*height);
    }

    public Point[] getEdges() {
        Point[] points = {startingPoint,new Point(startingPoint.getX() + width, startingPoint.getY()),new Point(startingPoint.getX()+width,startingPoint.getY() + height),new Point(startingPoint.getX(), startingPoint.getY() + height)};
        return points;
    }
}
