package OOPs;

public class examplePassByValue {
     static void decrease(int num1 , int num2){
         num1--;
         num2 = num2 - 2;
         System.out.println(num1+"  " +num2);

         //decrease num1 num2
    }

    public static void main(String[] args) {

         int a =11;
         int b= 15 ;
        System.out.println(" before passing value "+a+"  "+b);
         decrease(a,b);


    }



}
