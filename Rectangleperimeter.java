package Circle;

public class  Rectangleperimeter {
    double radius;

    public Rectangleperimeter(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea(5.0);
        Rectangleperimeter circlePerimeter = new Rectangleperimeter(5.0);

        System.out.println("Circle Area: " + circleArea.calculateArea());
        System.out.println("Circle Perimeter: " + circlePerimeter.calculatePerimeter());
    }
}
