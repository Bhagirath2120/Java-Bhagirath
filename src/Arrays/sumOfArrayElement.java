package Arrays;

// calculate the sum of all the elements in the given array

public class sumOfArrayElement {

    void SumOfElements(){
        int arr1[] = {4,5,7,1,5};
        int sum = 0;
        for (int i = 0; i <5; i++){
            sum += arr1[i];
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        sumOfArrayElement obj = new sumOfArrayElement();
        obj.SumOfElements();
    }
}
