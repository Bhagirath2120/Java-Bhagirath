package Arrays;
import java.util.Scanner;



public class FirstRepeatValuePrint {

    static int Repeat(int arr []){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == arr[i]){
                return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // define size of array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // array created
        int arr1[] = new int[size];

        //get input array elements
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("First repeated value is : "+ Repeat(arr1));
    }
}
