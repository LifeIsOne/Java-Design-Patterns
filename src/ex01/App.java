package ex01;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Tiger tiger = new Tiger();
        Doorman doorman = new Doorman();
        doorman.getOut(tiger);
    }
}
