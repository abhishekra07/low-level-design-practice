package hotel_booking_system.booking;

import employee_management_system.hotel.HotelPolicy;
import hotel_booking_system.constants.enums.booking.BookingStatus;
import hotel_booking_system.customer.Customer;
import hotel_booking_system.hotelservice.HotelService;
import hotel_booking_system.room.Room;

import java.time.LocalTime;
import java.util.List;

public class Booking {
    private String bookingId;
    private Room room;
    private Customer customer;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private BookingStatus bookingStatus;
    private HotelPolicy hotelPolicy;
    private List<HotelService> services;

    public boolean isRoomAvailable(LocalTime startDate, LocalTime endDate) {
        return (endDate.isBefore(hotelPolicy.getCheckInTime()) || startDate.isAfter(hotelPolicy.getCheckOutTime()));
    }

    public double calculatePrice() {
        return 0;
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
}
