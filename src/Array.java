
public class Array {
    private int[] items;
    private int currentLength;

    public Array(int length) {
        items = new int[length];
        currentLength = 0;
    }

    public void print() {
        for (var i = 0; i < currentLength; i++) {
            System.out.print(items[i]);
        }
        System.out.println("");
    }
    public void insert(int value) {
        if (currentLength == items.length) {
            int[] newArray = new int[currentLength * 2];
            for(var i = 0; i < items.length; i++) {
                newArray[i] = items[i];
            }
            newArray[items.length] = value;
            items = newArray;
            currentLength++;
        }
        else
            items[currentLength++] = value;
    }

    public void removeAt(int index) {
        // validation
        if (index < 0 || index >= currentLength) throw new IllegalArgumentException("index out of bounds");

        // Shift the items to the left to fill the deleted items spot
        for(var i = index; i < currentLength; i++) {
            items[i] = items[i + 1];
        }
        currentLength--;
    }

    public int indexOf(int item) {
        for(var i = 0; i < currentLength; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
}
