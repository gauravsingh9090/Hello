public class Factorial {
    
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;  // You can change this value for testing
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
