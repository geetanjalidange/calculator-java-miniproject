import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator App!");

        while (true) {
            System.out.println("Enter the operation (+, -, *, /) or 'q' to quit:");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Exiting Calculator App. Goodbye!");
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }

            System.out.println("Result: " + result);
            scanner.nextLine(); // Consume newline left-over
        }

        scanner.close();
    }
}
