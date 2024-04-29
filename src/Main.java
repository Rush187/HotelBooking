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
        newDurationOfStay.askForDurationOfStay(); // Call the method to ask for the duration of stay


        // Check room availability.
        Calendar newCalendar = new Calendar();
        newCalendar.checkRoomAvailability(); // Call the method to check room availability

        // What kind of room?

        // Check in date?
        // Check out date?

        // How many rooms?
        // Determine pricing.
        // Any extras?
    }
}