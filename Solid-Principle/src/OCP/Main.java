package OCP;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        // Example: Sending Email
        NotificationService emailService = new NotificationService(email);
        emailService.send("Hello via Email!");

        // Example: Sending SMS
        NotificationService smsService = new NotificationService(sms);
        smsService.send("Hello via SMS!");

        // Example: Sending Push Notification
        NotificationService pushService = new NotificationService(push);
        pushService.send("Hello via Push!");
    }
}