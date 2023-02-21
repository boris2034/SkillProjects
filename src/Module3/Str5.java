package Module3;

import java.util.Scanner;

public class Str5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Input correct name");
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }
}
