package ex06.notification;

public class SmsNotifier implements Notifier{
    // 컴포지션
    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SmsNotifier() {
    }


    // 재정의
    public void send(){
        if (notifier != null) notifier.send(); // + 기능확장
        System.out.println("💭SMS  Notification");
    }
}
