package ex06.notification;

public class EmailNotifier implements Notifier{

    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    // 디폴트 값
    public EmailNotifier() {}


    // 재정의
    public void send(){
        if (notifier != null) notifier.send(); // + 기능확장
        System.out.println("💌Email notification");
    }
}
