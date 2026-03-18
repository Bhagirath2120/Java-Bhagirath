package Arrays;

import java.util.Scanner;


// find second smallest element

public class FindSecondSmallestValue {

    static int Fsmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int n = arr.length;
       for(int i = 0; i < n; i++){
           if(arr[i]<smallest){
               smallest=arr[i];  // 1,2,3,4,5
           }
       }
      return smallest;
    }

    static int SecondSmallest(int arr2[]){
        int SecondSmallest = Fsmallest(arr2);

        for(int i = 0; i < arr2.length; i++){
           if(arr2[i]==SecondSmallest){
               arr2[i]=Integer.MAX_VALUE;
           }
        }

        return Fsmallest(arr2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the number of elements in the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("second smallest no. : " + SecondSmallest(arr));

    }
}
