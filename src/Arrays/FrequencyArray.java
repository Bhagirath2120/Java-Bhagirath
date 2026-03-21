package Arrays;

import java.util.Scanner;

//QUESTION:
//given Q query, check if the given number is present in the array or not
// Note: Value of all the elements in the array is less then 10 to the pawer 5

public class FrequencyArray {

    static int[] frequencyArray(int[] arr){
        int[] freq = new int[100005];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]] = freq[arr[i]]+1;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = frequencyArray(arr);

        System.out.println("Enter the number of queries: ");
        int queries = sc.nextInt();

        while(queries > 0){
            System.out.println("Enter the element to be Search: ");
            int x = sc.nextInt();
            if (freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            queries--;
        }
    }
}
