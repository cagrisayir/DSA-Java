import java.util.HashMap;
import java.util.Map;

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
}
