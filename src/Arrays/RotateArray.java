package Arrays;

import java.util.Scanner;

public class RotateArray {

    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Rotate(int arr[], int k){
        int n = arr.length;
        k = k % n;
        int j = 0;
        int OriginalArray[] = new int[n];

        for(int i = n-k; i < n; i++){
            OriginalArray[j++] = arr[i];
        }
//        printArray(OriginalArray);

        for(int i = 0; i < n-k; i++){
             OriginalArray[j++] = arr[i];
        }
        printArray(OriginalArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


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
        System.out.println("Enter Rotation value (k): ");
        int k = sc.nextInt();
        Rotate(arr1, k);


//            int arr[] = {1,2,3,4,5};
//            int k = 9;
//           Rotate(arr,k);

    }
}
