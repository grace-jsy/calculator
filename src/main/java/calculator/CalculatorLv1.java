package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String exit = "";

        do {
            System.out.print("Please Enter the number1: ");
            int inputNum1 = scanner.nextInt();
            System.out.print("Please Enter the symbol: ");
            char symbol = scanner.next().charAt(0);
            System.out.print("Please Enter the number2: ");
            int inputNum2 = scanner.nextInt();

            int result;

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
                    System.out.println("Please Enter the number2: ");
                    inputNum2 = scanner.nextInt();
                    if (inputNum2 == 0) {
                        System.out.println("You can't be divided by ZERO");
                    } else if (inputNum2 != 0) {
                        result = inputNum1 / inputNum2;
                    }
                } while (inputNum2 != 0);

            } else {
                System.out.println("result = " + result);
                System.out.println("Enter 'exit' to quit. Otherwise, it will continue.");
                exit = scanner.next();
            }



    } while (!exit.equals("exit"));

}
