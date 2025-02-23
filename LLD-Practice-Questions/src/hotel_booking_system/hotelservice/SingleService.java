package hotel_booking_system.hotelservice;

public class SingleService implements HotelService {
    private final String name;
    private final Double price;
    private final String description;

    public SingleService(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public Double getPrice() {
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