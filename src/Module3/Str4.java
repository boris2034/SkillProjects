package Module3;

public class Str4 {
    public class Main {
        public static void main(String[] args) {
            System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        }

        private static String removeWhiteSpaces(String str) {
           return str.replace(" ","");
        }
    }
}
