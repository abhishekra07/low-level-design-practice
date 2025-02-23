package hotel_booking_system.constants.enums.room;

public enum RoomStatus {
    AVAILABLE,          // ✅ Ready for booking
    UNDER_MAINTENANCE,  // 🔧 Currently being repaired
    RENOVATION,         // 🏗️ Under construction, not available
    OUT_OF_SERVICE      // ❌ Temporarily not available for unknown reasons
}