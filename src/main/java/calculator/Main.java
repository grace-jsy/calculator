package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the number1: ");
        int inputNumber1 = scanner.nextInt();
        System.out.print("Please Enter the symbol: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Please Enter the number2: ");
        int inputNumber2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        int add = calculator.add(inputNumber1, inputNumber2);
        System.out.println("Result: " + add);

        int subtract = calculator.subtract(inputNumber1, inputNumber2);
        System.out.println("Result: " + subtract);

        int multiply = calculator.multiply(inputNumber1, inputNumber2);
        System.out.println("Result: " + multiply);

        int divide = calculator.divide(inputNumber1, inputNumber2);
        System.out.println("Result: " + divide);




        
        
        
        
        
        
    }
}
