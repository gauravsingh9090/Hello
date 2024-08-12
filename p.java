public class Factorial {

    // Recursive method to find the factorial of a number
    public static int factorial(int n) {
        if (n == 0) { // Base case: factorial of 0 is 1
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5; // You can change this number to test with different values
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
