package hotel_booking_system.hotelservice;

import java.math.BigDecimal;

public class SingleService implements HotelService {
    private final String name;
    private final BigDecimal price;
    private final String description;

    public SingleService(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}