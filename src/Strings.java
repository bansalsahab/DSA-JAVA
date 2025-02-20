import java.util.*;

public class Strings {
    public static float getShortestParth(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;

    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());

            }
        }
        return sb.toString();

    }

    public static void main(String args[]) {
        String str1 = "earth";
        String str2 = "heart";
        // Convert Strings to lowercase. Why? so thatwe don't have to checkseparately
        // for lower & uppercase
        if (str1.length() == str2.length()) {
            // convert strings arraay into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str1.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are sameor identical then the strings
            // are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + "and" + str2 + "are anagram");

            } else {
                System.out.println(str1 + "and" + str2 + "are not anagram");
            }

        } else {
            // case when length are not equal
            System.out.println(str1 + str2 + "not anagram");

        }

        // String str = new Scanner(System.in).next();
        // int count = 0;
        // for (int j = 0; j < str.length(); j++) {

        // char ch = str.charAt(j);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        // count++;

        // }

        // }
        // System.out.println("count of vowles:" + count);

        // System.out.println(compress(str));
        // System.out.println(toUpperCase(str));
        // String path = "NN";
        // String str = "Hello";
        // System.out.println(getShortestParth(path));
        // System.out.println(str.substring(0, 5));
        // System.out.println(substring(str, 0, 5));

    }
    // public static void main(String args[]){
    // StringBuilder sb=new StringBuilder("");
    // for(char ch='a';ch<='z';ch++){
    // sb.append(ch);
    // }
    // System.out.println(sb);
    // }
}
