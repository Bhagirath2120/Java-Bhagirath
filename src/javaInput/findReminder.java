package javaInput;

import java.util.Scanner;
public class findReminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int a= sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int b= sc.nextInt();
        if(a>b){
//            double Quetient = a / b;
//            double  Reminder = a - b * Quetient; //option number 1
            double  Reminder = a % b;     //option 2

            System.out.println("Reminder is "+Reminder);
        }else
            System.out.println("Invalid Input");
    }
}
