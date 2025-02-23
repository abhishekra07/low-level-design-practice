package hotel_booking_system.report;

import hotel_booking_system.booking.Booking;

import java.io.IOException;

public interface BookingReportGenerator {
    void generateReport(Booking booking) throws IOException;
}
