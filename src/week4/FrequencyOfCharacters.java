package week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static String frequencyOfChars(String str) {
        // Create a map to store the character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // If the character is already present in the map, increment its frequency
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }
            // If the character is not present in the map, add it with a frequency of 1
            else {
                frequencyMap.put(c, 1);
            }
        }

        // Build the resulting string by appending each character and its frequency
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));  // Output: A3B2C1D2
    }
}
