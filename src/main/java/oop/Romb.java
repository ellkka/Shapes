package oop;

public class Romb implements Shape {

    private double diagonal1;
    private double diagonal2;

    public Romb(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {
        return (diagonal1*diagonal2)/2;
    }
    @Override
    public double getPerimeter() {
        return Math.pow(diagonal1,2)+Math.pow(diagonal2,2);
    }
}
