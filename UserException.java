import java.util.Scanner;

class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

public class UserException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input numbers
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // Input operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char op = sc.next().charAt(0);
            
            sc.close();
            
            double result;
            switch (op) {
                case '+':
                    result = a + b;
                    break;

                case '-':
                    result = a - b;
                    break;

                case '*':
                    result = a * b;
                    break;

                case '/':
                    if (b == 0) {
                        throw new InvalidOperationException("Division by zero is not allowed.");
                    }
                    result = a / b;
                    break;

                default:
                    throw new InvalidOperationException("Invalid operator entered.");
            }
            

            System.out.println("Result: " + result);

        } catch (InvalidOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input Error: Please enter valid numbers and operator.");
        }
    }
}