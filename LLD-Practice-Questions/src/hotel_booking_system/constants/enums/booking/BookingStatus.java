package hotel_booking_system.constants.enums.booking;

public enum BookingStatus {
    PENDING,    // Customer started booking but didn't complete
    CONFIRMED,  // Payment successful, room is booked
    CANCELLED,  // Customer canceled the booking
    COMPLETED   // Guest stayed and checked out
}