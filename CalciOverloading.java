public class CalciOverloading {

    
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    public int calculate(int num1, int num2, String operation) {
        if (operation.equals("subtraction"))
            return num1 - num2;
        return -1;
    }

    public double calculate(double num1, double num2) {
        return num1 * num2;
    }

    public double calculate(double num1, double num2, char operation) {
        if (operation == '/')
            return num1 / num2;
        return -1;
    }

    public static void main(String[] args) {
        CalciOverloading calculator = new CalciOverloading ();


        System.out.println("Addition: " + calculator.calculate(10, 5));
        System.out.println("Subtraction: " + calculator.calculate(10, 5, "subtraction"));
        System.out.println("Multiplication: " + calculator.calculate(10.0, 5.0));
        System.out.println("Division: " + calculator.calculate(10.0, 5.0, '/'));

    }
}
