package ArrayProgram;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of the square matrix (less than 5): ");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        System.out.println("Input elements in the first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int[][] matrix2 = new int[size][size];
        System.out.println("Input elements in the second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The First matrix is : ");
        displayMatrix(matrix1);

        // Display the second matrix
        System.out.println("The Second matrix is : ");
        displayMatrix(matrix2);

        // Add the matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result matrix
        System.out.println("The Addition of two matrices is : ");
        displayMatrix(resultMatrix);

        scanner.close();
    }
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] resultMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}