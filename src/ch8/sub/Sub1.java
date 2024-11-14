package ch8.sub;

public class Sub1 implements SubListener {

    @Override
    public void update(String msg) {
        System.out.println("sub1이 받은 알림: " + msg);
        // TODO: 무엇을 해야하는지 로직 구현이 주 목적
    }
}
