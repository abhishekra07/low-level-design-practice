package hotel_booking_system.customer;

import hotel_booking_system.booking.Booking;
import hotel_booking_system.constants.enums.customer.CustomerDiscount;

import java.util.List;

public class RegularCustomer extends Customer {

    private final CustomerDiscount customerDiscount = CustomerDiscount.REGULAR_CUSTOMER;

    public RegularCustomer(String name, String contactNumber, String emailId, boolean isVerified, List<Booking> bookingHistory) {
        super(name, contactNumber, emailId, isVerified, bookingHistory);
    }

    @Override
    public String getCustomerType() {
        return customerDiscount.getCustomerType();
    }

    @Override
    public int getDiscountPercentage() {
        return customerDiscount.getDiscountPercentage();
    }
}