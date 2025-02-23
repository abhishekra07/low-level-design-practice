package hotel_booking_system.room;

import hotel_booking_system.constants.enums.room.RoomStatus;
import hotel_booking_system.constants.enums.room.RoomType;

import java.math.BigDecimal;
import java.util.List;

public class VipRoom extends Room {

    public VipRoom(String roomNo, RoomType roomType, String description, String moreInformation, BigDecimal pricePerNight, RoomStatus roomStatus, int capacity, List<String> amenities, int floorNumber, BedType bedType) {
        super(roomNo, roomType, description, moreInformation, pricePerNight, roomStatus, capacity, amenities, floorNumber, bedType);
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }
}
