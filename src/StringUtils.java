import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (var ch : str.toLowerCase().toCharArray())
            if (vowels.contains(ch))
                count++;
        return count;
    }

    public static String reverse(String str) {
        if (str == null) return "";
        StringBuilder reversed = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i)); // O(1)

        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null) return "";
        String[] words = sentence.trim().split(" ");
//        StringBuilder reversedSentence = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversedSentence.append(words[i] + " ");
//        }
//        return reversedSentence.toString().trim();
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static boolean areRotation(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;
        if (str2.length() != str1.length())
            return false;

        if (!(str1 + str1).contains(str2))
            return false;

        return true;
    }

    public static String removeDuplicates(String str) {
        if (str == null) return "";
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static char getMaxOccuringChar(String str) {
//        Map<Character, Integer> freq = new HashMap<>();
//        for (var ch : str.toCharArray()) {
//            if (freq.containsKey(ch))
//                freq.replace(ch, freq.get(ch) + 1);
//            else
//                freq.put(ch, 1);
//        }
        if (str.isEmpty() || str == null)
            throw new IllegalArgumentException("There is no string");
        final int ASCII_SIZE = 256;
        int[] freq = new int[ASCII_SIZE];
        for (var ch : str.toCharArray())
            freq[ch]++;

        int max = 0;
        char result = ' ';
        for (var i = 0; i < freq.length; i++)
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        return result;
    }

    public static String capitalize(String sentence) {
        if (sentence.trim().isEmpty() || sentence == null)
            return "";
        String[] words = sentence
                .trim() // remove before and after whitespaces
                .replaceAll(" +", " ") // remove extra whitespaces
                .split(" "); // split
        for (var i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    public static boolean areAnagrams(String first, String second) {
        if (first == null
                || second == null
                || first.length() != second.length()) // for millions of length
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array2, array1);
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
//        var input = new StringBuilder(str);
//        input.reverse();
//        return input.toString().equals(str);

        // better solution
        int left = 0, right = str.length() - 1;
        while (left < right)
            if (str.charAt(left++) != str.charAt(right--))
                return false;

        return true;
    }
}
