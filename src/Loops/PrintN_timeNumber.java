package Loops;
import java.util.Scanner;
public class PrintN_timeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int num = 1;

//        PRINT N NUMBER


//        while(num <= n)         // while loop
//        {
//            System.out.print(num+"  ");
//            num++;
//
//        }
      //========================================================================================================================


        // PRINT SUM OF NATURAL NUMBER
        int sum = 0;
        while(num<=n){
            sum += num;
            num++;
        }
        System.out.println(sum);
        
    }
}
