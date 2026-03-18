package Arrays;

public class swapTwoInteger {

    static void swap(int a,int b){ // using external variable

        System.out.println("swap values using external variable");
        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }


    static void swapTwoInteger(int a,int b){ // without using external variable
        System.out.println("swap values without using external variable");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);

    }




    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("original values a = "+a+" b = "+b);
        swap(a,b); // using external variable
        swapTwoInteger(a,b);  // without using external variable

    }
}
