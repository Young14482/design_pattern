package ch02;

public class DoormanProxy {
    private Doorman doorman;

    public DoormanProxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal animal) {
        hello();
        doorman.쫓아내(animal);
    }

    private void hello(){
        System.out.println("hello");
    }

}
