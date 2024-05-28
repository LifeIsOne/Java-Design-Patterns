package ex06.notification;

public class BasicNotifier implements Notifier{

    // 재정의
    public void send(){
        System.out.println("📣Basic notification");
    }
}
