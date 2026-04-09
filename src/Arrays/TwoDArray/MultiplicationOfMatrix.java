package Arrays.TwoDArray;

import java.util.Scanner;

// Question: Multiplication of matrix

public class MultiplicationOfMatrix {

    static void PrintMatrrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Multiply(int[][] a, int r1, int c1, int[][]b2, int r2, int c2) {
       if(c1 != r2){
           System.out.println("Multiplication Not Possible");
           return;
       }

        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < r2; k++) {
                   mul[i][j] += a[i][k] * b2[k][j];
                }
            }
        }
        PrintMatrrix(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first matrix
        System.out.println("Enter the number of rows and columns of the First matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the elements of the First matrix ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // second matrix
        System.out.println("Enter the number of rows and columns of the Second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b2 = new int[r2][c2];
        System.out.println("Enter the elements of the Second matrix ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b2[i][j] = sc.nextInt();
            }
        }

        System.out.println("FIRST MATRIX");
        PrintMatrrix(a);
        System.out.println("SECOND MATRIX");
        PrintMatrrix(b2);
        System.out.println("MULTIPLICATION");
        Multiply(a, r1, c1, b2, r2, c2);

    }
}
