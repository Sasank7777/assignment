import java.util.Scanner;

class Operation {
    void calculate(int a, int b) {
        System.out.println("This is a generic operation.");
    }
}

class Addition extends Operation {
    @Override
    void calculate(int a, int b) {
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }
}

class Subtraction extends Operation {
    @Override
    void calculate(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction Result: " + result);
    }
}

class Multiplication extends Operation {
    @Override
    void calculate(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication Result: " + result);
    }
}

class Division extends Operation {
    @Override
    void calculate(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double result = (double) a / b;
            System.out.println("Division Result: " + result);
        }
    }
}

public class CalciOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation op;

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nSelect operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                op = new Addition();
                break;
            case 2:
                op = new Subtraction();
                break;
            case 3:
                op = new Multiplication();
                break;
            case 4:
                op = new Division();
                break;
            default:
                System.out.println("Invalid choice. Performing generic operation.");
                op = new Operation();
        }

        op.calculate(a, b);
        sc.close();
    }
}
