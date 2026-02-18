package Loops;
import java.util.Scanner;
public class StreamOfNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum =0;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // while loop        // as soon as -1 input given, the loop break.

//        while(n != -1){
//            sum +=n;
//            n = sc.nextInt();
//        }
//        System.out.println(sum);



// =========================================================================================================



        // difference between while loop and do while loop



     do {            //but here the loop does not break even after giving the input -1 ; the first time it initialise -1 to sum
                    // and then checks the condition but after this as soon as the input is -1 the loop will break
          sum += n;
          n = sc.nextInt();

      }while(n !=-1);    //
        System.out.println(sum);

    }
}
