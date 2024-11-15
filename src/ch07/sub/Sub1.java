package ch07.sub;

public class Sub1 implements SubListener{

    @Override
    public void update(String msg) {
        System.out.println("sub1이 받은 알림: " + msg);
    }
}
