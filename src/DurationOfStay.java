import java.util.Scanner;

public class DurationOfStay {
    private final Scanner scanner;

    public DurationOfStay() {
        scanner = new Scanner(System.in);
    }

    public int askForDurationOfStay() {
        int duration = queryDurationOfStay();
        System.out.println("The duration of stay is " + duration + " days.");
        return duration;
    }

    private int queryDurationOfStay() {
        int duration = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("How many days will you be staying? ");
            System.out.print("Enter the number of days here: ");

            String input = scanner.nextLine().trim();
            try {
                duration = Integer.parseInt(input);
                if (duration <= 0) {
                    System.out.println("Duration must be greater than 0. Please enter a valid number of days.");
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number of days.");
            }
        }
        System.out.println(" ");
        return duration;
    }
}