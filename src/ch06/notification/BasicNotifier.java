package ch06.notification;

public class BasicNotifier implements Notifier {
    Notifier notifier;

    public BasicNotifier() {
    }

    public BasicNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        if (notifier != null) {
            notifier.send();
        }
        System.out.println("기본 알림");
    }
}
