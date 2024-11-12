package ch02;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        DoormanProxy proxy = new DoormanProxy(doorman);

        Mouse mouse = new Mouse();
        Cat cat = new Cat();

        proxy.쫓아내(cat);
        proxy.쫓아내(mouse);

    }
}
