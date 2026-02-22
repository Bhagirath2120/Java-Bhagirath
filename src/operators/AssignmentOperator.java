package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int p = 10;
        int q;

         q = p; // q = 10;
        System.out.println(q); //output 10

        p += q;   // p = p + q; p = 10 + 10 = 20
        System.out.println(p); //output 20

         p -= q;  // p = p + q;  p = 20 - 10 = 10
        System.out.println(p); //output 10

         p *= q; // p = p * q; p = 10 * 10 = 100
        System.out.println(p); //output 100

        p /= q; // p = p/q; p = p/q = 10
        System.out.println(p); //output 10
    }
}
