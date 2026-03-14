package OOPs;

public class example2PassByValue {
    //reverse_array
  public   static void method(int p){
     int q = 0;
      q = p;
       q *= 12;

    }
    public static void main(String[] args) {

        int p = 15;

        method(p);
        System.out.println();
    }
}
