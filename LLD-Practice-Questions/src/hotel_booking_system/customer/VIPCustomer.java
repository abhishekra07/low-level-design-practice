package hotel_booking_system.customer;

import hotel_booking_system.booking.Booking;
import hotel_booking_system.constants.enums.customer.CustomerDiscount;

import java.math.BigDecimal;
import java.util.List;

public class VIPCustomer extends Customer {

    private final CustomerDiscount customerDiscount = CustomerDiscount.VIP_CUSTOMER;

    public VIPCustomer(String name, String contactNumber, String emailId, boolean isVerified, List<Booking> bookingHistory) {
        super(name, contactNumber, emailId, isVerified, bookingHistory);
    }

    @Override
    public String getCustomerType() {
        return customerDiscount.getCustomerType();
    }

    @Override
    public BigDecimal getDiscountPercentage() {
        return BigDecimal.valueOf(customerDiscount.getDiscountPercentage());
    }
}