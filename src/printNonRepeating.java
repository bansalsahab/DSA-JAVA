import java.util.*;
import java.util.LinkedList;

public class printNonRepeating {
    public static void NonRepeating(String str) {
        int freq[] = new int[26];// a-z

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        NonRepeating(str);
    }
}
