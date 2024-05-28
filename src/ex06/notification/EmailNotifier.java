package ex06.notification;

public class EmailNotifier implements Notifier{

    // 재정의
    public void send(){
        System.out.println("default notification");
    }
}
