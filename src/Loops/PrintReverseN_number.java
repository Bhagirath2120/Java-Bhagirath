package Loops;
import java.util.Scanner;
public class PrintReverseN_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Reverse Order");


        for (int i = n; i>0; i--){

            System.out.println(i);

        }
    }
}
