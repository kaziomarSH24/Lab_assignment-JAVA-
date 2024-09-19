class Math {
    static class Utility {
        public static int factorial(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static int exponentiation(int base, int exp) {
            int result = 1;
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int fact = Math.Utility.factorial(5);
        int exp = Math.Utility.exponentiation(4, 3);

        System.out.println("Factorial of 5: " + fact);
        System.out.println("4 raised to the power 3: " + exp);
    }
}
