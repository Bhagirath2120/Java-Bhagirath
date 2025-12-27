package basics;

public class simple_interest {
    public static void main(String[] args) {

        double Principal = 1000;
        double Rate = 20;
        double Time = 3;
        double Si = ( Principal * Rate * Time ) / 100;
        System.out.println("Simple Interest is "+Si);
    }
}
