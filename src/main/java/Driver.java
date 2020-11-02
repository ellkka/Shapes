import oop.*;

import java.awt.Shape;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int option;

        do {
            System.out.println("Choose a shape: \n1. Squar \n2.Romb \n3. Triangle ");
            option = input.read();

            switch (option) {

                case 1:
                    System.out.println("Enter a side of squar: ");
                    int side = input.read();
                    Square s = new Square(side);
                    System.out.println(s.getArea());
                    System.out.println(s.getPerimeter());


            }
        }


    }
}
