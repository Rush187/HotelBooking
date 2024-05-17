import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Calendar {
    private final Scanner scanner;
    private LocalDate checkInDate;
    private final int duration;

    public Calendar(Scanner scanner, int duration) {
        this.scanner = scanner;
        this.duration = duration;
    }

    public LocalDate getCheckInDate() {
        checkInDate = queryDate("check-in");
        System.out.println("The check-in date is " + checkInDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".");
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        LocalDate checkOutDate = checkInDate.plusDays(duration);
        System.out.println("The check-out date is " + checkOutDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".");
        return checkOutDate;
    }

    public void checkRoomAvailability() {
        // Add your logic here to check room availability
        System.out.println("Checking room availability...");
    }

    private LocalDate queryDate(String type) {
        LocalDate today = LocalDate.now();
        LocalDate threeYearsFromNow = today.plusYears(3);
        LocalDate date = null;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Please enter your " + type + " date (dd/mm/yyyy): ");
            String input = scanner.nextLine().trim();
            try {
                date = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if ((date.isBefore(today)) || (date.isAfter(threeYearsFromNow))) {
                    System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " date must be between today and three years from now. Please enter a valid date.");
                } else {
                    isValid = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter a valid date in the format dd/mm/yyyy.");
            }
        }
        return date;
    }
}