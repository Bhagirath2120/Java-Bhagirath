package Loops;
import java.util.Scanner;
// find the sum of digits in a given number n
// count digits
public class findSumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int ans = 0;
        int count =0;

// while loop

        while(n>0){
            ans+=n%10;   // ans = ans +n%10
            n/=10;       // n = n/10
            count++;      // count = count + 1
        }

//======================================================================================================
        // FOR LOOP

//        for(; n>0; n/=10){
//            count++;
//            ans+=n%10;
//
//        }

        System.out.println(" total digits: "+count);
        System.out.println("Sum Of digits  : "+ans);



    }

}

