package Conditionals;

import java.util.Scanner;

// take 3 positive integers input and print the Greatest of them (3 distinct)

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a +" is largest ");
        }
        if(b>a && b>c){
            System.out.println(b+" is largest ");
        }
        if(c>a && c>b){
            System.out.println(c+" is largest ");
        }

    }
}
