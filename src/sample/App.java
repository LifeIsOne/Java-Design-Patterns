package sample;

/**
 *  상황 : 만보기 라이브러리 만드는 개발자 - 만보기 메서드를 사용하는 프론트 개발자
 *  문제 : 만보기 개발자가 일이 늦어, 30일이 걸리고. 나는 10일내 개발이 필요...!
 *  1. Interface 구현
 */
public class App {
    public static void main(String[] args) {
        MeterService ms = new MeterService(new MockMeter());
        ms.render();
    }
}
