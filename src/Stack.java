import java.util.Arrays;

// implement stack with array
public class Stack {
    private int count;
    private int[] items = new int[5];

    public Stack() {
        count = 0;
    }

    public void push(int value) {
        if (count == items.length)
            throw new StackOverflowError("Stack is full");
        items[count] = value;
        count++;
    }

    public int pop() {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        count--;
        return items[count];
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
