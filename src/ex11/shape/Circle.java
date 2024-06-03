package ex11.shape;

import ex11.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("⚪동그라미 그리기");
        color.setColor();
    }
}
