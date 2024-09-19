class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add two Integer value: " + calc.add(10, 20));
        System.out.println("Add three Integer value: " + calc.add(10, 20, 30));
        System.out.println("Add two Double value: " + calc.add(10.5, 20.5));

    }
}
