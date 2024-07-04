import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Input the string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        inputString = inputString.toLowerCase();

        // Split the string into words
        String[] words = inputString.split("\\s+");

        // Initialize the count for the word "the"
        int count = 0;

        // Iterate through the words and count occurrences of "the"
        for (String word : words) {
            if (word.equals("the")) {
                count++;
            }
        }

        // Print the frequency of the word "the"
        System.out.println("The frequency of the word 'the' is: " + count);

        // Close the scanner
        scanner.close();
    }
}
