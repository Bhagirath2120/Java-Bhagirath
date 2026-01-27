package Loops;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal = sc.nextInt();
        int parity = 0;
        int ans = 0;
        int power = 1;  // power of 10

        while(decimal > 0){
             parity = decimal % 2;
             ans += (parity  * power );
            power *= 10;
            decimal /= 2;
        }
        System.out.println(ans);
    }
}
