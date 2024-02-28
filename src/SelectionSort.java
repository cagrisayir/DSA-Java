public class SelectionSort {
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++) {
            var minIndex = findMinIndex(array, i);
            swap(array, minIndex, i);
        }
    }


    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private int findMinIndex(int[] array, int startIndex) {
        var minIndex = startIndex;
        for (var innerIndex = startIndex + 1; innerIndex < array.length; innerIndex++) {
            if (array[innerIndex] < array[minIndex]) {
                minIndex = innerIndex;
            }
        }
        return minIndex;
    }
}
