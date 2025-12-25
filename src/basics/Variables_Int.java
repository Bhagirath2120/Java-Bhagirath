package basics;

public class Variables_Int {
    public static void main(String[] args) {
        int x=5, y=15;
        System.out.println("current value of x: " +x);
        System.out.println("current value of y: " +y);
        x = x+y;
        System.out.println("the value of x+y :"+x);
        x =x +1;
        System.out.println("the value of x is :"+x);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");



        // something special
        System.out.println("hello"+5); //
        System.out.println("5 "+x);   // " " iske andar kuch bhi likhne par vo data string mana jata hai

        System.out.println("5"+x+y);  // "5"= 5 or x=21 or y=15 output 52115 or string ke baad ke addition ko bhi string mana jata hai
        System.out.println(x+y+"5");  // lekin yha par pahle addition hai fir string hai is liye pahle add hoga fir string aayega

    }
}

