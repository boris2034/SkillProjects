package Module5.exercises;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("It", 4, 1999, "King", new String[]{"Hello","2","3"});
        System.out.println(b.getPage(2));
    }
}
