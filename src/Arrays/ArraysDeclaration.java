package Arrays;

public class ArraysDeclaration {

 public static void reverse_array(int arr3[]){
     System.out.println("methode array");
        for(int j = 4; j >=0; j--) {
            System.out.println("arr2 index "+ j + "  : "+arr3[j]);
        }
     System.out.println();
    }

    public static void main(String[] args) {

        // declaration of array
         int  arr[] = new int[5]; // array is also declared as, int[] arrayName = new int[];

        // assign value
         arr[0] = 20;
         arr[1] = 24;
         arr[2] = 28;
         arr[3] = 32;
         arr[4] = 32;

        System.out.println(" array 1");
        System.out.println("Original Array index 0: "+arr[0]);
        System.out.println("Original Array index 1: "+arr[1]);
        System.out.println("Original Array index 2: "+arr[2]);
        System.out.println("Original Array index 3: "+arr[3]);
        System.out.println("Original Array index 4: "+arr[4]);
        System.out.println();


       // int arr2[] = new int[5];
        int arr2[] = {31,32,33,34,35 };
        reverse_array(arr2); // call reverse array method


        // main function arr2
        System.out.println("main function arr2 ");

         for(int i = 0; i <5; i++){
             System.out.println("arr2 index "+i+ "  : "+arr2[i]);
        }
        System.out.println();



    }
}
