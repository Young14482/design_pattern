package ch04;

// SRP >> Single Responsibility Principle ?? 하나의 클래스는 하나의 책임만 지는게 좋다.
public class Doorman {

    // DIP >> Dependency Inversion Principle ?? 상위 모듈이 하위 모듈에 의존하지 않고, 둘 다 추상화에 의존하도록 설계하는 원칙
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + " 쫓아내");
    }
}
