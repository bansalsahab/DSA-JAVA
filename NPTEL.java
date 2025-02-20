import java.util.Scanner;

public class NPTEL {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int i, j, m;
        i = ++a[1];
        j = a[1]++;
        m = a[i++];
        System.out.print(i);
    }
}