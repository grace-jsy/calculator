package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the numbers and symbols to be calculated(ex. 3 + 5): ");
        
        int inputNumber1 = scanner.nextInt();
        char symbol = scanner.next().charAt(0);
        int inputNumber2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        int add = calculator.add(inputNumber1, inputNumber2);
        System.out.println("Sum: " + add);

        int subtract = calculator.subtract(inputNumber1, inputNumber2);
        System.out.println("Sum: " + subtract);

        int multiply = calculator.multiply(inputNumber1, inputNumber2);
        System.out.println("Sum: " + multiply);

        int divide = calculator.multiply(inputNumber1, inputNumber2);
        System.out.println("Sum: " + divide);




        
        
        
        
        
        
    }
}
