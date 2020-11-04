package oop;

import java.util.Scanner;

public class Romb implements FourSide, Colored {

    private double diagonal1;
    private double diagonal2;
    private String color;

    public Romb(double diagonal1, double diagonal2, String color) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (diagonal1*diagonal2)/2;
    }
    @Override
    public double getPerimeter() {
        return Math.pow(diagonal1,2)+Math.pow(diagonal2,2);
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
        Scanner s = new Scanner(System.in);
        System.out.println("Enter small diagonal:");
        double smallDiagonal = s.nextInt();
        return smallDiagonal;
    }

    @Override
    public double getColorPrice() {
        double price = 0;
        if (color == "red") price = 20;
        if (color == "blue") price = 12;
        if (color == "yellow") price = 25;
        else System.out.println("Color is not available");
        return price;
    }

    @Override
    public double moneyForColorUsed() {
        return getArea()*getColorPrice(); //20 money for 1m^2 color(as example)
    }

}
