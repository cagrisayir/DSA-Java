import java.util.Stack;

public class StackInterview {
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
}
