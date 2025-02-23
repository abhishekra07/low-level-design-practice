package employee_management_system.cancellationpolicy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FreeCancellationWithin24Hours implements CancellationPolicy {
    @Override
    public String getCancellationDetails() {
        return "Free cancellation within 24 hours of booking.";
    }

    @Override
    public boolean canCancel(LocalDate bookingDate, LocalDate cancelDate) {
        return ChronoUnit.HOURS.between(bookingDate.atStartOfDay(), cancelDate.atStartOfDay()) <= 24;
    }
}