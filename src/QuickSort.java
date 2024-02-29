public class QuickSort {
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end)
            return;
        // Partition
        int boundary = partition(array, start, end);

        // Sort left
        sort(array, start, boundary - 1);

        // Sort right
        sort(array, boundary + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundry = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                boundry++;
                swap(array, i, boundry);
            }
        }
        return boundry;
    }

    // swap function
    private void swap(int[] array, int i, int j) {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
