package Conditionals;
import java.util.Scanner;

// take three points input and determine the points lie on a single line  or not

public class StraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X1,Y1 : ");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.print("Enter X2,Y2 : ");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        System.out.print("Enter X3,Y3 : ");
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();

        double M1 = (y2 - y1) / (x2 - x1);
        double M2 = (y3 - y2) / (x3 - x2);

        if(M1 == M2) {
            System.out.println("The three points lie on a single line");
        }
        else {
            System.out.println("They do not lie on a single line");
        }

    }
}
