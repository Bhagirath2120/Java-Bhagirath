package Arrays;

import java.util.Scanner;

// check if the given array is sorted or not  (consider increasing order) all elements are strictly great
// new class
class checking{

    boolean check = true;

  void mehtod(int arr[]){

        for(int i = 1; i < arr.length; i++){

            if(arr[i] < arr[i-1]){
                check = false;
                break;

            }
        }
        System.out.println("is sorted : "+check);
    }

}

public class checkArraySorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checking obj1 = new checking();

        // define size of array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // array created
        int arr1[] = new int[size];

        //get input array elements
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        obj1.mehtod(arr1);
    }
}
