package ex11;

import ex11.color.BlueColor;
import ex11.color.RedColor;
import ex11.color.YellowColor;
import ex11.shape.Circle;
import ex11.shape.Shape;
import ex11.shape.Square;

/**
 *  목적 : 두 클래스 계층을 연결하는 것
 *  1. 추상화와 구현의 분리
 *  2. 독립적인 클래스 계층구조 단순화
 */

public class App {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueCircle = new Circle(new BlueColor());

        redCircle.draw();
        blueCircle.draw();

        System.out.println("💞💞💞💞💞💞💞💞💞💞💞");

        Shape redSquare = new Square(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redSquare.draw();
        blueSquare.draw();

        System.out.println("💞💞💞💞💞💞💞💞💞💞💞");

        Shape yellowCircle = new Circle(new YellowColor());
        Shape yellowSquare = new Square(new YellowColor());

        yellowCircle.draw();
        yellowSquare.draw();
    }
}
