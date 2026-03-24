package Arrays;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class PrefixSumSuffixSumPartition {

    static int TotalSum(int[] arr){
        int totalsum = 0;

        for(int i = 0; i < arr.length; i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean PrefixSumSuffixSum(int[] arr){
        int totalsum = TotalSum(arr);
        int pref = 0;
        for(int i = 0; i < arr.length; i++){
             pref += arr[i];
            int SuffixSum = totalsum -  pref;
            if(pref == SuffixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible: "+PrefixSumSuffixSum(arr));

    }
}
