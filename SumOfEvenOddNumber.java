public class SumOfEvenOddNumber {
    public static void main(String[] args) {
        int n = 10;

        int sumEven = calculateSumEvenNumbers(n);
        int sumOdd = calculateSumOddNumbers(n);

        System.out.println("Sum of first 10 even numbers: " + sumEven);
        System.out.println("Sum of first 10 odd numbers: " + sumOdd);
    }
    private static int calculateSumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= 2 * n; i += 2) {
            sum += i;
        }
        return sum;
    }

    private static int calculateSumOddNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
