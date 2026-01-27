package Loops;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  binary number: ");
        int binary = sc.nextInt();
        int power = 1; // 2^power
        int answer = 0;
         int unit_digit;
               while(binary > 0){

             unit_digit = binary % 10;
             answer += (unit_digit * power );
             binary /= 10;   // delete index unit digit
              power *=2;


        }
        System.out.println(answer);
    }
}
