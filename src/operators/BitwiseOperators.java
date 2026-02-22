package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
         int a = 9, b = 10;
        System.out.println( a | b);      // output 11
         System.out.println( a & b);     //output 8
        System.out.println( a ^ b);    //output  3
        // Left shift
        System.out.println( a << 1);    //  output 18   a * b^2 = a<<1 =    a * 1^2
        System.out.println( a << 2);   //  output 36    a * b^2 = a<<2

        // right shift
        System.out.println( b >> 1);    //output 5
        System.out.println( b >> 2);   //output  2
    }
}
