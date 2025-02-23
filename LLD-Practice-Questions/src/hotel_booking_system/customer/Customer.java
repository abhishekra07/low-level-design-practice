package hotel_booking_system.customer;

import hotel_booking_system.booking.Booking;
import hotel_booking_system.constants.enums.booking.BookingStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Customer {
    private String name;
    private String contactNumber;
    private String emailId;
    private boolean isVerified;
    private List<Booking> bookingHistory;

    public Customer(String name, String contactNumber, String emailId, boolean isVerified, List<Booking> bookingHistory) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.isVerified = isVerified;
        this.bookingHistory = bookingHistory;
    }

    public abstract String getCustomerType();

    public abstract BigDecimal getDiscountPercentage();

    public void addBooking(Booking booking) {
        this.bookingHistory.add(booking);
    }

    public void updateBooking(String bookingId, BookingStatus bookingStatus) {
        this.bookingHistory.stream()
                .filter(booking -> booking.getBookingId().equals(bookingId))
                .forEach(booking -> booking.setBookingStatus(bookingStatus));
    }

    public List<Booking> getActiveBookings() {
        return this.bookingHistory.stream().filter(booking -> booking.getBookingStatus() == BookingStatus.CONFIRMED)
                .collect(Collectors.toList());
    }

    public List<Booking> getCompletedBookings() {
        return this.bookingHistory.stream().filter(booking -> booking.getBookingStatus() == BookingStatus.COMPLETED)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public List<Booking> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<Booking> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }
}
