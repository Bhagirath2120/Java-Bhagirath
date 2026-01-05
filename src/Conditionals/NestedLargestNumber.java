package Conditionals;
import java.util.Scanner;

// nested if else
// take integer input and print largest number (distinct 3 number)

public class NestedLargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();


        if(a>b){  // if condition is false then b is greater then a
            if(a>c){
                System.out.println(a+ "  is largest number");
            }
            else {
                System.out.println(c +"  is largest number");
            }
        }
        else { // mean b>a  , condition is all-ready in upper if statement
            if(b>c){
                System.out.println(b+ "  is largest number");
            }
            else {
                System.out.println(c +"  is largest number");
            }
        }
    }
}
