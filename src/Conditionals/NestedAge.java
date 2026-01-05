package Conditionals;
import java.util.Scanner;

public class NestedAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ram, enter your age : ");
        int Ram = sc.nextInt();
        System.out.print("Shyam, enter your age : ");
        int Shyam  = sc.nextInt();
        System.out.print("Ajay, enter your age : ");
        int Ajay = sc.nextInt();

        if(Ram < Shyam){
            if(Ram < Ajay){
                System.out.println(" Ram is young ");
            }
            else {
                System.out.println(" Ajay is young ");
            }
        }
        else{ // shyam<Ram
            if(Shyam < Ajay){ //if true the condition is Shyam<Ram<Ajay
                System.out.println(" Shyam is young ");
            }
            else { // Ajay<Syam<Ram
                System.out.println(" Ajay is young ");
            }
        }

    }
}
