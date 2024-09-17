public class SimpleCalculator {

    // Function to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Declare two numbers
        int num1 = 10;
        int num2 = 20;
        
        // Call the addNumbers function and store the result
        int result = addNumbers(num1, num2);
        
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
