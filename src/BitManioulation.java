import java.util.*;

public class BitManioulation {
    public static void oddOrEven(int n) {
        int BitMask = 1;
        if ((n & BitMask) == 0) {
            System.out.println("EN");
        } else {
            System.out.println("ON");
        }
    }

    public static int setIthBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;

    }

    public static int clearIthBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;

            }
            a = a * a;
            n = n >> 1;

        }

        return ans;
    }

    public static void main(String args[]) {
        // iupper case to lower case
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }

    }

}
