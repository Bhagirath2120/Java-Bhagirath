package Arrays;

public class SwapArray {

     // array print function
     static void PrintArray(int arr[]){
         for(int i = 0; i < arr.length ;i++){
          System.out.print(arr[i]+" ");
         }
     }


     // swap function
    static int[] SwapArray(int arr2[]){

        int n = arr2.length;
        int j = 0;
        int arr3[] = new int[n];

        for (int i = n-1; i >= 0; i--) {
            arr3[j++] = arr2[i];
        }

        return arr3;
    }


    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6};   // original array

        System.out.print("Before swap array: ");
        PrintArray(arr1); //array print function

        int SwapArr[] = SwapArray(arr1);  // swap function
        System.out.println();
        System.out.print("After swap array: ");
        PrintArray(SwapArr); // array print function

    }
}
