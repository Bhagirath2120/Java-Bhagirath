package Arrays;

public class RotateArrayInplace {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseFunction(int[] arr, int i, int j) {
//        while (i < j) {
//           swap(arr,i,j);
//           i++;
//           j--;
//        }

        //for loop
        for (int k = 0; k < j; k++) {
            swap(arr, i, j);
            j--;
            i++;

        }
    }

    static void Reverse(int[] arr,int k) {
        int n = arr.length;
         k = k%n;
         reverseFunction(arr,0,n-k-1);
         reverseFunction(arr,n-k,n-1);
         reverseFunction(arr,0,n-1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 3;
        Reverse(arr,k);
        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
