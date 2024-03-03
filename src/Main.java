import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        var sort = new CountingSort();
        sort.sort(numbers, 7);
        System.out.println(Arrays.toString(numbers));
    }
}
