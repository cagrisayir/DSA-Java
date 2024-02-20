public class Main {
    public static void main(String[] args) {
        var array = new Array(3);
        array.insert(1);
        array.insert(2);
        array.insert(5);
        array.insert(3);
        array.print();
        array.removeAt(1);
        array.print();
        System.out.println(array.indexOf(1));
    }
}
