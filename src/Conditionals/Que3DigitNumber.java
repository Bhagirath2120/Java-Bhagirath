package Conditionals;
//take integer input and tell if it is a 3-digit number

import java.util.Scanner;
public class Que3DigitNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int Number = sc.nextInt();

        if (Number>99 && Number<1000){
            System.out.println("This is a 3 Digit Number");
        }
        else{
            System.out.println("It is not a 3 Digit Number");

        }

    }
}
