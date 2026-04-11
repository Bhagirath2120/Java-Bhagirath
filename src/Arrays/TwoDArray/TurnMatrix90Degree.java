package Arrays.TwoDArray;

import java.util.Scanner;

public class TurnMatrix90Degree {

    static void PrintMatrix(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Transpose(int[][] Matrix, int n) {
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }
        }
    }

    static void reverseMethod(int[] arr ) {
        int j = arr.length - 1;

        for(int i = 0; i < j ; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
             j--;
        }

    }
    static void TurnMatrix(int[][] Matrix, int n) {
          Transpose(Matrix, n);
          System.out.println("turn matrix");
          for(int i = 0; i < n; i++) {
             reverseMethod(Matrix[i]);
            }

         PrintMatrix(Matrix);
    }

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take Rows And Columns
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]   Matrix = new int[r][c]; // 2D array Created

        int TotalElement = r*c; // No. of Elements

        int n = c;

        // get input Elements
        System.out.println("Enter " + TotalElement + " elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix");
        PrintMatrix(Matrix);
        System.out.println();
        TurnMatrix(Matrix,n);
    }
}