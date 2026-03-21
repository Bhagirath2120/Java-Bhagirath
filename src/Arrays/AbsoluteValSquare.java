package Arrays;

public class AbsoluteValSquare {

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void SwapArray(int[] arr,int i,int j) {

          arr[i] = arr[i] +arr[j] - (arr[j]=arr[i]);
    }

    static void reverse(int[] arr) {
       int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    SwapArray(arr,i,j);
                }

            }
        }
       // arr[left] = arr[left]+arr[right] - (arr[right]=arr[left]);
    }

    static int[] SortedArray(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int left = 0, right = n-1;
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-10, -3, -2, 1, 3, 5};
        int ans[] = SortedArray(arr);
        PrintArray(ans);

    }
}

