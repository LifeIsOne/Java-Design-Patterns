package ex02;

public class DoormanProxy2{

    private final Doorman doorman;

    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }

    public void getOut(Animal a){
        System.out.println("Wallet check!");
        doorman.getOut(a);
    }
}
