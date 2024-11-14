package ch8;

import ch8.pub.Pub;
import ch8.sub.Sub1;
import ch8.sub.Sub2;
import ch8.sub.SubListener;

// 옵저버 패턴 >> 콜백
public class App {
    public static void main(String[] args) {
        // 객체 생성 init
        Pub pub = new Pub();
        SubListener sub1 = new Sub1();
        SubListener sub2 = new Sub2();

        pub.add(sub1);
        pub.add(sub2);

        // 스레드 생성 >> 람다식(화살표 함수)
        // 2. 마트에 상품을 입고하는 스레드
        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pub.inCome(); // 상품 들어옴
        }).start();

        // 마트스레드
        new Thread(() -> {
            while (true) {
                if(pub.value == null) {
                    System.out.println("상품 미입고..");
                } else {
                    pub.notifyChange(pub.value + " 입고 됨");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        System.out.println("메인 종료");
    }
}
