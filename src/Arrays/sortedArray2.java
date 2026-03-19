package Arrays;


import java.util.Scanner;

class sorting{

    boolean check = true;
    void SortedArray(int arr[]){
        System.out.println("given array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = 1; i < arr.length; i++) {
                if (arr[i] <arr[i - 1]) {
                check = false;
                 break;
            }
        }
        System.out.println("is sorted: "+check);
    }
}


public class sortedArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sorting obj1 = new sorting();

        System.out.print("Enter the size of the array: ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        obj1.SortedArray(arr);

    }
}
