package Module2.zafachi;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter body weight");
        int mass = scanner.nextInt();

        System.out.println("Enter Height");
        int height = scanner.nextInt();
        int p = 0;
    }

    public static int imt(int mass, int height) {
        int imt = 0;
        imt = mass / (height * height);
        return imt;
    }

    public static String diagnosis(int index){
        String str;
        if (index < 50) {
            str = "Skinny";
        } else if (index > 50) {
            str = "Fat";
        } else
            str = "Normal";

        return str;
    }
}
