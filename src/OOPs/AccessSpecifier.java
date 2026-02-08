package OOPs;







// main class
public class AccessSpecifier {
    public String  str_1 = " i am public specifier";
    public static void main(String[] args) {
        AccessSpecifier obj1 = new AccessSpecifier();

        System.out.println("main function class "+obj1.str_1);

        hello objH = new hello();
        objH.samepackage();

    }
}

//   new class
class hello {
    AccessSpecifier obj2 = new AccessSpecifier();
    void samepackage() {
        System.out.println();
       System.out.println("same package class, with in main file "+obj2.str_1);
    }

}
