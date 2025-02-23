package hotel_booking_system.report;

import hotel_booking_system.booking.Booking;
import hotel_booking_system.hotelservice.HotelService;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class StandardBookingReportGenerator implements BookingReportGenerator {

    // ANSI Escape Codes for Colors
    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[34m";    // Headings
    private static final String GREEN = "\u001B[32m";   // Values
    private static final String RED = "\u001B[31m";     // Discounts
    private static final String YELLOW = "\u001B[33m";  // Final Amount
    private static final DecimalFormat CURRENCY_FORMAT = new DecimalFormat("$#,##0.00");

    @Override
    public void generateReport(Booking booking) throws IOException {
        BigDecimal roomTotalPrice = booking.getRoom().getPricePerNight().multiply(BigDecimal.valueOf(booking.getNumberOfNights()));

        BigDecimal serviceTotal = booking.getServices().stream()
                .map(HotelService::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal subtotal = roomTotalPrice.add(serviceTotal);
        BigDecimal discountAmount = subtotal.multiply(booking.getCustomer().getDiscountPercentage()).divide(BigDecimal.valueOf(100));
        BigDecimal afterDiscount = subtotal.subtract(discountAmount);

        BigDecimal taxAmount = afterDiscount.multiply(booking.getTaxRate());
        BigDecimal finalAmount = afterDiscount.add(taxAmount);

        // Print Report
        System.out.println(BLUE + "\n===== BOOKING REPORT =====" + RESET);
        System.out.println("✅ " + BLUE + "Customer Name: " + RESET + GREEN + booking.getCustomer().getName() + RESET);
        System.out.println("✅ " + BLUE + "Customer Type: " + RESET + GREEN + booking.getCustomer().getCustomerType() + RESET);
        System.out.println("🏨 " + BLUE + "Room Type: " + RESET + GREEN + booking.getRoom().getRoomType() + RESET);
        System.out.println("🔢 " + BLUE + "Room Number: " + RESET + GREEN + booking.getRoom().getRoomNo() + RESET);
        System.out.println("📅 " + BLUE + "Check-in Date: " + RESET + GREEN + booking.getCheckInDate() + RESET);
        System.out.println("📅 " + BLUE + "Check-out Date: " + RESET + GREEN + booking.getCheckOutDate() + RESET);
        System.out.println("🕒 " + BLUE + "Number of Nights: " + RESET + GREEN + booking.getNumberOfNights() + RESET);

        // Services Section
        System.out.println(BLUE + "\n=== SERVICES INCLUDED ===" + RESET);
        if (booking.getServices().isEmpty()) {
            System.out.println(RED + "❌ No additional services." + RESET);
        } else {
            booking.getServices().forEach(service ->
                    System.out.println("➕ " + GREEN + service.getName() + " (" + CURRENCY_FORMAT.format(service.getPrice()) + ")" + RESET)
            );
        }

        // Amount Breakdown
        System.out.println(BLUE + "\n=== AMOUNT BREAKDOWN ===" + RESET);
        System.out.println("💰 " + BLUE + "Room Total: " + RESET + GREEN + CURRENCY_FORMAT.format(roomTotalPrice) + RESET);
        System.out.println("🛠 " + BLUE + "Service Total: " + RESET + GREEN + CURRENCY_FORMAT.format(serviceTotal) + RESET);
        System.out.println("📊 " + BLUE + "Subtotal: " + RESET + GREEN + CURRENCY_FORMAT.format(subtotal) + RESET);
        System.out.println("🎁 " + BLUE + "Discount (" + booking.getCustomer().getDiscountPercentage() + "%): " + RESET +
                RED + "- " + CURRENCY_FORMAT.format(discountAmount) + RESET);
        System.out.println("🔽 " + BLUE + "After Discount: " + RESET + GREEN + CURRENCY_FORMAT.format(afterDiscount) + RESET);
        System.out.println("💵 " + BLUE + "Tax Rate: " + RESET + GREEN + booking.getTaxRate().multiply(BigDecimal.valueOf(100)) + "%" + RESET);
        System.out.println("📈 " + BLUE + "Tax Amount: " + RESET + GREEN + CURRENCY_FORMAT.format(taxAmount) + RESET);
        System.out.println("✅ " + BLUE + "Final Amount to Pay: " + RESET + YELLOW + CURRENCY_FORMAT.format(finalAmount) + RESET);
        System.out.println(BLUE + "=========================" + RESET);
    }
}