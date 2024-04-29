import java.util.Scanner;

public class DurationOfStay {
    private final Scanner scanner; // Declare scanner as a class variable

    public DurationOfStay() {
        scanner = new Scanner(System.in); // Initialize scanner in the constructor
    }

    // Method to ask for the duration of stay
    public void askForDurationOfStay() {
        int durationOfStay = queryDurationOfStay(); // Call the method to query the duration of stay
        System.out.println("The duration of stay is " + durationOfStay + " days.");
    }

    // Method to query the duration of stay
    private int queryDurationOfStay() {
        int durationOfStay = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("How many days will the guest be staying? ");
            System.out.print("Enter the number of days here: ");

            String input = scanner.nextLine().trim(); // Trim the input to remove leading and trailing whitespace
            try {
                durationOfStay = Integer.parseInt(input); // Parse the input to an integer
                if (durationOfStay <= 0) {
                    System.out.println("Duration of stay must be greater than 0. Please enter a valid number of days.");
                } else {
                    isValid = true; // Set isValid to true to exit the loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number of days.");
            }
        }
        return durationOfStay;
    }
}


