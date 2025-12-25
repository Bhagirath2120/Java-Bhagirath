package basics;

public class increment_Decrement {
    public static void main(String[] args) {

        // POST INCREMENT
        int x = 10;
        x++; // x++ ka matlab x=x+1;

        System.out.println(x);  // output 11;


        // something special

        int a = 15;
        System.out.println(a++); // formula ka hisab se 16 ana chahiye lekin ayega 15
                                 // kyoki is condition me compiler pahle print karta hai fir increase karta hai lrts see
        System.out.println(a);   // output is 16

         // same concept in POST decrement
        int y = 5;
        y--; // iska matlab y=y-1;
        System.out.println(y); // output 4;

        int d=7;
        System.out.println(d--); // pahle print fir decrement output 7
        System.out.println(d);   // output 6


        // PRE INCREMENT
          a=10;
          System.out.println(++a); // pahle padhao fir print karo output =11;
        System.out.println(a);    // idhar a ki value badh chuki hai output 11

        int b=20;
        System.out.println(--b); //pahle minus karo fir print karo output 19
        System.out.println(b);   // b minus ho chuka hai output 19
    }
}