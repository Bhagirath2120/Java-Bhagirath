package Conditionals;
// take integer input and tell if it is divisible 5 or 3

import java.util.Scanner;

public class DivisibleBy5_Or_3 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num%5==0 || num%3 ==0){
            System.out.println("The Number is divisible by either 3 or 5");
        }
        else{
            System.out.println("Not divisible by either 3 or 5");
        }
    }
}
