package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char yesNo;

        do {

            Calculator calculator = new Calculator();

            System.out.print("Please Enter the number1: ");
            int inputNumber1 = scanner.nextInt();
            System.out.print("Please Enter the symbol: ");
            char symbol = scanner.next().charAt(0);
            System.out.print("Please Enter the number2: ");
            int inputNumber2 = scanner.nextInt();

            if (symbol == '+') {
                int add = calculator.add(inputNumber1, inputNumber2);
                System.out.println("Result: " + add);
            } else if (symbol == '-') {
                int subtract = calculator.subtract(inputNumber1, inputNumber2);
                System.out.println("Result: " + subtract);
            } else if (symbol == '*') {
                int multiply = calculator.multiply(inputNumber1, inputNumber2);
                System.out.println("Result: " + multiply);
            } else if (symbol == '/') {
                int divide = calculator.divide(inputNumber1, inputNumber2);
                System.out.println("Result: " + divide);
            }

            System.out.println("Type 'exit' to quit, or press any other key to continue.");
            yesNo = scanner.next().charAt(0);

        } while(yesNo == 'y');

        
    }
}
