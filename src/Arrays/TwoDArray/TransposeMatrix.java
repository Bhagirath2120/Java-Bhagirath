package Arrays.TwoDArray;

import java.util.Scanner;


/// Write a program to display the transpose of  matrix Entered By user
///
public class TransposeMatrix {

    static void PrintMatrix(int[][] Matrix){
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] Matrix,int r, int c){
        int [][] ans = new int [r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = Matrix[j][i];
            }
        }
        return ans;
    }



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns: ");
    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] Matrix = new int[r][c];

    int totalElements = r * c;

    System.out.println("Enter " + totalElements + " elements: ");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            Matrix[i][j] = sc.nextInt();
        }
    }

    System.out.println("Original Matrix");
    PrintMatrix(Matrix);
    System.out.println();
    System.out.println("Transpose Matrix");
    int[][] ans = findTranspose(Matrix,r,c);
    PrintMatrix(ans);



}

}