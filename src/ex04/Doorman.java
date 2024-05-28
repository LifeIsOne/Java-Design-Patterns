package ex04;

// 문지기
public class Doorman {

    static Doorman instance = new Doorman();

//    private static Doorman instance = new Doorman();
//    public static Doorman getInstance() {
//        return instance;
//    }

    private Doorman(){

    }

    // 동물은 쫓아내기
    public void getOut(Animal a){
        System.out.println("Go Away " + a.getName());
    }
}
