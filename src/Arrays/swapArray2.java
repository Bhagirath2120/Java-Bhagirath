package Arrays;

public class swapArray2 {

    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swapFunction(int arr[],int i,int j){

        //swap calculation 1
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
        //swap calculation 2
//
//         arr[i] =  arr[i] + arr[j];
//         arr[j] =  arr[i] - arr[j];
//         arr[i] =  arr[i] - arr[j];


        //swap calculation 3
          arr[i]= arr[i]+arr[j] - ( arr[j] = arr[i] );

    }

    // while loop
//    static void swap(int arr[]){
//         int i = 0, j = arr.length - 1;
//          while(i < j){
//              swapFunction(arr,i,j);
//              i++;
//              j--;
//          }
//        System.out.println("Swapped array ");
//    }


    // for loop
    static void swap(int arr[]){

        int j = arr.length-1;
        for(int i = 0; i < j; i++){
             swapFunction(arr,i,j);
             j--;
        }
        System.out.println("Swapped array ");
    }



    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        System.out.println("Original Array: ");
        printArray(arr1); // printing array

        swap(arr1); // swap method
        printArray(arr1); // printing array

    }
}
