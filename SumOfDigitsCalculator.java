import java.util.Scanner;

public class SumOfDigitsCalculator {
    public static void main(String[] args) {

        // Step 1: Prompt the user to input a positive integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        // Step 2: Read the user input
        int number = scanner.nextInt();

        // Step 3: Calculate the sum of digits
        int sumOfDigits = calculateSumOfDigits(number);

        // Step 4: Output the result
        System.out.println("Original Number: " + number);
        System.out.println("Sum of Digits: " + sumOfDigits);

        scanner.close();
    }

    // Function to calculate the sum of digits of a number
    private static int calculateSumOfDigits(int num) {
        int sum = 0;

        // Iterate through each digit of the number
        while (num > 0) {
            sum += num % 10;  // Add the last digit to the sum
            num /= 10;        // Remove the last digit
        }

        return sum;
    }
}
