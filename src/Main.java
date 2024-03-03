public class Main {
    public static void main(String[] args) {
//        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        int[] numbers = {1, 2, 3, 3, 4, 6, 7};
        var search = new Search();
        var index = search.binarySearch(numbers, 15);
        System.out.println(index);
    }
}
