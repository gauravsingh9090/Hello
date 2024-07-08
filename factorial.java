public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
