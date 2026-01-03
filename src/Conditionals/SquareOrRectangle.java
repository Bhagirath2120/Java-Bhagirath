package Conditionals;

import java.util.Scanner;

public class SquareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double Length = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double Breadth = sc.nextDouble();

        if (Length == Breadth){
            System.out.println("This is Square");
        }
        else{
            System.out.println("This is Rectangle");
        }

    }
}
