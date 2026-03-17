package Arrays;

// Question: Find the total number of pairs in the array ehose sum is equal to the given value x

import java.util.Scanner;

class Pairs{
     int FindPairs(int arr2[], int Target){
         int ans = 0;
         int length = arr2.length;
         for(int i = 0; i < length; i++){
             for(int j = i + 1; j < length; j++){
                 if(arr2[i] + arr2[j] == Target){
                     ans++;
                 }
             }
         }
         return ans;
     }
}


public class ElementsPairsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods obj1 = new Methods();

        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        int arr1[] = new int[length];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

       int pairs =  obj1.FindPairs(arr1,target );

       System.out.println("The pairs in the array is : "+pairs);



    }


}
