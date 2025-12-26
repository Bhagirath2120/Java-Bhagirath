package basics;

public class DoubleDataType {
    public static void main(String[] args) {

        int x =5;
        double y =2;
        System.out.print("x=5,y=2 sum of x+y :");
        System.out.println(x+y); // output 7.0;

        int a=5;
        int b=2;
        System.out.print("the value a/b, a=5 and b=2 :");
        System.out.print(a/b+ " , wrong answer, ");           // output is 2 but this is not right answer, right answer is 2.5
                                                             // prints the integer result only.

        System.out.println("any operation is performed between 2 or more than 2 integers, ");// any operation is performed between 2 or more than 2 integers, the compiler
        System.out.println("the compiler prints the integer result only.");


        // when operation is performed between one integer and one float variable the compiler prints the result in float result
        // lets see

        int X =5;
        double Y =2;   // double data type is used for storing decimal value

        System.out.println("x=5,y=2:");

        System.out.println( X + Y + " <-- sum of an integer and a float value"); // output is 7.0 the sum of an integer and a float value

        System.out.println( X - Y+ " <-- substraction of an integer and a float value");

        System.out.println( X * Y + "<-- multiplication of an integer and a float value");

        System.out.println( X / Y +"<-- division of an integer and  a float value");



    }
}
