import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarTest {
    @Test
    public void testGetCheckInDateWithValidInput() {
        // Create a Scanner with predefined input
        String input = "01/01/2025";
        Scanner scanner = new Scanner(input);

        // Create an instance of the Calendar class
        Calendar calendar = new Calendar(scanner, 3);

        // Call the getCheckInDate method
        LocalDate checkInDate = calendar.getCheckInDate();

        // Verify that the check-in date is not null
        Assert.assertNotNull(checkInDate);
    }

    @Test
    public void testGetCheckInDateWithFutureInput() {
        // Create a Scanner with predefined input
        String input = "01/01/2030\n01/01/2025";
        Scanner scanner = new Scanner(input);

        // Create an instance of the Calendar class
        Calendar calendar = new Calendar(scanner, 3);

        // Call the getCheckInDate method
        LocalDate checkInDate = calendar.getCheckInDate();

        // Verify that the check-in date is not null
        Assert.assertNotNull(checkInDate);
    }

    @Test
    public void testGetCheckInDateWithPastInput() {
        // Create a Scanner with predefined input
        String input = "01/01/2020\n01/01/2025";
        Scanner scanner = new Scanner(input);

        // Create an instance of the Calendar class
        Calendar calendar = new Calendar(scanner, 3);

        // Call the getCheckInDate method
        LocalDate checkInDate = calendar.getCheckInDate();

        // Verify that the check-in date is not null
        Assert.assertNotNull(checkInDate);
    }

    @Test
    public void testBogusDateInCorrectFormat() {
        // Create a Scanner with predefined input
        String input = "00/00/0000\n01/01/2025";
        Scanner scanner = new Scanner(input);

        // Create an instance of the Calendar class
        Calendar calendar = new Calendar(scanner, 3);

        // Call the getCheckInDate method
        LocalDate checkInDate = calendar.getCheckInDate();

        // Verify that the check-in date is not null
        Assert.assertNotNull(checkInDate);
    }

    @Test
    public void testSpecialCharDate() {
        // Create a Scanner with predefined input
        String input = "00/00/000!\n01/01/2025";
        Scanner scanner = new Scanner(input);

        // Create an instance of the Calendar class
        Calendar calendar = new Calendar(scanner, 3);

        // Call the getCheckInDate method
        LocalDate checkInDate = calendar.getCheckInDate();

        // Verify that the check-in date is not null
        Assert.assertNotNull(checkInDate);
    }

    @Test
    public void testNullBlankDate() {
        // Create a Scanner with predefined input
        String input = "  /  /    \n01/01/2025";
        Scanner scanner = new Scanner(input);

        // Create an instance of the Calendar class
        Calendar calendar = new Calendar(scanner, 3);

        // Call the getCheckInDate method
        LocalDate checkInDate = calendar.getCheckInDate();

        // Verify that the check-in date is not null
        Assert.assertNotNull(checkInDate);
    }
}