package ch07;

import ch07.pub.Pub;
import ch07.pub.PubListener;
import ch07.sub.Sub1;
import ch07.sub.Sub2;
import ch07.sub.SubListener;

// 옵저버 패턴 >> 콜백
public class App {
    public static void main(String[] args) {
        // 객체 생성 init
        PubListener pub = new Pub();
        SubListener sub1 = new Sub1();
        SubListener sub2 = new Sub2();
        
        // 2. 구독
        pub.add(sub1);
        pub.add(sub2);
        // 3. 상품 들어옴 (가정)
        
        // 4. notifyChange 호출
        pub.notifyChange("상품 입고됨");
    }
}
