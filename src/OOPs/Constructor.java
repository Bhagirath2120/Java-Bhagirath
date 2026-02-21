package OOPs;
import java.util.Scanner;


// new class
class  operation{
    int x,y;

    operation( int a ,int b){
        System.out.println("constructor called");
        x=a;
        y=b;
    }

    // in addition
    int add(){
        int ans = x+y;
        return ans;
    }

    // for substraction
    int sub(){
        int ans = x-y;
        return ans;
    }

    // for multiplication
    int mul(){
       int ans = x*y;
        return ans;
    }

}


// main function class
public class  Constructor {
    public static void main(String[] args) {

        // object 1
         operation a1 = new operation( 6,4);  // object created

        System.out.println(a1.add());    // calling and printing object a1 add  member function
        System.out.println(a1.sub());    // calling and printing object a1 sub  member function
        System.out.println(  a1.mul());  //  calling and printing object a1 mul  member function

        // object 2
        operation b1 = new operation(20,10);   // object created

        System.out.println(b1.add());    // calling and printing object a2 add  member function
        System.out.println(b1.sub());   // calling and printing object a2 sub  member function
        System.out.println(b1.mul());   // calling and printing object a2 mul  member function

        
    }
}
