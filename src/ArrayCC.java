import java.util.*;

public class ArrayCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 1; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
            System.out.println();
        }
        System.out.println("max sum =" + maxSum);
    }

    // public static void kadanes(int numbers[]) {
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // cs = cs + numbers[i];
    // if (cs < 0) {
    // cs = 0;
    // }
    // ms = Math.max(cs, ms);
    // }
    // System.out.println("our max subarrayy is " + ms);

    // }

    // public static void maxSubarraySum(int numbers[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = 1; j < numbers.length; j++) {
    // int end = j;
    // currSum = 0;
    // for (int k = start; k <= end; k++) {// print
    // currSum += numbers[k];
    // // subarray
    // }
    // System.out.println(currSum);
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }

    // }
    // System.out.println();
    // }
    // }

    // public static void printPairs(int numbers[]) {
    // int tp = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int curr = numbers[i]; // 2,,4,6,8
    // for (int j = i + 1; j < numbers.length; j++) {
    // System.out.print("(" + curr + "," + numbers[j] + ")");
    // tp++;
    // }
    // System.out.println();

    // }
    // System.out.println(tp);
    // }

    // public static int binary_search(int numbers[], int key) {
    // int start = 0, end = numbers.length - 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;

    // // comparisons
    // if (numbers[mid] == key) {// found
    // return mid;
    // }
    // if (numbers[mid] < key) {// right
    // start = mid + 1;
    // } else {// left
    // end = mid - 1;
    // }

    // }
    // return -1;

    // }

    // public static int getLargest(int numbers[]){
    // int largest = Integer.MIN_VALUE;

    // for (int i=0;i<numbers.length;i++){
    // if(largest<numbers[i]){
    // largest=numbers[i];
    // }
    // }

    // return largest;
    // }
    public void rotate(int[] nums, int k) {
        int temp[]=new int[nums.length];
        for(int i=nums[k];i<nums.length;i++){
            temp[]=nums[]
        }
        
    }

    public static void main(String args[]) {

        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int key = 5;
        // System.out.println("largest value is :"+ getLargest(numbers));
        // System.out.println("index for key is :" + binary_search(numbers, key));
        // printPairs(numbers);
        maxSubarraySum(numbers);
        // kadanes(numbers);

    }
}