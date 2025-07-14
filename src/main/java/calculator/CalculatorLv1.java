package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exit = "";

        do {
            System.out.print("Please Enter the number1: ");
            int inputNum1 = scanner.nextInt();

            if (inputNum1 < 0) {
                System.out.println("0이상만써");
                continue;
            }

            System.out.print("Please Enter the symbol(+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            System.out.print("Please Enter the number2: ");
            int inputNum2 = scanner.nextInt();

            if (inputNum2 < 0) {
                System.out.println("0이상만써");
                continue;
            }

            int result = 0;

            if (symbol == '+') {
                result = inputNum1 + inputNum2;
                System.out.println("result: " + result);
            } else if (symbol == '-') {
                result = inputNum1 - inputNum2;
                System.out.println("result = " + result);
            } else if (symbol == '*') {
                result = inputNum1 * inputNum2;
                System.out.println("result = " + result);
            } else if (symbol == '/') {
                do {
                    if (inputNum2 == 0) {
                        System.out.println("It can't be divided by ZERO");
                        System.out.print("Please Enter the number2: ");
                        inputNum2 = scanner.nextInt();
                    } else if (inputNum2 != 0) {
                        result = inputNum1 / inputNum2;
                        System.out.println("result = " + result);
                        break;
                    }
                } while (inputNum2 != 0);

            }

            System.out.println("Enter 'exit' to quit. Otherwise, it will continue.");
            exit = scanner.next();

        } while (!exit.equals("exit")) ;

    }
}
