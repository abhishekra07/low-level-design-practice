package hotel_booking_system;

import hotel_booking_system.booking.Booking;
import hotel_booking_system.booking.BookingManager;
import hotel_booking_system.constants.enums.room.BedType;
import hotel_booking_system.constants.enums.room.RoomStatus;
import hotel_booking_system.customer.Customer;
import hotel_booking_system.customer.RegularCustomer;
import hotel_booking_system.report.StandardBookingReportGenerator;
import hotel_booking_system.room.Room;
import hotel_booking_system.room.SingleRoom;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BookingManager bookingManager = new BookingManager(new StandardBookingReportGenerator());

        // Adding rooms and customers
        Room singleRoom = new SingleRoom(
                "101",
                "Cozy Single Room",
                "A small but comfortable room perfect for solo travelers.",
                new BigDecimal("100.00"),
                RoomStatus.AVAILABLE,
                1,
                List.of("WiFi", "TV", "Air Conditioning"),
                1,
                BedType.SINGLE
        );
        Customer john = new RegularCustomer("John Doe", "999999999", "example@test.com", Boolean.TRUE, new ArrayList<>());

        bookingManager.addRoom(singleRoom);
        bookingManager.addCustomer(john);

        // Creating a booking
        LocalDate checkIn = LocalDate.of(2025, 2, 23);
        LocalDate checkOut = LocalDate.of(2025, 2, 25);
        bookingManager.createBooking(john, "101", checkIn, checkOut);

        // Canceling a booking
        Booking existingBooking = bookingManager.getAllBookings().get(0);
        bookingManager.cancelBooking(existingBooking.getBookingId(), LocalDate.now());
        bookingManager.generateBookingReport(existingBooking);
    }
}
