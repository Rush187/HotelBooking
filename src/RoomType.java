import java.util.Scanner;

public class RoomType {
    private final Scanner scanner;
    private final int duration;

    public RoomType(Scanner scanner, int duration) {
        this.scanner = scanner;
        this.duration = duration;
    }

    public void askForRoomType() {
        String[] roomDetails = queryRoomType(duration);
        System.out.println("The type of room booked is " + roomDetails[0] + " and the total cost is $" + roomDetails[1] + ".");
    }

    private String[] queryRoomType(int duration) {
        String roomType = "";
        int roomPrice = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("What type of room would you like to book? ");
            System.out.println("1. Single - $100");
            System.out.println("2. Double - $200");
            System.out.println("3. Suite - $300");
            System.out.print("Enter the room type here: ");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    roomType = "Single";
                    roomPrice = 100;
                    isValid = true;
                    break;
                case "2":
                    roomType = "Double";
                    roomPrice = 200;
                    isValid = true;
                    break;
                case "3":
                    roomType = "Suite";
                    roomPrice = 300;
                    isValid = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid room type.");
                    break;
            }
        }
        System.out.println(" ");

        // Calculate the total cost
        int totalCost = duration * roomPrice;

        return new String[]{roomType, String.valueOf(totalCost)};
    }
}