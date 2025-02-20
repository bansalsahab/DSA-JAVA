import java.util.*;

public class Calculator {
    private double result;

    // Constructor
    public Calculator() {
        this.result = 0.0;
    }

    // Addition
    public void add(double number) {
        result += number;
    }

    // Subtraction
    public void subtract(double number) {
        result -= number;
    }

    // Multiplication
    public void multiply(double number) {
        result *= number;
    }

    // Division
    public void divide(double number) {
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    // Get the current result
    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Simple Calculator");
        System.out.println("==================");

        while (true) {
            System.out.println("Current Result: " + calculator.getResult());
            System.out.println("Options:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Clear");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add: ");
                    double addValue = scanner.nextDouble();
                    calculator.add(addValue);
                    break;
                case 2:
                    System.out.print("Enter a number to subtract: ");
                    double subtractValue = scanner.nextDouble();
                    calculator.subtract(subtractValue);
                    break;
                case 3:
                    System.out.print("Enter a number to multiply by: ");
                    double multiplyValue = scanner.nextDouble();
                    calculator.multiply(multiplyValue);
                    break;
                case 4:
                    System.out.print("Enter a number to divide by: ");
                    double divideValue = scanner.nextDouble();
                    calculator.divide(divideValue);
                    break;
                case 5:
                    calculator = new Calculator(); // Clear the calculator
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
