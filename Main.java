public class Main {
    public static void main(String[] args) {
        Textbook tb1 = new Textbook("Java Programming", 450.0, 3);
        Textbook tb2 = new Textbook("Java Programming", 420.0, 2);
        Textbook tb3 = new Textbook("Python Programming", 430.0, 2);

        System.out.println(tb1.getBookInfo()); // Java Programming-450.0-Edition 3
        System.out.println(tb2.getBookInfo()); // Java Programming-420.0-Edition 2

        System.out.println(tb1.canSubstituteFor(tb2)); // true
        System.out.println(tb2.canSubstituteFor(tb1)); // false
        System.out.println(tb1.canSubstituteFor(tb3)); // false
    }
}
