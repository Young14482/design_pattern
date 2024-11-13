package ch03;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        OuterTiger outerTiger = new OuterTiger();
        TigerAdapter ta  = new TigerAdapter(outerTiger);
        Mouse mouse = new Mouse();
        Cat cat = new Cat();

        doorman.쫓아내(ta);
        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
