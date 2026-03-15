package Arrays;
import java.util.Scanner;
import java.util.Arrays;

// new class
class OperationClass{
    void showArray(int[] arr){
        System.out.println("Printing array function");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


// main function class
public class Arrayinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      OperationClass obj1 = new OperationClass();

        int arr1[] =  new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter array elements index " +i +" : ");
            arr1[i] = sc.nextInt();
        }

        // show elements
        obj1.showArray(arr1);

        // create arr2
        int a2 = 3;
        int a4 = 1,b4 = 3;                    //for new memory allocation in heap memory
        int arr2[] = Arrays.copyOf(arr1,a2);  //  copyOf function have two arguments  first arguments  array, last range
        int arr3[] = arr1.clone();
        int arr4[] = Arrays.copyOfRange(arr1, a4, b4);  // copyOfRange function have 3 arguments (first argument array, second argument index no. from here to , third argument last range)


        System.out.println("arr2 copying value index no 0 to array length x = "+a2);
        obj1.showArray(arr2);
        System.out.println();
        System.out.println("arr3 copy all value");
        obj1.showArray(arr3);
        System.out.println();
        System.out.println("arr4 copying Index No. x = "+a4+" to Index No. y = "+b4);
        obj1.showArray(arr4);





        //        System.out.println();
//        System.out.println("Without changing element print arr2 ");
//       obj1.showArray(arr2);
//       arr2[0] = 0;
//       arr2[1] = 0;
//       arr2[2] = 0;
//        System.out.println();
//
//        System.out.println("change value and printing arr2");
//        obj1.showArray(arr2);
//
//        System.out.println();
//        System.out.println("arr1 printing");
//        obj1.showArray(arr1);
//
   }
}
