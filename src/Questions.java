import java.util.*;

public class Questions {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        String reversedWord = reverse(word);
        System.out.println("Reversed word: " + reversedWord);
    }

    public static String reverse(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices towards each other
            left++;
            right--;
        }

        return new String(charArray);
    }
}
