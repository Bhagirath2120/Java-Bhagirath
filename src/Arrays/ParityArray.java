package Arrays;

//Question:-
// given an array of integers 'a', move all the even integers at the
// beginning of the array followed by all the odd integers. the relative order
// of odd or even integers does not matter. return any array that satisfies the condition.
public class ParityArray {


    static void SortArrayByparity(int[] arr) {
        int n = arr.length;
        int  left  = 0;
        int right = n - 1;
        //System.out.println("parity array");

        while (left < right) {
         if(arr[left] %2 == 1 && arr[right] %2 == 0 ) {
            swapFunction(arr, left, right);
         }
         if(arr[left] %2 == 0 ){
             left++;
         }
         if(arr[right] %2 == 1 ) {
            right--;
         }
        }
    }

    static void  swapFunction(int[] arr, int left, int right) {
        arr[left] = arr[left] + arr[right] - ( arr[right] = arr[left] );
    }

     static void printArray(int[] arr) {
         System.out.println("printing array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("original Sorting");
        printArray(arr);

        SortArrayByparity(arr);
        printArray(arr);
    }
}
