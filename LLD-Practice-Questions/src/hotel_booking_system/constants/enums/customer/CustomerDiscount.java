package hotel_booking_system.constants.enums.customer;

public enum CustomerDiscount {
    REGULAR_CUSTOMER("Regular Customer", 0),
    VIP_CUSTOMER("VIP Customer", 20);

    private final String customerType;
    private final int discountPercentage;

    CustomerDiscount(String customerType, int discountPercentage) {
        this.customerType = customerType;
        this.discountPercentage = discountPercentage;
    }

    public String getCustomerType() {
        return customerType;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
