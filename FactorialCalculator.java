import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
    private static long calculateFactorial(int num) {
        if (num < 0) {
            return -1; // Factorial is not defined for negative numbers
        }

        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
