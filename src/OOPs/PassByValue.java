package OOPs;

public class PassByValue {


    // reverse_array
    void passByValue(int a){
        a *= 10;
        System.out.println("In reverse_array Pass By Value: " + a);
    }


    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changing value "+a);
        PassByValue obj1 = new PassByValue();
        obj1.passByValue(a);
        System.out.println("After changing value "+a);

    }
}
