package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char yesNo;

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
                result = inputNum1 / inputNum2;
                System.out.println("result = " + result);
            }

            System.out.println("Would you like to calculate again?(y/n) ");
            yesNo = scanner.next().charAt(0);

        } while (yesNo == 'y');









    }
}
