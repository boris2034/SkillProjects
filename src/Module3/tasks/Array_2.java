package Module3.tasks;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name = scanner.nextLine();
        System.out.println("Create a password:");
        String password = scanner.nextLine();
        if (password.length() > 8 || password.length() < 15) {
            do {
                System.out.println("The password must be between 8 and 15 characters long");
                password = scanner.nextLine();
            } while (password.length() < 8 || password.length() > 15);
        }
        System.out.printf("%s, Your new password: %s", name, password);
    }
}
