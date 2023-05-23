package creational.factory;

public interface NotificationFactory {

    static Notification getNotifier(NotificationType notificationType) {
        if (notificationType == null) return null;
        switch (notificationType) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("No such notification type exists.");
        }
    }
}
