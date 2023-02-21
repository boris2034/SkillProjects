package Module2;


public class Main {
    public static void main(String[] args) {
        int value = 0;
        add(3, 4);
        int result = add(value, 10);
        System.out.println(result);

    }

    public static int add(int x, int y) {

        int result = x + y;
        return result;
    }
}