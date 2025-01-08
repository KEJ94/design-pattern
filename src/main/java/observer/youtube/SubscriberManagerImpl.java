package observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class SubscriberManagerImpl implements SubscriberManager {

    public String name = "ITSub잇섭";

    List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void add(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void remove(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void alarmObservers() {
        for(Subscriber s : subscribers){
            s.uploadAlarm(name);
        }
    }
}
