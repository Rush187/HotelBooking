import java.util.Scanner;

public class GuestName {
    private final Scanner scanner; // Declare scanner as a class variable

    public GuestName() {
        scanner = new Scanner(System.in); // Initialize scanner in the constructor
    }

    // Method to ask for guest names
    public void askForNames() {
        String lastName = queryLastName(); // Call method to ask for last name
        String firstName = queryFirstName(); // Call method to ask for first name

        System.out.println("Verify the full name is " + firstName + " " + lastName + ".");
    }

    // Method to query last name
    private String queryLastName() {
        String lastName = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.println("What is the last name of the guest? ");
            System.out.print("Enter the last name here: ");
            lastName = scanner.nextLine().trim(); // Trim the input to remove leading and trailing whitespace
            if (lastName.isEmpty()) {
                System.out.println("Last name cannot be blank. Please enter a valid last name.");
            } else {
                isValid = true; // Set isValid to true to exit the loop
            }
        }
        return lastName;
    }

    // Method to query first name
    private String queryFirstName() {
        String firstName = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.println("What is the first name of the guest? ");
            System.out.print("Enter the first name here: ");
            firstName = scanner.nextLine().trim(); // Trim the input to remove leading and trailing whitespace
            if (firstName.isEmpty()) {
                System.out.println("First name cannot be blank. Please enter a valid first name.");
            } else {
                isValid = true; // Set isValid to true to exit the loop
            }
        }
        return firstName;
    }
}