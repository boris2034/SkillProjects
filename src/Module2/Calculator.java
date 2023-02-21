package Module2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число. Для подтверждения нажмите Enter");
        int operand1 = scanner.nextInt();

        System.out.println("Введите операцию('+','-','*','/'). Для подтверждения нажмите Enter");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число. Для подтверждения нажмите Enter");
        int operand2 = scanner.nextInt();
        oper(operation, operand1, operand2);
        System.out.println(operand1 + operation + operand2 + " = " + (operation));
    }

    public static int oper(char operation, int operand1, int operand2) {
        int a = 0;
        switch (operation){
            case '*':
                a = operand1 * operand2;
                break;
            case '/':
                a = operand1 / operand2;
                break;
            case '+':
                a = operand1 + operand2;
                break;
            case '-':
                a = operand1 - operand2;
                break;
            default:
                System.out.println("Неверная операция");
        }
        return a;
    }

}