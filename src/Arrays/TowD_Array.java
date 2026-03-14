package Arrays;

public class TowD_Array {
    public static void main(String[] args) {
      //  int [][] arr1 = new int[5][3];
       int arr1[][] = { {10,20,30},{40,50,60},{70,80,90},{100,120,130},{140,150,160} };

        System.out.println("without using loop print 2D array");
        System.out.println("array index [0][0] "+arr1[0][0]);
        System.out.println("array index [0][1] "+arr1[0][1]);
        System.out.println("array index [0][2] "+arr1[0][2]);
        System.out.println();

        System.out.println("array index [1][0] "+arr1[1][0]);
        System.out.println("array index [1][1] "+arr1[1][1]);
        System.out.println("array index [1][2] "+arr1[1][2]);
        System.out.println();

        System.out.println("array index [2][0] "+arr1[2][0]);
        System.out.println("array index [2][1] "+arr1[2][1]);
        System.out.println("array index [2][2] "+arr1[2][2]);
        System.out.println();

        System.out.println("array index [3][0] "+arr1[3][0]);
        System.out.println("array index [3][1] "+arr1[3][1]);
        System.out.println("array index [3][2] "+arr1[3][2]);
        System.out.println();

        System.out.println("array index [4][0] "+arr1[4][0]);
        System.out.println("array index [4][1] "+arr1[4][1]);
        System.out.println("array index [4][2] "+arr1[4][2]);
        System.out.println();
        System.out.println();


        // using loop print 2D array
        System.out.println("using loop print 2D array");
        for(int i = 0; i <=4; i++){
            for(int j = 0; j <=2; j++){
                System.out.println("2D array index ["+i+"]["+j+"] "+arr1[i][j]);

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        // using loop print reverse 2D-array
        System.out.println("using loop print reverse 2D-array");
        // loop start
        for( int i = 4; i >= 0; i--){
            for(int j = 2; j >= 0; j--){
                System.out.println("array index [" +i+"]["+j+"]"+arr1[i][j]);
            }
            System.out.println();
        }


    }
}
