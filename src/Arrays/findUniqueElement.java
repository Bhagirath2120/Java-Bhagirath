package Arrays;
import java.util.Scanner;

public class findUniqueElement {
    static int findUniqueElement(int[] arr){
        int ans = 0;
        int n = arr.length;
       for(int i = 0; i < n; i++){
           for(int j = i + 1; j < n; j++){
               if(arr[i]==arr[j]){
                   arr[i] = -1;
                   arr[j] = -1;
               }
           }
       }
       for(int i = 0; i < n; i++){
           if(arr[i] > 0){
               ans = arr[i];
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int found = findUniqueElement(arr);
        System.out.println("the unique element is : "+found);

    }
}
