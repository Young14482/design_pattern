package ch06.notification;

public class SmsNotifier implements Notifier {
    Notifier notifier;

    public SmsNotifier() {
    }

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        if (notifier != null) {
            notifier.send();
        }
        System.out.println("SMS 알림");
    }
}
