public class Main {
    public static void main(String[] args) {
        // Run the program here.

        // Start with the name of the guest booking the room.
        GuestName newGuestName = new GuestName();
        newGuestName.askForNames(); // Call the method to ask for guest names

        // What is the number of guests.
        NumberOfGuests newNumberOfGuests = new NumberOfGuests();
        newNumberOfGuests.askForNumberOfGuests(); // Call the method to ask for the number of guests

        // How long is the stay?
        DurationOfStay newDurationOfStay = new DurationOfStay();
        int duration = newDurationOfStay.askForDurationOfStay(); // Call the method to ask for the duration of stay

        // What type of room?
        RoomType newRoomType = new RoomType();
        newRoomType.askForRoomType(duration); // Call the method to ask for the room type with duration as argument

        // Check room availability.
        Calendar newCalendar = new Calendar();
        newCalendar.checkRoomAvailability(); // Call the method to check room availability

        // Check in date?
        // Check out date?

        // How many rooms?
        // Determine pricing.
        // Any extras?
    }
}