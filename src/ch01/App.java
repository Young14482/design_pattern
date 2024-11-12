package ch01;

import ch02.DoormanProxy;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Mouse mouse = new Mouse();
        Cat cat = new Cat();

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
