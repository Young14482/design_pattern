package ch06;

import ch06.notification.BasicNotifier;
import ch06.notification.EmailNotifier;
import ch06.notification.Notifier;
import ch06.notification.SmsNotifier;

public class App {

    public static void 알림(Notifier notifier) {
        notifier.send();
        System.out.println("---------");
    }
    // 데코레이터 패턴 : 기능 확장 (핵심)
    public static void main(String[] args) {
        // 1. 전체알림 (기본 >> 문자 >> 이메일)
        Notifier n1 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        알림(n1);
        // 2. 전체알림 (기본 >> 이메일 >> 문자)
        Notifier n2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        알림(n2);
        // 3. 기본알림
        Notifier n3 = new BasicNotifier();
        알림(n3);
        // 4. 기본 알림 + 문자 알림
        Notifier n4 = new SmsNotifier(new BasicNotifier());
        알림(n4);
        // 5. 기본 + 이메일
        Notifier n5 = new EmailNotifier(new BasicNotifier());
        알림(n5);
        // 6. 이메일
        Notifier n6 = new EmailNotifier();
        알림(n6);
        // 7. 문자
        Notifier n7 = new SmsNotifier();
        알림(n7);
        // 8. 문자 + 이메일
        Notifier n8 = new EmailNotifier(new SmsNotifier());
        알림(n8);
    }
}
