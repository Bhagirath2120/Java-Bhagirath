package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 5;

        System.out.println("&& operator ");
        System.out.println( (a > b) && (a > c) && (b > c)); // result true; when every condition is true so the result is true
        System.out.println( (a < b) && (a <= c));  // fslse

        System.out.println( "|| (or) operator");
        System.out.println( (a < b) || (a == c) || (b > c)); // result true;  result is true only when one of the condition is true
        System.out.println( (a < b) || (a < c) || (b < c)); //false; every condition is false so false

        System.out.println(" ! (Not) operator");
        System.out.println( !(a<c)); // true; condition is false  so it returns true
        System.out.println( !(a> b)); // false;


    }
}
