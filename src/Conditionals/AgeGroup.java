package Conditionals;
import java.util.Scanner;

// age group

public class AgeGroup {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);    // Scanner
        System.out.println("Hello my name is Bhagirath Rai");
        System.out.print("How are old you :  ");
        int age = sc.nextInt();  // input


        if(age < 18 && age >12){
            System.out.println("Teenager.");

        }
        else if(age <= 12){
            System.out.println("Child");
        }
        else{
            System.out.println("Adult");
        }
    }



}

