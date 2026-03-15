package Arrays;

import java.util.Scanner;
// search the given element x in the array. if present then return index number else return -1
//Linear search
public class SearchGivenValueInArray {

     void passValue(int arr2[], int n){

         int ans =-1;
        for(int i = 0; i < arr2.length; i++ ){
            if (arr2[i] == n){
              ans = i;
              break; //
            }
        }
        if(ans==-1){
            System.out.println("Not Found: "+ans);
        }else
         System.out.println("Found at index number: "+ans);
    }


    public static void main(String[] args) {

        SearchGivenValueInArray obj = new SearchGivenValueInArray();
        Scanner sc = new Scanner(System.in);
        int arr[] = {14,25,18,34,12,38,34};
        System.out.print("Enter value: ");
        int x = sc.nextInt();

        obj.passValue(arr,x);

    }
}
