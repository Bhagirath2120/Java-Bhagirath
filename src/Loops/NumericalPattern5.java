package Loops;
import java.util.Scanner;
public class NumericalPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int r = sc.nextInt();

        for (int i = 1; i <= r;i++){

            for (int j=r; j >=i ; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int j = i-1; j >= 1; j--) {
                    System.out.print(j);
            }

            System.out.println();


        }



    }
}

