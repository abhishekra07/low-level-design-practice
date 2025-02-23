package hotel_booking_system.room;

import hotel_booking_system.constants.enums.room.BedType;
import hotel_booking_system.constants.enums.room.RoomStatus;
import hotel_booking_system.constants.enums.room.RoomType;

import java.math.BigDecimal;
import java.util.List;

public abstract class Room {
    private String roomNo;
    private String description;
    private String moreInformation;
    private BigDecimal pricePerNight;
    private RoomStatus roomStatus;
    private int capacity;
    private List<String> amenities;
    private int floorNumber;
    private BedType bedType;

    public Room() {}

    public Room(String roomNo, String description, String moreInformation,
                BigDecimal pricePerNight, RoomStatus roomStatus, int capacity,
                List<String> amenities, int floorNumber, BedType bedType) {
        this.roomNo = roomNo;
        this.description = description;
        this.moreInformation = moreInformation;
        this.pricePerNight = pricePerNight;
        this.roomStatus = roomStatus;
        this.capacity = capacity;
        this.amenities = amenities;
        this.floorNumber = floorNumber;
        this.bedType = bedType;
    }

    // Getters and Setters
    public String getRoomNo() { return roomNo; }
    public void setRoomNo(String roomNo) { this.roomNo = roomNo; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getMoreInformation() { return moreInformation; }
    public void setMoreInformation(String moreInformation) { this.moreInformation = moreInformation; }

    public BigDecimal getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(BigDecimal pricePerNight) { this.pricePerNight = pricePerNight; }

    public RoomStatus getRoomStatus() { return roomStatus; }
    public void setRoomStatus(RoomStatus roomStatus) { this.roomStatus = roomStatus; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public List<String> getAmenities() { return amenities; }
    public void setAmenities(List<String> amenities) { this.amenities = amenities; }

    public int getFloorNumber() { return floorNumber; }
    public void setFloorNumber(int floorNumber) { this.floorNumber = floorNumber; }

    public BedType getBedType() { return bedType; }
    public void setBedType(BedType bedType) { this.bedType = bedType; }

    public boolean isBookable() {
        return this.roomStatus == RoomStatus.AVAILABLE;
    }

    public abstract RoomType getRoomType(); // Each subclass must implement this
}
