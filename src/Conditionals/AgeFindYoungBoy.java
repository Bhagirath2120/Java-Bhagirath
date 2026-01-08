package Conditionals;
import java.util.Scanner;
public class AgeFindYoungBoy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello my name is Bhagirath Rai");
        System.out.print("Ram Enter your age : ");
        int A = sc.nextInt();
        System.out.print("Shyam Enter your age : ");
        int B = sc.nextInt();
        System.out.print("Ajay Enter your age : ");
        int C = sc.nextInt();


        if(A<B && A<C){
            System.out.println("Ram is young ");
        }
        else if(B<A && B<C){
            System.out.println("Shyam is young ");
        }
        else {
            System.out.println("Ajay is young ");
        }

    }
}
