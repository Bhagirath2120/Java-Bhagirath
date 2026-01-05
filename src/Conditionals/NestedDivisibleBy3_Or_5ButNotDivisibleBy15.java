package Conditionals;
import java.util.Scanner;

// nested if else
// take integer input and tell if it is divisible by 3 or 5 but not divisible by 15

public class NestedDivisibleBy3_Or_5ButNotDivisibleBy15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

 //method 1

//        if(num%3==0 || num%5==0){
//            if(num%15!=0){
//                System.out.println(num+" is Divisible by 3 or 5 but not 15");
//            }
//            else{
//                System.out.println("Not matching the required condition ");
//            }
//        }
//        else{
//            System.out.println("Not matching the required condition ");
//        }
        // Method 2

        if(num%15!=0  && (num%5==0 || num%3==0)){     //   () have high priority compare to && operator and && operator have high priority compare to || operator
            System.out.println("Divisible By 3 or 5 but not 15");
        }
        else{
            System.out.println("Not matching Required condition");
        }
    }
}
