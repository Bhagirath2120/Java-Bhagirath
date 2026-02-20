package Conditionals;

import java.util.Scanner;


//given the coordinate(x,y) of a center of a circle and its radius, WAP which will
// determine whether a point lies inside the circle, on the circle or outside the circle

public class CircleFindPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // for circle
        System.out.print("Enter center coordinate(x,y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
         System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        // point
        System.out.print("Point point coordinate (x1,y1): ");
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();

        //for condition check
        double OA = (X1 -x) * (X1 -x) + ( Y1 -y) * ( Y1 -y);
        double R2 = radius * radius;


        if (OA < R2) {
            System.out.println("inside the circle");
        }
        else if (OA == R2) {
            System.out.println("on the circle");
        }
        else {
            System.out.println("out side the circle");
        }




    }


}
