package Conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ");
        int n = sc.nextInt();

        if( n <0 ){
        int c = n*-1;
        System.out.println("The absolute value is "+c);
        }
        else {
            System.out.println("The absolute value is " + n);
        }



    }
}
