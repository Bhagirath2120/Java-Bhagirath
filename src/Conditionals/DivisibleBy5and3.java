package Conditionals;

import java.util.Scanner;
 // take integer input and tell it is divisible by 5  and 3

public class DivisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("The number is divisible by 5 and 3");
        }
        else {
            System.out.println("The number is not divisible by 5 and 3");
        }
    }
}
