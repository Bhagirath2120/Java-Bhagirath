package javaInput;
import java.util.Scanner;
public class SumOf2NumberInput {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number:");
               double x = sc.nextDouble(); //  for input
        System.out.print("Enter 2nd Number:");
               double y = sc.nextDouble();

               double sum = x+y;   //operation

        System.out.print("Sum = "+sum);
    }
}
