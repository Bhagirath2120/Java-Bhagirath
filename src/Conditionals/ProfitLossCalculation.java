package Conditionals;
import java.util.Scanner;

public class ProfitLossCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();


        if(costPrice < sellingPrice){
             double profit =  sellingPrice - costPrice;
            System.out.println("Seller has made Profit");
             System.out.println("The profit is " + profit);
        }
        else if(costPrice > sellingPrice){
            double Loss  =  costPrice - sellingPrice;
            System.out.println("The seller has incurred a Loss");
            System.out.println("The loss is " + Loss);
        }
        else {
            System.out.println("The seller has neither made a loss nor a profit");
        }
    }
}
