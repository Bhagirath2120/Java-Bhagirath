package Loops;

public class breakKeyword {
    public static void main(String[] args) {

        int num = 1;

        int count =0;
        while(true){
            if((num%5 == 0) && (num%7 == 0)){
                System.out.println("Found answer "+num);
                break;           // when answer  is found and at the time loop breaks
            }
            num++;
            count++;
        }
    }
}
