package Conditionals;
import java.util.Scanner;

// using ternary operator

public class evenOddTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String ans;

        ans = ( num%2 == 0 ) ? "Even" : "Odd";   // using ternary operator
        System.out.println(ans);

    }
}
