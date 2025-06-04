public class CalciConstructors {

    private double result;

    // Constructor with no arguments, initializes result to 0
    public CalciConstructors() {
        this.result = 0;
    }

    public CalciConstructors(double num1, double num2) {
        this.result = num1 + num2;
    }

    public CalciConstructors(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                this.result = num1 + num2;
                break;
            case "subtract":
                this.result = num1 - num2;
                break;
            case "multiply":
                this.result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    this.result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    this.result = Double.NaN;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                this.result = Double.NaN;
        }
    }
    
    public double getResult() {
        return result;
    }


    public static void main(String[] args) {
        CalciConstructors calc1 = new CalciConstructors();
        System.out.println("Result of calc1: " + calc1.getResult());

        CalciConstructors calc2 = new CalciConstructors(5, 3);
        System.out.println("Result of calc2: " + calc2.getResult());

        CalciConstructors calc3 = new CalciConstructors(10, 2, "divide");
        System.out.println("Result of calc3: " + calc3.getResult());

        CalciConstructors calc4 = new CalciConstructors(10, 2, "add");
        System.out.println("Result of calc4: " + calc4.getResult());

        CalciConstructors calc5 = new CalciConstructors(10, 2, "subtract");
        System.out.println("Result of calc5: " + calc5.getResult());

        CalciConstructors calc6 = new CalciConstructors(10, 2, "multiply");
        System.out.println("Result of calc6: " + calc6.getResult());
        
        CalciConstructors calc7 = new CalciConstructors(10, 0, "divide");
        System.out.println("Result of calc7: " + calc7.getResult());

        CalciConstructors calc8 = new CalciConstructors(10, 2, "invalid");
        System.out.println("Result of calc8: " + calc8.getResult());
    }
}
