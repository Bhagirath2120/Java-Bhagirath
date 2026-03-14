package Arrays;

public class StringArray {
    public static void main(String[] args) {
        String [] arr1 = new String [5];
        arr1[0] = "Ram";
        arr1[1] = "Sita";
        arr1[2] = "Geeta";
        arr1[3] = "meena";
        arr1[4] = "pinki";

        //  print name collection
        System.out.println("Name collection");
        System.out.println("collection of name in array index No. 0 "+arr1[0]);
        System.out.println("collection of name in array index No. 1 "+arr1[1]);
        System.out.println("collection of name in array index No. 2 "+arr1[2]);
        System.out.println("collection of name in array index No. 3 "+arr1[3]);
        System.out.println("collection of name in array index No. 4 "+arr1[4]);
        System.out.println();


        // reverse array
        System.out.println("reverse array names");
        for(int j = 4; j >=0; j--) {
            System.out.println("arr1 index "+ j + "  : "+arr1[j]);
        }


    }
}
