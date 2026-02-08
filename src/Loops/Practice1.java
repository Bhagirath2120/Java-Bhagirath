package Loops;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Row : ");
//        int r = sc.nextInt();
//        System.out.println("Enter Column : ");
//        int c = sc.nextInt();


                for (int i = 0; i < 1; i++) {
                    System.out.print("*");
                    for (int j = 0; j < 4; j++) {
                        System.out.print("_");
                    }
                    System.out.println("*");
                }

                // Second line: **__**
                for (int i = 0; i < 2; i++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2; j++) {
                    System.out.print("_");
                }
                for (int i = 0; i < 2; i++) {
                    System.out.print("*");
                }
                System.out.println();

                // Third line: ******
                for (int i = 0; i < 6; i++) {
                    System.out.print("*");
                }
                System.out.println();

                // Fourth line: **__**
                for (int i = 0; i < 2; i++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2; j++) {
                    System.out.print("_");
                }
                for (int i = 0; i < 2; i++) {
                    System.out.print("*");
                }
                System.out.println();

                // Fifth line: *____*
                for (int i = 0; i < 1; i++) {
                    System.out.print("*");
                    for (int j = 0; j < 4; j++) {
                        System.out.print("_");
                    }
                    System.out.println("*");
                }












//
//int Inc = 2;
//        for (int i = 1; i <= r; i++) {
//            if (i == 6){
//                break;
//            }
//
//            if (i <= 3) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                if(i==1)
//                for (int j = i; j <= c-2; j++) {
//                    System.out.print("_");
//                }
//                if(i==2){
//                    for (int j = 1; j <= 2; j++) {
//                       System.out.print("_");
//                    }
//                   ///  start code from here
//                }
//
//
//                for(int S = i; S >= 1; S--){
//
//                     System.out.print("*");
//                 }
//
//            } else {
//                if(i == 4) {
//                    for (int k = 1; k <= 2; k++) {
//                        System.out.print("*");
//                    }
//                }
//                else {if ( i > 4){
//
//                        System.out.println("*");
//                    }
//                }
//
//                if(i == 4 || i == 5){
//                    for (int k = 1; k <= i-2; k++) {
//                        System.out.print("_");
//                    }
//
//                }
//
//
//
//
//
//
//            }
//            System.out.println();

    }

}
