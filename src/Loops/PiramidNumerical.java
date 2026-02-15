package Loops;
import java.util.Scanner;
public class PiramidNumerical {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = sc.nextInt();


        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);

            if (i >= 2) {
                for (int j = 1; j <= i+1; j++) {
                    if (i == r) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
                    System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("   1 ");
        System.out.println("  2  2");
        System.out.println(" 3    3");
        System.out.println("4444444");


    }
}
