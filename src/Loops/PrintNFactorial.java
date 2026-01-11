package Loops;

import java.util.Scanner;

public class PrintNFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int f = 1;

        for(int i = 1; i <= n; i++){
            f *= i;
            System.out.println("Factorial of " + i + " : " + f);
        }



//        // while loop
//         f =1;
//        int test = 1;
//        int x = 1;
//        while(n>=test){
//
//            f *=x;
//
//            System.out.println("Factorial of " + x + " : " + f);
//            n--;
//             x++;
//        }
    }
}

