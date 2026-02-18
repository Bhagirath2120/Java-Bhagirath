package Loops;

import java.util.Scanner;
// find the sum of following series, S = 1-2+3-4+5......n

public class SumSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
         int ans = 0;


//         FOR LOOP

//        for( int i = 1; i <= n; i++){
//            if (i % 2 == 0) {
//                ans -= i;
//            }else{
//                ans += i;
//            }
//        }

        // while loop

        int w = 1;

        while(n>=w){
            if(n%2==0){
                ans-=n;
            }
            else{
                ans+=n;
            }
                n--;
        }

        System.out.println("Sum Series : "+ans);
    }
}
