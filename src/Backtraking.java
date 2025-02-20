import java.util.Scanner;

public class Backtraking {

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;// backtracking
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubsets(str, ans, i + 1);

    }

    public static void findPermutation(String str, String ans) {
        // basse case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"=>"ab"+"de"=abde
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(NewStr, ans + curr);
        }
    }

    public static int gridways(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;

        } else if (i == n || j == n) {// boundary
            return 0;
        }
        int w1 = gridways(i + 1, j, n, m);
        int w2 = gridways(i, j + 1, n, m);
        return w1 + w2;
    }

    public static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void possibleWords(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;

        }
        String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length(); i++) {
            possibleWords(s.substring(1), ans + key.charAt(i));
        }

    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        possibleWords(s, "");

        // int n = 3, m = 3;
        // System.out.println(gridways(0, 0, n, m));
        // String str = "abc";
        // findPermutation(str, "");
        // findSubsets(str, "", 0);
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
    }

}
