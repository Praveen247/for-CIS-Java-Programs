import java.util.Scanner;

public class PalindormeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the original and reversed strings
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
}

