package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SuffixSum {
    static void PrintArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void SwapFunction(int[] arr, int i , int j){
         arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
    }
     static void rotate(int []arr){
        int n = arr.length;
        int j = n-1;
        for(int i = 0; i < n; i++){
            if(arr[i] < arr[j]){
                SwapFunction(arr, i, j);
            }

        }
     }

    static void MakeSuffixArray(int[] arr) {

        int n = arr.length;
        int j = 0;
        int[] suffix =new int[n];
        for(int i = n-1; i >= 1; i--){
             j += arr[i];
              suffix[i] = j;
        }
        PrintArray(suffix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int Size = sc.nextInt();

        int[] arr = new int[Size+1];
        System.out.println("Enter the array elements: ");
        for(int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

         MakeSuffixArray(arr);  // arr = 1 2 3 4 5 ==      15 14 12  9 5


    }
}
