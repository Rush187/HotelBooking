import java.util.Scanner;

public class Calendar {
    private final Scanner scanner; // Declare scanner as a class variable

    public Calendar() {
        scanner = new Scanner(System.in); // Initialize scanner in the constructor
    }

    // Method to check room availability
    public void checkRoomAvailability() {
        boolean isRoomAvailable = queryRoomAvailability(); // Call the method to query room availability
        if (isRoomAvailable) {
            System.out.println("The room is available.");
        } else {
            System.out.println("The room is not available.");
        }
    }

    // Method to query room availability
    private boolean queryRoomAvailability() {
        boolean isRoomAvailable = false;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Is the room available? ");
            System.out.print("Enter 'yes' or 'no': ");

            String input = scanner.nextLine().trim().toLowerCase(); // Trim the input to remove leading and trailing whitespace and convert to lowercase
            if (input.equals("yes")) {
                isRoomAvailable = true;
                isValid = true; // Set isValid to true to exit the loop
            } else if (input.equals("no")) {
                isRoomAvailable = false;
                isValid = true; // Set isValid to true to exit the loop
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        return isRoomAvailable;
    }
}
