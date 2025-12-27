package javaInput;
import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        double R,Area;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius :");
        R = sc.nextInt();
        Area =3.14*R*R;
        System.out.println("Area of circle is "+Area);

    }
}
