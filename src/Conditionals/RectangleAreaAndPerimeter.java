package Conditionals;
import java.util.Scanner;

public class RectangleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double Length = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double Breadth = sc.nextDouble();

         double Area = Length * Breadth;
         double Perimeter = 2 * ( Length + Breadth );

         if (Area > Perimeter){

             System.out.println("Area is greater than Perimeter");
             System.out.println("Area is " + Area);
             System.out.println("Perimeter is " + Perimeter);

         }else if (Area < Perimeter){

             System.out.println("Area is less than Perimeter");
             System.out.println("Area is " + Area);
             System.out.println("Perimeter is " + Perimeter);
         }
    }
}
