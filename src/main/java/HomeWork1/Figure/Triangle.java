package HomeWork1.Figure;

public class Triangle implements Figure {
    private double sideOne;
    private double sideTwo;

    public Triangle(double side1, double side2) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Draw the  Triangle");
    }


    @Override
    public void calcPerimeter() {
        System.out.println("Triangle perimeter = " + (Math.sqrt(sideOne * sideOne + sideTwo * sideTwo) + sideOne + sideTwo));
    }

    @Override
    public void calcArea() {
        System.out.println("Triangle area = " + sideOne * sideTwo / 2);
    }

}