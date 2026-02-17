package Loops;
import java.util.Scanner;

public class RaiseToThePower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the number (b): ");
        int b =  sc.nextInt();
        int ans = 1;

        // for loop

//        for(int i= 1; i <= b; i++){
//            ans = ans * a;
//
//        }


//        while loop

        while(b>=1){
            ans = ans * a;
            b--;
        }

        System.out.println("Raise to the power of " + a  + " : " + ans);


    }
}
