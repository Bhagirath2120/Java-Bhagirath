package Conditionals;
import java.util.Scanner;
//given a point (x,y),WAP to find out if it lies on the x-axis,y-axis or at the origin,viz(0,0).
// (0,0) called origin

public class LiesOnAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter points: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("The points is origin");
        }
        else if(x == 0){
            System.out.println("The point lies on Y-axis");

        }else if(y == 0){
            System.out.println("The point lies on X-axis");
        }else{
            System.out.println("the point is not lies on origin, X-axis and Y-axis ");
        }
    }
}
