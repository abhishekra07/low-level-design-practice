package OCP;

public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification; // Dependency Injection
    }

    public void send(String message) {
        notification.sendNotification(message);
    }
}
