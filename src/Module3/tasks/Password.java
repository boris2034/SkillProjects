package Module3.tasks;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name = sc.nextLine();
        System.out.println("Create a password:");
        String PW = sc.nextLine();
        if (PW.length() < 8 || PW.length() > 15) {
            do {
                System.out.println("The password must be between 8 and 15 characters long");
                PW = sc.nextLine();
            } while (PW.length() < 8 || PW.length() > 15);
        }
        System.out.printf("%s, Your new password: %s", name, PW);
    }
}
