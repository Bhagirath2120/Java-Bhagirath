package Arrays;
import java.util.Scanner;

//question:- count  the number of elements strictly Greater than value x

//new class
class Operation {
    public  void findGrt(int [] arr, int x){
        int ans = 0;

        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
            if(arr[i] > x){
                ans = ans + 1;
            }
        }
        System.out.println();
        System.out.println(ans+" Elements are Greater then "+x);


    }
}

public class CountElementStrictlyGrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Operation obj1 = new Operation();

        // array size define here
        System.out.print("Enter array size: ");
        int length = sc.nextInt();
        System.out.println();

        // array created
        int[] arr1 = new int[length];

        // assign elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // value X define here
        System.out.println("Enter X value: ");
        int x = sc.nextInt();
        obj1.findGrt(arr1,x);

    }
}
