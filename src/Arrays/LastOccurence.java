package Arrays;

import java.util.Scanner;

// Question:- find the last Occurence of an element x in a given array

public class LastOccurence {
    static void LastOccurence(int[] arr, int x){
        int ans =  0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        if(ans> 0) {
            System.out.println("Last time found at index no. : "+ans);
        }else
            System.out.println("Element not found");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // define array size
        System.out.print("Enter array length: ");
        int length = sc.nextInt();

        // array declaration
        int[] arr1 = new int[length];

        // assign array elements
        System.out.print("Enter array elements: " );
        for (int i = 0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter element to find: ");
        int x = sc.nextInt();
        System.out.println();

        // pass array and
        LastOccurence(arr1, x);


    }
}
