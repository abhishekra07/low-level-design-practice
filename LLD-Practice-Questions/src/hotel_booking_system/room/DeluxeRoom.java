package hotel_booking_system.room;

import hotel_booking_system.constants.enums.room.BedType;
import hotel_booking_system.constants.enums.room.RoomStatus;
import hotel_booking_system.constants.enums.room.RoomType;

import java.math.BigDecimal;
import java.util.List;

public class DeluxeRoom extends Room {

    public DeluxeRoom(String roomNo, String description, String moreInformation, BigDecimal pricePerNight, RoomStatus roomStatus, int capacity, List<String> amenities, int floorNumber, BedType bedType) {
        super(roomNo, description, moreInformation, pricePerNight, roomStatus, capacity, amenities, floorNumber, bedType);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.DELUXE;
    }
}
