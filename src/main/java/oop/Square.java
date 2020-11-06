package oop;

import java.util.Scanner;

public class Square implements FourSide, Colored {
    private double side;
    private String color;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter(){
        return side*4;
    }

    @Override
    public double getColorPrice() {
        return 0;
    }

    @Override
    public double getBigDiagonal() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter big diagonal:");
        double bigDiagonal = s.nextInt();
        return bigDiagonal;
    }

    @Override
    public double getSmallDiagonal() {
        return getBigDiagonal();
    }
}
