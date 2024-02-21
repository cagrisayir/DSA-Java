import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackInterview {
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '}', ']');
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{', '[');

    public String reverseAString(String text) {
        if (text == null) throw new IllegalArgumentException("Can't be null");
        StringBuffer reversedString = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (char ch : text.toCharArray())
            stack.push(ch);

        while (!stack.empty())
            reversedString.append(stack.pop());

        return reversedString.toString();
    }

    public boolean isBalancedString(String text) {
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            
            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean bracketsMatch(char left, char right) {
//        return (right == ')' && left != '(') ||
//                (right == '>' && left != '<') ||
//                (right == '}' && left != '{') ||
//                (right == ']' && left != '[');
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }
}
