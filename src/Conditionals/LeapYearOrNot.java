package Conditionals;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.print("Enter Year: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0  && n%400==0){
            System.out.print("Yes, This year is a Leap year");
        }

        else {
            System.out.print("No, This year is not a Leap year");
        }
    }
}
