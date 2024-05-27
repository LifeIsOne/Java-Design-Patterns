package ex02;

public class DoormanProxy extends Doorman{
    public void getOut(Animal a){
        System.out.println("Wallet check!");
        super.getOut(a);
    }
}