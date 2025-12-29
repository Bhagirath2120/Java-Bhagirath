package javaInput;
import java.util.Scanner;
public class inputChar {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //for string
        System.out.print("Enter a String : ");
        String S = sc.nextLine();
        System.out.println("String hello : "+ S);

        // for character
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Character : "+ch);

    }
}
