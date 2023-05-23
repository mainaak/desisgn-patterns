package creational.factory;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String emailAddress) {
        System.out.println("Sending email notification to " + emailAddress);
    }
}
