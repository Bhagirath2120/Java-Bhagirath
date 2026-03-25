package Arrays;
import java.util.Scanner;

//question: suffix sum array

public class SuffixSum {
    static void PrintArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void MakeSuffixArray(int[] arr) {

        int n = arr.length;
        int j = 0;
        int[] suffix =new int[n];
        for(int i = n-1; i >= 1; i--){  // arr = {1, 2, 3, 4, 5}
             j += arr[i];               // suffix sum = {15, 14, 12, 9, 5}
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

         MakeSuffixArray(arr);
    }
}
