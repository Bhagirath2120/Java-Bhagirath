package Loops;
import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int n = sc.nextInt();

        int sum = 0;
        // PRINT N NUMBERS USING for() loop

//        for(int i = 0; i <= n; i++){
//            System.out.println(i+ " ");
//
//        }
//==================================================================================================================

        // PRINT SUM OF N NUMBER USING for() LOOP
        for (int i = 0; i <= n; i++) {
            sum +=i;

        }
        System.out.println(sum);
    }
}
