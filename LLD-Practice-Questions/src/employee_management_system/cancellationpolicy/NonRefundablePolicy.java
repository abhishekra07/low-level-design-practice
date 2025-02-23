package employee_management_system.cancellationpolicy;

import java.time.LocalDate;

public class NonRefundablePolicy implements CancellationPolicy {
    @Override
    public String getCancellationDetails() {
        return "Non-refundable: No cancellations or refunds allowed.";
    }

    @Override
    public boolean canCancel(LocalDate bookingDate, LocalDate cancelDate) {
        return false; // No cancellation allowed
    }
}
