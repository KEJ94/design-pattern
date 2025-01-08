package observer.youtube;

public class SubscriberImpl implements Subscriber {
    String name;

    SubscriberImpl(String name){
        this.name = name;
    }

    @Override
    public void uploadAlarm(String creator) {
        System.out.println(name + "님! " + creator + "님이 동영상을 업로드 했습니다.");
    }
}
