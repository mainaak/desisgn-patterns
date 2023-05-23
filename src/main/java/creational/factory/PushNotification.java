package creational.factory;

public class PushNotification implements Notification {

    @Override
    public void sendNotification(String url) {
        System.out.println("Sending push notification to " + url);
    }
}
