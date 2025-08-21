import java.util.Arrays;
import java.util.Scanner;

public class Lab1_4_matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[][] matrix = new int[3][3];
        System.out.println("\nEnter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("\nOriginal Matrix:");
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}