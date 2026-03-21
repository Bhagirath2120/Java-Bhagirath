package Arrays;

public class SortArray0SAnd1S {

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr,int left, int right) {
        // swap term 1
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;

        // swap term 2
         arr[left] =  arr[left]+arr[right] - (arr[right] = arr[left]);
    }

    //for better approach
    static void sortArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }


//    static void sortArray(int[] arr) {
//        int n = arr.length;
//        int count0s = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                count0s++;
//            }
//        }
//        System.out.println();
//        System.out.println("count of 0:- " +count0s);   //   1,0,1,0,1,0,1,0,1,0 count0s = 5
//
//        for (int i = 0; i < n; i++) {
//            if ( i < count0s) {
//                arr[i] = 0;
//            }else{
//                arr[i] =  1;
//            }
//        }
//    }


    public static void main(String[] args) {

        int arr[] ={1,0,1,0,1,0,1,0,1,};
        System.out.println("Original Array ");
        PrintArray(arr);
        sortArray(arr);
        System.out.println();
        System.out.println("Sorted Array ");
        PrintArray(arr);
    }
}
