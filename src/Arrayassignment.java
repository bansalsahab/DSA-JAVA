import java.util.*;

public class Arrayassignment {
    // public static void printSpiral(int matrix[][]) {
    // int startRow = 0;
    // int startCol = 0;
    // int endRow = matrix.length - 1;
    // int endCol = matrix[0].length - 1;
    // while (startRow <= endRow && startCol <= endCol) {
    // // top
    // for (int j = startCol; j <= endCol; j++) {
    // System.out.println(matrix[startRow][j] + " ");
    // }

    // // right
    // for (int i = startRow + 1; i <= endRow; i++) {
    // System.out.println(matrix[i][endCol] + " ");
    // }
    // // bottom
    // for (int j = endRow - 1; j >= startCol; j--) {
    // System.out.println(matrix[endRow][j] + " ");

    // }
    // // left
    // for (int i = endRow - 1; i >= startRow + 1; i--) {
    // System.out.println(matrix[i][startCol] + " ");
    // }
    // startCol++;
    // startRow++;
    // endCol--;
    // endRow--;
    // }
    // System.out.println();
    // }
    // public static int diagonalSum(int matrix[][]) {
    // int sum = 0;
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == matrix.length - 1) {
    // sum += matrix[i][j];
    // }
    // }
    // }

    // // for timecomplexity On
    // for (int i = 0; i < matrix.length; i++) {
    // // pd
    // sum += matrix[i][i];
    // // sd
    // if (i != matrix.length - 1 - i) {
    // sum += matrix[i][matrix.length - i - 1];

    // }

    // }
    // return sum;

    // }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int i = row;
            int j = col;
            if (matrix[row][col] == key) {
                System.out.println("found the key at (" + i + "," + j + ")");
                return true;
            } else if (key < matrix[i][j]) {
                j--;

            } else {
                i++;
            }
        }
        System.out.println("key not found");
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4, },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // printSpiral(matrix);
        // System.out.println(diagonalSum(matrix));
        int key = 14;
        staircaseSearch(matrix, key);
    }
}