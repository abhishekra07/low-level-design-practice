package hotel_booking_system.hotelservice;

import java.math.BigDecimal;

public interface HotelService {
    BigDecimal getPrice();
    String getDescription();
    String getName();
}
