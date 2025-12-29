package javaInput;

public class HierarchyOfOperators {
    public static void main(String[] args) {
        int i = 2,j = 3, l, k;
        double a,b;

        k= i/j * i ; //  calculation start from left to right so output is 0, because we are storing int data
        l= j/i *j;   // output is 3
        a = i/j * i;  //output is 0.0 because any operation between two integer, the only result is integer
        b = j/i *j;  // output 3.0

        System.out.println("k = "+k+ ",l = " +l+ ",a= "+a + ",b= "+b);

    }
}
