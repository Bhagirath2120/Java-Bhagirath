package Conditionals;

//take integer input and tell if it is a 2 digit number

import java.util.Scanner;
public class Que2DigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = sc.nextInt();

        if (Number>9 && Number<100){
            System.out.println("This is a 2 Digit Number");
        }
        else{
            System.out.println("It is not a 2 Digit Number");
        }

    }

}
