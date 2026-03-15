package Arrays;
// calculate the maximum value out of all the elements in the array
public class FindMaxElement {

    void maxElement(int arr2[]){

         int max = 0;
         int index = 0;
         for(int i = 0; i < arr2.length; i++){
             if(arr2[i]>max){
                 max=arr2[i];
                 index=i;
             }
         }
        System.out.println("Maximum element is: "+max); // 25
         System.out.println("Maximum element at index no. : "+index);

    }

    public static void main(String[] args) {
            FindMaxElement obj = new FindMaxElement();
        int arr[] = {5,140,25,15,20,};

            obj.maxElement(arr);

    }
}
