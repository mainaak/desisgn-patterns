package creational.factory;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification(String phoneNumber) {
        System.out.println("Sending SMS notification to number " + phoneNumber);
    }
}
