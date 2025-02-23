package hotel_booking_system.hotelservice;

import java.util.List;

public class ServiceBundle implements HotelService {
    private final String name;
    private final List<HotelService> services;
    private final Double discountedPrice;

    public ServiceBundle(String name, List<HotelService> services, Double discountedPrice) {
        this.name = name;
        this.services = services;
        this.discountedPrice = discountedPrice;
    }

    @Override
    public Double getPrice() {
        return discountedPrice;
    }

    @Override
    public String getDescription() {
        return "Bundle: " + name + " includes " +
                services.stream().map(HotelService::getName).toList();
    }

    @Override
    public String getName() {
        return name;
    }
}