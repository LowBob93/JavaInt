package HomeWork1.Figure;

class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw the square");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Square perimeter = " + side * 4);
    }

    @Override
    public void calcArea() {
        System.out.println("Square area = " + side * side);
    }


}