package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exit = "";

        do {
            try {
                System.out.print("Please Enter the Number1: ");
                int inputNum1 = scanner.nextInt();

                if (inputNum1 < 0) {
                    System.out.println("Only positive integers are allowed."); // 음수면 경고 출력
                    continue; // 아래 코드 실행하지 않고 다시 반복문 처음으로
                }

                System.out.print("Please Enter the symbol(+, -, *, /): ");
                char symbol = scanner.next().charAt(0);

                System.out.print("Please Enter the Number2: ");
                int inputNum2 = scanner.nextInt();

                while (inputNum2 < 0) {
                    System.out.println("Only positive integers are allowed.");
                    System.out.print("Please Enter the Number2: ");
                    inputNum2 = scanner.nextInt();
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
                            System.out.print("Please Enter the Number2: ");
                            inputNum2 = scanner.nextInt();
                        } else if (inputNum2 != 0) {
                            result = inputNum1 / inputNum2;
                            System.out.println("result = " + result);
                            break;
                        }
                    } while (inputNum2 != 0);

                }

                System.out.println("Type 'exit' to quit, or Press any other key to continue.");
                exit = scanner.next();
            } catch (Exception exception) {
                System.out.println("입력이 잘못 되었습니다. 처음부터 다시 시도하세요");
                System.out.println(exception.getMessage());
                scanner.nextLine();
            }

        } while (!exit.equals("exit")) ;
                

    }
}
