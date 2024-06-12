package ArrayProgram;

import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}