package employee_management_system.cancellationpolicy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancellationUpTo2DaysBefore implements CancellationPolicy {
    @Override
    public String getCancellationDetails() {
        return "Cancellation allowed up to 2 days before check-in.";
    }

    @Override
    public boolean canCancel(LocalDate bookingDate, LocalDate cancelDate) {
        return ChronoUnit.DAYS.between(cancelDate, bookingDate) >= 2;
    }
}