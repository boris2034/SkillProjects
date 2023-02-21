package Module2.zafachi;

public class Loader {
    public static void main(String[] args) {
        int a = 10;
        while (a > 0) {
            a--;
            if (a == 5) {
                break;
            }
        }
        System.out.println(a);
        int summ = 0;
        for (int i = 0; i < 50; i++) {
            summ += i;
            if (i == 45) {
                continue;
            }
            switch (summ) {
                case 50:
                    System.out.println("50");
                    break;
                case 1180:
                    System.out.println("1180");
                    break;
                case 1225:
                    System.out.println("1225");
                    break;
                default:
                    System.out.println("the result is incorrect");
            }
            if (a == 5 && summ == 1180) {
                System.out.println("the condition is met");
            } else {
                System.out.println("condition not met");
            }
        }
    }
}
