package Module3;

public class Main {
    public static void main(String[] args) {
        String name = "Peter";
        int age = 33;
        String profession = "Driver";

        String formatstring = String.format("Hello, my name is %s age - %d, my profession - %s", name, age, profession);
        System.out.println(formatstring);
    }
}
