import java.util.Map;

public class Recursion {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;

        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firsstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firsstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tillingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fm1 = tillingProblem(n - 1);
        // horizontal choice
        int fm2 = tillingProblem(n - 2);
        int totways = fm1 + fm2;
        return totways;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duploicate
            removeDuplicate(str, idx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    // Q- Given n friends, each one can remain single or can be paired up with some
    // other
    // friend. Each friend can be paired only once. Find out the total number of
    // ways in
    // which friends can remain single or can be paired up.
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fnm1 = friendsPairing(n - 1);
        // pairing
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totalways
        int totalways = fnm1 + pairWays;
        return totalways;
    }

    // Q-Binary Strings Problem
    // Print all binary strings of size N without consecutive ones.
    public static void printBinStrings(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        printBinStrings(3, 0, "");

        // System.out.println(friendsPairing(3 ));
        // String str = "appnacccccccccccccollege";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(tillingProblem(7));
        // int arr[] = { 1, 2, 3, 4, 5, 5, 6 };
        // System.out.println(optimizedPower(2, 10));
        // System.out.println(power(2, 5));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(firsstOccurence(arr, 5, 0));
        // System.out.println(isSorted(arr, 0));
    }

}
