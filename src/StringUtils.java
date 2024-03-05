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


}
