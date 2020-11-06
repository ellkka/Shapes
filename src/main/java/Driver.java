import oop.*;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        Romb r = new Romb(4,5, "red");
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println("Money for color will be: " + r.getColorPrice());

        /*do {
            System.out.println("Choose a shape: \n1. Square \n2.Rhombus \n3.Equilateral triangle \n4.Exit ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter a side of square: ");
                    int side = input.nextInt();
                    Square s = new Square(side);
                    System.out.println(s.getArea());
                    System.out.println(s.getPerimeter());
                    System.out.println(s.moneyForColor());
                    System.out.println(s.getColor());
                    System.out.println(s.getBigDiagonal());
                    System.out.println(s.getSmallDiagonal());
                    break;
                case 2:
                    System.out.println("Enter diagonals length of rhombus: ");
                    int side1 = input.nextInt();
                    int side2 = input.nextInt();
                    System.out.println("Enter color you want to paint: ");
                    String color = input.nextLine();
                    Romb r = new Romb(side1, side2, color);
                    System.out.println(r.getArea());
                    System.out.println(r.getPerimeter());
                    System.out.println("Money for color will be: " + r.moneyForColorUsed());
                    break;
                case 3:
                    System.out.println("Enter a side of triangle: ");
                    side = input.nextInt();
                    Triangle t = new Triangle(side);
                    System.out.println(t.getArea());
                    System.out.println(t.getPerimeter());
                    break;
                case 4:
                    break;


            }
        } while (option != 4 );

*/
    }
}
