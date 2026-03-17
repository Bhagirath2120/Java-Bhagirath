package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindSecondMax {

  static int Fmax(int arr[]) {
       int max = Integer.MIN_VALUE;

      for (int i = 0; i < arr.length; i++) {
          if (arr[i] > max) {
              max = arr[i];
          }
      }
     return max;
  }



      static int SecondMax(int arr1[]){
         int max = Fmax(arr1);
          for (int i = 0; i < arr1.length; i++) {
              if (arr1[i] == max) {
                  arr1[i] = Integer.MIN_VALUE;
              }
          }
          return Fmax(arr1);

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

        System.out.println("second max no. is: " + SecondMax(arr));



    }
}
