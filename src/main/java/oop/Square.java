package oop;

public class Square implements Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public Square() {

    }

    public double getArea(double side){
        return side*side;
    }

    public double getPerimeter(double side){
        return side*4;
    }


}
