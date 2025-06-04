package Circle;

public class CircleArea {
    double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
