package Arrays.TwoDArray;

import java.util.Scanner;

public class SpiralPrint {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralPrt(int[][] Matrix,int r,int c) {
        int topRow = 0 , bottomRow = r-1, leftCol = 0, rightCol = c-1 ;
        int totalEmlement = r*c;

        while(totalEmlement > 0) {

            // top row to --> right column  fix top row
            for (int j = leftCol; j <= rightCol && totalEmlement > 0; j++) {
                System.out.print(Matrix[topRow][j] + " ");
                totalEmlement--;
            }
            topRow++;

            // right column to --> bottom row fix right column
            for (int i = topRow; i <= bottomRow && totalEmlement > 0; i++) {
                System.out.print(Matrix[i][rightCol] + " ");
                totalEmlement--;
            }
            rightCol--;

            // bottom row to --> left column  fix bottom column
            for (int i = rightCol; i >= leftCol && totalEmlement > 0; i--) {
                System.out.print(Matrix[bottomRow][i] + " ");
                totalEmlement--;
            }
            bottomRow--;

            // bottom row to -->  top column fir left column
            for (int i = bottomRow; i >= topRow && totalEmlement > 0; i--) {
                System.out.print(Matrix[i][leftCol] + " ");
                totalEmlement--;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];
        System.out.println("Enter "+r*c+ " elements: ");

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("original Matrix ");
        printMatrix(Matrix);
        System.out.println("spiral Matrix ");
        spiralPrt(Matrix,r,c);
    }
}
