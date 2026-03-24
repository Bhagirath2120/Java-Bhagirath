package Arrays;

// Question:
//given an integer array 'a' return the prefix sum/running sum in the same array
// without creating a new array

public class PrefixArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    //using another space
//    static int[] makePrefixArray(int[] arr) {
//        int n = arr.length;
//        int [] prefix = new int[n];
//         prefix[0] = arr[0];
//         for (int i = 1; i < n; i++) {
//              prefix[i] = prefix[i - 1] + arr[i];
//         }
//         return prefix;
//}


      static void makePrefixArray(int[] arr) {
        int i = 0;
        arr[i] = arr[0];
          System.out.println(arr[i]);

        for ( i = 1 ; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        printArray(arr);
      }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        System.out.println("Original array");
        printArray(arr);
        System.out.println("Prefix array");

        // using another space
//        int[] prefix = makePrefixArray(arr);
//        printArray(prefix);




        //without using another space
        makePrefixArray(arr);
    }

}

