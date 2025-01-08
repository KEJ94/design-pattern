package observer.youtube;

public class Test {
    public static void main(String[] args) {
        Subscriber s1 = new SubscriberImpl("ejkim");
        Subscriber s2 = new SubscriberImpl("KEJ94");
        Subscriber s3 = new SubscriberImpl("kimeungju");
        SubscriberManager sm = new SubscriberManagerImpl();
        //구독
        sm.add(s1);
        sm.add(s2);
        sm.add(s3);
        //업로드 알람
        sm.alarmObservers();
        //구독취소
        sm.remove(s3);
        //업로드 알람
        sm.alarmObservers();
    }
}
