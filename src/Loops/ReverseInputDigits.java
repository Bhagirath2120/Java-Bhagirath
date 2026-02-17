package Loops;

import java.util.Scanner;

public class ReverseInputDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rev = 0;

//        while (n > 0) {
//
//             rev = (rev * 10) + (n % 10);
//            n/=10;
//
//        }

        for(; n>0; n/=10){
            rev = (rev * 10) + (n % 10);

        }
        System.out.println("Reverse number : " + rev);

    }
}

