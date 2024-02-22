import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    // A green apple
    // g is the first char
    public static char firstNonRepeatingChar(String text) {
        var charArray = text.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : charArray) {
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }
        for (char ch : charArray) {
            if (map.get(ch) == 1) return ch;
        }
        return Character.MIN_VALUE;
    }
    
    public static char firstRepeatingChar(String text) {
        var charArray = text.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : charArray) {
            if (set.contains(ch)) return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
