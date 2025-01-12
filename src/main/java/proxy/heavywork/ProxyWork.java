package proxy.heavywork;

public class ProxyWork implements Work {

    HeavyWork heavyWork;

    public ProxyWork(){
        System.out.println("Proxy 호출");
    }

    @Override
    public void excute() {
        heavyWork = new HeavyWork();
        heavyWork.excute();
    }
}
