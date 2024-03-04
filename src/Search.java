public class Search {
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;

        return -1;
    }

    public int binarySearchRecursive(int[] array, int target) {
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    private int binarySearchRecursive(int[] array, int target, int left, int right) {
        // base condition
        if (right < left)
            return -1;

        int mid = (left + right) / 2;
        if (array[mid] == target)
            return mid;

        if (target < array[mid])
            return binarySearchRecursive(array, target, left, mid - 1);

        return binarySearchRecursive(array, target, mid + 1, right);
    }

    public int binarySearch(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target)
                return mid;
            if (target < array[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public int ternarySearch(int[] array, int target) {
        return ternarySearch(array, target, 0, array.length - 1);
    }

    private int ternarySearch(int[] array, int target, int left, int right) {
        // base condition
        if (left > right)
            return -1;

        var partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target)
            return mid1;
        if (array[mid2] == target)
            return mid2;

        if (target < array[mid1])
            return ternarySearch(array, target, left, mid1 - 1);
        if (target > array[mid2])
            return ternarySearch(array, target, mid2 + 1, right);

        return ternarySearch(array, target, mid1 + 1, mid2 - 1);
    }
}