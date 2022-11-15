package HomeWork1.Figure;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw the Circle");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Circle Perimeter = " + 2 * Math.PI * radius);
    }

    @Override
    public void calcArea() {
        System.out.println(" Circle Area = " + Math.PI * radius * radius);
    }

}