package Module3;

public class Str {
    public static void main(String[] args) {
        String a = "Ivan";
        String b = "Ivan";
        String result = checkUserName(a, b);
        System.out.println(checkUserName(a, b));
    }
    public static String checkUserName(String a,String b) {
        String result = null;
        if (a.equals(b)) {
            result = "Nice name";
        } else if (a.equalsIgnoreCase(b)) {
            result = "Change name";
        }
        return result;
    }
}
