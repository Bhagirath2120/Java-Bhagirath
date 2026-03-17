package Arrays;
import java.util.Scanner;

//question:- Count the number triplets whose sum is equal to the given value

class Methods {
    int FindPairs(int arr2[], int Target){
        int ans = 0;
        int length = arr2.length;
        for(int i = 0; i < length; i++){   // finding first number
            for(int j = i + 1; j < length; j++){  // finding first number
                for(int k = j + 1; k < length; k++){  // find 3rd number
                    if(arr2[i] + arr2[j] + arr2[k] == Target){
                        ans++;
                    }

                }
            }
        }
        return ans;
    }
}


public class ThreeElementsSumEqualToTarget {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods obj1 = new Methods();

        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        int arr1[] = new int[length];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int pairs =  obj1.FindPairs(arr1,target );

        System.out.println("The pairs in the array is : "+pairs);
    }
}
