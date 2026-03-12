package operators;

import OOPs.AccessSpecifier;

public class OutsideOOPsTestPublicAccessSpecifier {

    public static void main(String[] args) {
        AccessSpecifier Obj3 = new AccessSpecifier();
        System.out.println("outside package, called string" + Obj3.str_1);

        child a1 = new child();
        a1.ChildClassFunction();
    }
}


    // class 2nd
     class child extends AccessSpecifier {

        void ChildClassFunction() {
            child obj5 = new child();
            System.out.println("outside package,child class called string" + obj5.str_1);
        }

    }

