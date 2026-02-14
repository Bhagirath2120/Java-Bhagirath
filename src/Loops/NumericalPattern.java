package Loops;

import java.util.Scanner;

public class NumericalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++){

            for (int j = i; j <= r; j++){
                System.out.print(j);
            }
            for (int  k = 1; k <= i-1; k++){
                System.out.print(k);

            }
            System.out.println();
        }

    }

    public static class PracticePattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number r : ");
            int r = sc.nextInt();
            System.out.println("Enter number c : ");
            int c = sc.nextInt();
              int x = c;  // for experiment

    int obj = 1;
            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= i; j++) {
                System.out.print("*");
                }
                for (int j = 1; j <= x-1; j++) {
                    System.out.print("_");
                }
    //             2nd side

                for (int h = 1; h <= r-2 ; h++) {
                    for (int j = r -1 ;  j >h; j--) {
                        System.out.print("_");
                    }
                }


                // dust
    //            for (int j = 1; j <= c ; j++) {
    //                if(j >)
    //                System.out.print("*");
               // }


                x--;
                System.out.println();
            }
            for (int i = 1; i <= r ; i++) {
                for (int j = r-2 ; j >= i-1; j--) {
                    System.out.print("*");
                }
                if(i != r) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }














            // first structure

    //        for(int i =1; i<=r; i++){
    //
    //
    //
    //            for(int j =c ; j>1; j--){
    //
    //                System.out.print("*");
    //
    //            }
    //            System.out.println();
    //        }















    //        for (int x = 1; x <= r; x++) {
    //
    //            for (int k = 1; k <= x; k++) {
    //
    //                System.out.print("*");
    //            }
    //            for (int y = 1; y <= c-2; y++) {
    //                System.out.print("_");
    //            }
    //
    //            for (int k = 1; k <= x; k++) {
    //
    //                System.out.print("*");
    //            }
    //
    //            System.out.println();
    //
    //
    //
    //
    //        }

    //        for (int y = 1; y <= r; y++) {
    //            for (int j = 1; j <= r - y; j++) {
    //                System.out.print("*");
    //            }
    //            System.out.println();
    //        }

    //
    //        for (int x = r; x >= 1; x--) {
    //            for (int k = x; k >= 1; k--) {
    //
    //                System.out.print(" ");
    ////                for (int j = 1; j <= c-1; j++) {
    ////                    System.out.print(" ");
    ////                }
    //            }
    //            System.out.println();
    //
    //        }
    //
    //        for (int y = r; y >= 1; y--) {
    //            for (int j = r - y ; j >= 1 ; j--) {
    //                System.out.print(" ");
    //            }
    //            System.out.println();
    //        }









        }
    }
}
