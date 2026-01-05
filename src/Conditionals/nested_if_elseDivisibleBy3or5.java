package Conditionals;
import java.util.Scanner;
// using nested if else
// take integer input and tell if it is divisible 3 or 5
public class nested_if_elseDivisibleBy3or5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if(num%3==0){
            if(num%5==0){
                System.out.println("The number is divisible by 3 or 5");
            }
            else {
                System.out.println("Not divisible");
            }
        }
        else{
            System.out.println("Not divisible");

        }
    }

}
