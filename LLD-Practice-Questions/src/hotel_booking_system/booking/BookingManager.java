package hotel_booking_system.booking;

import employee_management_system.cancellationpolicy.NonRefundablePolicy;
import employee_management_system.hotel.HotelPolicy;
import hotel_booking_system.constants.enums.booking.BookingStatus;
import hotel_booking_system.constants.enums.room.RoomStatus;
import hotel_booking_system.customer.Customer;
import hotel_booking_system.report.BookingReportGenerator;
import hotel_booking_system.room.Room;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BookingManager {
    private static final Logger logger = Logger.getLogger(BookingManager.class.getName());

    private List<Booking> bookings;
    private List<Room> rooms;
    private List<Customer> customers;
    private BookingReportGenerator bookingReportGenerator;

    public BookingManager(BookingReportGenerator bookingReportGenerator) {
        this.bookingReportGenerator = bookingReportGenerator;
        this.bookings = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    /**
     * Updates the room status. If the room is under maintenance, it will be unavailable for booking.
     */
    public void updateRoomStatus(String roomNumber, RoomStatus newStatus) {
        rooms.stream()
                .filter(room -> room.getRoomNo().equals(roomNumber))
                .findFirst()
                .ifPresent(room -> room.setRoomStatus(newStatus));
    }

    /**
     * Checks if a room is available for the given dates.
     */
    public boolean isRoomAvailable(String roomNumber, LocalDate checkInDate, LocalDate checkOutDate) {
        Optional<Room> roomOpt = rooms.stream()
                .filter(room -> room.getRoomNo().equals(roomNumber) && room.isBookable())
                .findFirst();

        if (roomOpt.isEmpty()) {
            return false; // Room does not exist or is unavailable.
        }

        return bookings.stream()
                .noneMatch(booking -> booking.getRoom().getRoomNo().equals(roomNumber) &&
                        (checkInDate.isBefore(booking.getCheckOutDate()) && checkOutDate.isAfter(booking.getCheckInDate())));
    }

    /**
     * Creates a new booking if the customer exists and the room is available.
     */
    public boolean createBooking(Customer customer, String roomNumber, LocalDate checkInDate, LocalDate checkOutDate) {
        // Check if customer exists
        if (!customers.contains(customer)) {
            System.out.println("Customer not found. Please add the customer first.");
            return false;
        }

        // Check if room is available
        if (!isRoomAvailable(roomNumber, checkInDate, checkOutDate)) {
            System.out.println("Room is not available for the selected dates.");
            return false;
        }

        // Fetch the room
        Optional<Room> roomOpt = rooms.stream()
                .filter(room -> room.getRoomNo().equals(roomNumber))
                .findFirst();

        if (roomOpt.isEmpty()) {
            System.out.println("Room not found.");
            return false;
        }

        Room room = roomOpt.get();

        // Create and store the booking
        Booking newBooking = new Booking();
        newBooking.setCustomer(customer);
        newBooking.setRoom(room);
        newBooking.setBookingId(UUID.randomUUID().toString());
        newBooking.setBookingStatus(BookingStatus.CONFIRMED);
        newBooking.setCheckInDate(checkInDate);
        newBooking.setCheckOutDate(checkOutDate);
        newBooking.setServices(Collections.emptyList());
        HotelPolicy hotelPolicy = new HotelPolicy();
        hotelPolicy.setCancellationPolicy(new NonRefundablePolicy());
        newBooking.setHotelPolicy(hotelPolicy);
        bookings.add(newBooking);
        customer.addBooking(newBooking); // Add booking to customer history
        System.out.println("Booking created successfully for " + customer.getName());

        return true;
    }

    /**
     * Checks if a booking can be canceled.
     */
    public boolean canCancelBooking(Booking booking, LocalDate todayDate) {
        System.out.println("cancellation details :- " + booking.getHotelPolicy().getCancellationPolicy().getCancellationDetails());
        return booking.getHotelPolicy().getCancellationPolicy().canCancel(booking.getCheckInDate(), todayDate);
    }

    /**
     * Cancels a booking if allowed.
     */
    public boolean cancelBooking(String bookingId, LocalDate todayDate) {
        Optional<Booking> bookingOpt = bookings.stream()
                .filter(b -> b.getBookingId().equals(bookingId))
                .findFirst();

        if (bookingOpt.isEmpty()) {
            System.out.println("Booking not found.");
            return false;
        }

        Booking booking = bookingOpt.get();

        if (!canCancelBooking(booking, todayDate)) {
            System.out.println("Booking cannot be canceled after check-in date.");
            return false;
        }

        // Remove booking from customer history
        booking.getCustomer().updateBooking(bookingId, BookingStatus.CANCELLED);
        bookings.remove(booking);
        System.out.println("Booking canceled successfully.");
        return true;
    }

    /**
     * Adds a new customer to the system.
     */
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    /**
     * Lists all active bookings.
     */
    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings);
    }

    /**
     * Retrieves all available rooms.
     */
    public List<Room> getAvailableRooms() {
        return rooms.stream()
                .filter(Room::isBookable)
                .collect(Collectors.toList());
    }

    public void generateBookingReport(Booking booking) throws IOException {
        this.bookingReportGenerator.generateReport(booking);
    }
}