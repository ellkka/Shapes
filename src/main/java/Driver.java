import oop.*;

import java.awt.Shape;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Choose a shape: \n1. Square \n2.Rhombus \n3.Equilateral triangle \n4.Exit ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter a side of square: ");
                    int side = input.nextInt();
                    Square s = new Square(side);
                    System.out.println(s.getArea());
                    System.out.println(s.getPerimeter());
                    break;
                case 2:
                    System.out.println("Enter diagonals length of rhombus: ");
                    int side1 = input.nextInt();
                    int side2 = input.nextInt();
                    Romb r = new Romb(side1, side2);
                    System.out.println(r.getArea());
                    System.out.println(r.getPerimeter());
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


    }
}
