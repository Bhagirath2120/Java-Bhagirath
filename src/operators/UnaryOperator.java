package operators;

public class UnaryOperator {
    public static void main(String[] args) {
         int p = 10;
         int q = 5;

         // post increment

        System.out.println(p++);  // print first, increase later so output is 10
        System.out.println(p);   //  p is increased by 1 so output is 11

        System.out.println(q++);   // print first, increase later so output is 5
        System.out.println(q);    //  q is increased by 1 so output is 6

        // pre increment

         int x = ++p;                  // x = 1 + p; p = 1 + 11 = 12
        int y = ++q;                  // y = 1 + q; y = 1 + 6 = 7
        System.out.println(x);       // output 12, increases first
        System.out.println(y);      // output 7, increases first


        // post decrement
         p = 10;
         q = 5;
         y = 0;
         x = 0 ;

         x = p--; //   assign first  decrease later ;; x = p - 1; x = 10 - 1 = 9
        System.out.println(x); // output 10


        // pre decrement
        y = --q;  //   decrease first
        System.out.println(y);  // output 4


    }
}
