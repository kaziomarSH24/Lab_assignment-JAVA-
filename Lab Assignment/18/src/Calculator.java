public class Calculator {
    private double operand1;
    private double operand2;
    private String operator;

    public Calculator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public double calculate(double operand) {
        return Math.sqrt(operand);
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(10, 5, "+");
        System.out.println("10 + 5 = " + calc1.calculate());
        
        Calculator calc2 = new Calculator(10, 5, "/");
        System.out.println("10 / 5 = " + calc2.calculate());

        System.out.println("Square root of 16 = " + calc1.calculate(16));
    }
}
