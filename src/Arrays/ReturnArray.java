package Arrays;

import java.util.Scanner;
import java.util.Arrays;




class Forsorting {

     public int[] sorting(int[] arr2) {

         Arrays.sort(arr2); //Arrays.sort() function is a in-build function on Arrays class

         System.out.print("Sorted array elements are : ");
         for (int num : arr2) {
             System.out.print(num + " ");
         }
         System.out.println();

         int[] arr3 = {arr2[0], arr2[arr2.length - 1]};

         return arr3;
     }
}

public class ReturnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Forsorting obj1 = new Forsorting();
        System.out.print("Enter the size of the array: " );
        int length = sc.nextInt();

        int arr1[] = new int[length];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < length; i++){
            arr1[i] = sc.nextInt();
        }

        int arr3[] = obj1.sorting(arr1);


        System.out.println("smallest element is : "+arr3[0]);
        System.out.println("Greatest element is : "+arr3[1]);








    }


}
