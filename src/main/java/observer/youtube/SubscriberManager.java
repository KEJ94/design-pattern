package observer.youtube;

interface SubscriberManager {
    void add(Subscriber s);
    void remove(Subscriber s);
    void alarmObservers();
}
