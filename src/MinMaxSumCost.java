import java.util.Arrays;

public class MinMaxSumCost {
    public static int minMaxSumCost(int[] arr) {
        Arrays.sort(arr);
        int cost = 0;

        while (arr.length > 1) {
            int minElement = arr[0];
            int maxElement = arr[arr.length - 1];

            int sumElements = minElement + maxElement;
            cost += Math.ceil((double) sumElements / (maxElement - minElement + 1));

            // Create a new array with one less element
            int[] newArr = new int[arr.length - 1];

            // Copy elements from the original array except the first and last ones
            System.arraycopy(arr, 1, newArr, 0, arr.length - 2);

            // Assign the sum of min and max elements at the end of the new array
            newArr[newArr.length - 1] = sumElements;

            // Update the original array reference
            arr = newArr;

            Arrays.sort(arr);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 9, 6 };
        System.out.println(minMaxSumCost(arr)); // Output: 10
    }
}