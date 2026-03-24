package Arrays;

import java.util.Scanner;

// given an array of integers of size n answer Q queries where you need to print the sum of values
// in a given range of indices from l to r (both includesd).
// Note: The values of l to r in queries follow 1-based indexing.


 public class PrefixSumWIthRange {

    static void prefixSum(int[] arr ) {
         int n = arr.length;
         for (int i = 1; i < n; i++) {
             arr[i] += arr[i - 1];
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);

        System.out.print("Enter queries: ");
        int queries = sc.nextInt();

        while (queries-- > 0) {
            System.out.println("Enter range ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = arr[r] - arr[l-1];


            System.out.println("Sum = "+sum);
        }

    }
}
