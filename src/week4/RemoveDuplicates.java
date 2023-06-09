package week4;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDup(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Create a LinkedHashSet to store unique characters while preserving order
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Add each character to the set
        for (char c : charArray) {
            charSet.add(c);
        }

        // Build the resulting string by joining the characters from the set
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));  // Output: ABC
    }
}
