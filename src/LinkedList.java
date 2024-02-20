import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("No element in List");
        if(first == last) {
            first = last = null;
            size--;
            return;
        }
        var temp = first.next;
        first.next = null;
        first = temp;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("No element in List");
        if(first == last) {
            first = last = null;
            size--;
            return;
        }
        var prev = getPrevious(last);
        last = prev;
        last.next = null;
        size--;
    }

    public boolean contains(int item) {
//        var current = first;
//        while (current != null)
//            if(current.value == item) return true;
//
//        return false;
        return indexOf(item) != -1;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty()) throw new IllegalStateException("Empty list");
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException("Bigger element");
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
