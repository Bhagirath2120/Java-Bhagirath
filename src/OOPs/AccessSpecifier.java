package OOPs;

// main class
public class AccessSpecifier {

    public String  str_1 = " i am a public member string";

    public static void main(String[] args) {

         AccessSpecifier obj1 = new AccessSpecifier();

        System.out.println("main function class called string "+obj1.str_1);

        hello obj2 = new hello();
        obj2.secondclass();

    }
}

//   new class
class hello {
    AccessSpecifier obj2 = new AccessSpecifier();


    void secondclass() {
        System.out.println();
       System.out.println("same package 2nd class called string "+obj2.str_1);
    }


}
