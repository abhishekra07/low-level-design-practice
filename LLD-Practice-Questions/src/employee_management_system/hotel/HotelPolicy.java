package employee_management_system.hotel;

import employee_management_system.cancellationpolicy.CancellationPolicy;

import java.time.LocalTime;

public class HotelPolicy {
    private CancellationPolicy cancellationPolicy;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private int minimumAgeRequirement;
    private boolean smokingAllowed;
    private boolean petsAllowed;

    public CancellationPolicy getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(CancellationPolicy cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getMinimumAgeRequirement() {
        return minimumAgeRequirement;
    }

    public void setMinimumAgeRequirement(int minimumAgeRequirement) {
        this.minimumAgeRequirement = minimumAgeRequirement;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }
}
