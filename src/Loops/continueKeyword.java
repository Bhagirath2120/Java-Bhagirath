package Loops;

import java.util.Scanner;

public class continueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.println(i);
//
//        }
        int num=1;
        while(num<=n){
            if(num %3==0){
                num++;
                continue;

            }
            System.out.println(num);
            num++;
        }
    }
}
