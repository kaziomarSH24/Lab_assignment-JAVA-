class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + MathOperations.add(10, 5));
        System.out.println("Subtraction: " + MathOperations.subtract(10, 5));
        System.out.println("Multiplication: " + MathOperations.multiply(10, 5));
        System.out.println("Division: " + MathOperations.divide(10, 5));
    }
}
