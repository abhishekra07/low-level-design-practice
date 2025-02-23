package employee_management_system.cancellationpolicy;

import java.time.LocalDate;

public interface CancellationPolicy {
    String getCancellationDetails();
    boolean canCancel(LocalDate bookingDate, LocalDate cancelDate);
}
