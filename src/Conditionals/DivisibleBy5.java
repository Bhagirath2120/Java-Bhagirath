package Conditionals;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Hello my name is Bhagirath Rai");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.print("Yes, it is divisible by 5");
        }
        else{
            System.out.print("No, it is not divisible by 5");
        }
    }
}
