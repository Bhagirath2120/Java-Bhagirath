package OOPs;
import java.util.Scanner;

// new class
class algebra{
    public int Add(int a,int b){

        int Z = a + b;

        return Z;
    }
}



// main function class
public class AddTwoNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        algebra a1 = new algebra();     //object created

        System.out.println(" Enter first number: ");
         int a = sc.nextInt();
        System.out.println(" Enter second number: ");
        int b = sc.nextInt();
         int ans = a1.Add(a,b);
        System.out.println(" sum = "+ ans);


    }
}
