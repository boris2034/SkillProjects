package Module2;

public class Switch {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {
        String str;
        switch (ch){
            case 'h':
                str = "Hello!";
                break;
            case 'i':
            case 'm':
            case 'k':
                str = "I can decode!";
                break;
            case 'b':
                str = "Bye!";
                break;
            default:
               str = "I don't know these symbols :(";
        }
        return str;
    }
}

