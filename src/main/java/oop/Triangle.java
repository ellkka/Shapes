package oop;

public class Triangle implements Shape {
    private double side;

    public Triangle(double side1) {
        this.side = side1;
    }


    @Override
    public double getArea() {
        return (float)(((Math.sqrt(3)) / 4) * side * side);
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }
}
