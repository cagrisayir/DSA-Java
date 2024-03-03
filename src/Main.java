public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        var search = new Search();
        var index = search.linearSearch(numbers, 5);
        System.out.println(index);
    }
}
