package Arrays;

public class PrefixArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixArray(int[] arr) {
        int n = arr.length;
        int [] prefix = new int[n];
         prefix[0] = arr[0];
         for (int i = 1; i < n; i++) {
              prefix[i] = prefix[i - 1] + arr[i];
         }
         return prefix;
}

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        System.out.println("Original array");
        printArray(arr);
        System.out.println("Prefix array");
        int[] prefix = makePrefixArray(arr);
        printArray(prefix);
    }

}

