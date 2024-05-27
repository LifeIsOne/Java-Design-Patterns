package ex00;

/**
 *  학습목표 heap, stack, static 구분하기
 *  https://www.youtube.com/watch?v=QRj0WR5Uh2M
 *
 *  1. JVM은 static 키워드가 붙은 친구들은 static 메모리에 로드.
 *  2. JVM은 static 메모리에서 main 메서드를 찾아 실행.
 *  3. JVM의 생명주기는 main 메서드의 코드 line (Queue)
 *  4.  **heap** 동적 메모리 할당.
 *  5. Method 실행 시 **stack**이 열린다.
 */

class Animal{
    String name = "강아지";

    void speak() {
        String sound = "멍멍";
        System.out.println(sound);
    }   // speak 메서드 스택 소멸
}

public class Mem01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
        System.out.println(a.name);
    }
}
