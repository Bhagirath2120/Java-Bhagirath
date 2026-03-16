package Arrays;

import java.util.Scanner;

//findGrt x how many times present in array

//new class
class counter{
  public  void count(int [] arr, int x){
      int ans = 0;

      for(int i = 0; i < arr.length; i++){
          if(arr[i]==x){
              ans++;
          }
      }
      System.out.println("Elements found : "+ans+" times");


    }
}




//main function class
public class CountElementPresentInArray {
    public static void main(String[] args) {

        Operation obj1 = new Operation();

        int [] arr1 = {1,9,9,5,7,6,4,2,7,9,4,21,10,11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        obj1.findGrt(arr1,x);

    }
}
