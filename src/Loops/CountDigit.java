package Loops;
import java.util.Scanner;

// count digits in number
public class CountDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();


        int count =0;


        while(n>0){
            n =n/10;
            count++;
        }
        System.out.println("Total digits  " +count);


        //==================================================================================================

        //for loop

//       for(; n !=0; n /=10){
//           count++;
//       }
//        System.out.println("Total digits " +count);


    }
}
