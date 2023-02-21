package Module2;

public class Cookie {
    public static void main(String[] args) {
        noRetutn();
        System.out.println(sum(1,2, "name"));
    }

    private static void noRetutn() {
        System.out.println("No return");
    }

    private static int sum(int a, int b, String name) {
        return a + b;
    }
}
