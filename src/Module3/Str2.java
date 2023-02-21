package Module3;

public class Str2 {
    public static void main(String[] args) {
        String a = "Ivan";
        String b = "Vovan";
        checkUserName(a, b);
    }
    public static void checkUserName(String a,String b) {
        if (a.equals(b) == false) {
            System.out.println("Your name has a length of " + a.length() + " symbols");
        } else if (a.equals(b)) {
            System.out.println("Change name");
            System.out.print(a.length());
        }
    }
}
