package ch04;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Mouse mouse = new Mouse();
        Cat cat = new Cat();

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
