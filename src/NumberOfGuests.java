import java.util.Scanner;

public class NumberOfGuests {
    private final Scanner scanner; // Declare scanner as a class variable

    public NumberOfGuests() {
        scanner = new Scanner(System.in); // Initialize scanner in the constructor
    }

    public void askForNumberOfGuests() {
        int numberOfGuests = queryNumberOfGuests(); // Call the method to query the number of guests
        System.out.println("The number of guests staying in the room is " + numberOfGuests + ".");
    }

    // Method to query the number of guests
    public int queryNumberOfGuests() {
        int numberOfGuests = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("How many guests will be staying in the room? ");
            System.out.print("Enter the number of guests here: ");

            String input = scanner.nextLine().trim(); // Trim the input to remove leading and trailing whitespace
            try {
                numberOfGuests = Integer.parseInt(input); // Parse the input to an integer
                if (numberOfGuests <= 0) {
                    System.out.println("Number of guests must be greater than 0. Please enter a valid number of guests.");
                } else {
                    isValid = true; // Set isValid to true to exit the loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number of guests.");
            }
        }
        System.out.println(" ");
        return numberOfGuests;
    }
}
