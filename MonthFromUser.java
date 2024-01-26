import java.util.Scanner;

public class MonthFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();

        // Validate the input
        if (monthNumber >= 1 && monthNumber <= 12) {
            // Call the method to get the month name using switch
            String monthName = getMonthNameSwitch(monthNumber);
            System.out.println("The corresponding month is: " + monthName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    // Method to get the month name using switch
    private static String getMonthNameSwitch(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    }
