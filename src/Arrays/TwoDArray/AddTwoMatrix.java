package Arrays.TwoDArray;

import java.util.Scanner;

public class AddTwoMatrix {

    static void printMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] a1, int r1, int c1, int[][] b2, int r2, int c2) {
        if(r1 != r2 || c1 != c2) {
            System.out.println("Wrong input, addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for(int i = 0; i < a1.length; i++) {
            for(int j = 0; j < a1[i].length; j++) {
                sum[i][j] = a1[i][j] + b2[i][j];
            }
        }
        printMatrix(sum);

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the First matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a1 = new int[r1][c1];
        System.out.println("Enter the Elements of the First matrix: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of the second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] a2 = new int[r1][c1];
        System.out.println("Enter the Elements of the second matrix: ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        addMatrix(a1, r1, c1, a2, r2, c2);


    }
}
