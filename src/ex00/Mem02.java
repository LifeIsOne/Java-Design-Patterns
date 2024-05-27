package ex00;

/**
 *  학습목표 : 다형성, 동적바인딩
 *  =========================
 *  1. 소나타(object), 제네시스(object) == 자동차(추상)
 */


abstract class Car{         // new X
    abstract void run();
}

class Sonata extends Car {  // 객체를 생성하면 Sonata와 Car가 같이 뜬다.
    @Override
    void run() {
        System.out.println("소나타 달린다.");
    }

}

class Genesis extends Car { // 객체를 생성하면 Genesis와 Car가 같이 뜬다.
    @Override
    void run() {
        System.out.println("제네시스 달린다.");
    }

}

public class Mem02 {
    public static void main(String[] args) {
        Car s = new Sonata();   // 메모리 Sonata(run), car(run)

        s.run();
        // Car의 run()을 호출하러 갔다, Sonata가 run()을 재정의
        // Car의 run()의 오버라이드(무효)되고, Sonata의 run()이 호출.

        Car g = new Genesis();  // 메모리 Genesis(run), car(run)

        g.run();
    }
}


