import java.util.Arrays;
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
}
