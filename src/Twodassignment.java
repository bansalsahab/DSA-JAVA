import java.util.*;

public class Twodassignment {
    // public static void main(String[] args) {
    // int arr[][] = { { 1, 7, 8 }, { 1, 7, 7 } };
    // int countof7 = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // if (arr[i][j] == 7) {
    // countof7++;
    // }
    // }
    // }
    // System.out.println("count of 7 is " + countof7);
    // }
    // public static void main(String[] args) {
    // int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
    // int sumof2ndarrray = 0;

    // for (int j = 0; j < nums[0].length; j++) {
    // sumof2ndarrray += nums[1][j];
    // }
    // System.out.println("sum is: " + sumof2ndarrray);
    // }
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { { 2, 3, 4 }, { 4, 5, 6 } };
        printmatrix(matrix);

        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[i][j] = matrix[i][j];
            }
        }
        printmatrix(transpose);

    }

    public static void printmatrix(int[][] matrix) {
        System.out.println("the matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
