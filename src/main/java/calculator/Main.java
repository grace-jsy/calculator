package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String exit = "";

        do {

            Calculator calculator = new Calculator();

            System.out.print("Please Enter the number1: ");
            int inputNumber1 = scanner.nextInt();
            if (inputNumber1 < 0) {
                System.out.println("Only positive integers are allowed.");
                continue;
            }
                System.out.print("Please Enter the symbol: ");
                char symbol = scanner.next().charAt(0);

                System.out.print("Please Enter the number2: ");
                int inputNumber2 = scanner.nextInt();
                if (inputNumber2 < 0) {
                    System.out.println("Only positive integers are allowed.");
                    continue;
                }

                int result = 0;


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

                    do {
                        if (inputNumber2 == 0) {
                            System.out.println("It can't be divided by ZERO");
                            System.out.print("Please Enter the number2: ");
                            inputNumber2 = scanner.nextInt();
                        } else if (inputNumber2 != 0) {
                            result = inputNumber1 / inputNumber2;
                            System.out.println("result = " + result);
                            break;
                        }
                    } while (inputNumber2 != 0);

                }


                System.out.println("Type 'exit' to quit, or press any other key to continue.");
                scanner.nextLine();
                exit = scanner.nextLine();

        } while (!exit.equals("exit"));
    }

}


