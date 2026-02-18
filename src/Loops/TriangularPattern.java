package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int r = sc.nextInt();
        int n = r;


//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        r = n;
////
////        // inverted or reverse or descending right-angled Triangle pattern
////        // descending  star pattren
//
        for (int i = 1; i <= r; i++) {
             for (int j = r ; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
//


    }
}
