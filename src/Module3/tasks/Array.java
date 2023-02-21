package Module3.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name = scanner.nextLine();
        System.out.println("Come up with a password");
        String password = scanner.nextLine();
        if (password.length() < 8 || password.length() > 15) {
            do {
                System.out.println("Enter the correct password");
                password = scanner.nextLine();
            } while (password.length() < 8 || password.length() > 15);
        }
        System.out.printf("%s, your password: %s", name, password);
    }
}
