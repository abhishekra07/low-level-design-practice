package hotel_booking_system.booking;

import employee_management_system.hotel.HotelPolicy;
import hotel_booking_system.constants.enums.booking.BookingStatus;
import hotel_booking_system.customer.Customer;
import hotel_booking_system.hotelservice.HotelService;
import hotel_booking_system.room.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Booking {
    private String bookingId;
    private Room room;
    private Customer customer;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private BookingStatus bookingStatus;
    private HotelPolicy hotelPolicy;
    private List<HotelService> services;
    private BigDecimal taxRate = new BigDecimal("0.10");

    public double calculatePrice() {
        return 0;
    }

    public long getNumberOfNights() {
        return ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public HotelPolicy getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(HotelPolicy hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    public List<HotelService> getServices() {
        return services;
    }

    public void setServices(List<HotelService> services) {
        this.services = services;
    }

    public void addService(HotelService service) {
        this.services.add(service);
    }

    public void removeService(HotelService service) {
        this.services.remove(service);
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
}
