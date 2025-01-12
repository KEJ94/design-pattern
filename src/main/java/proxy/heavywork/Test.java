package proxy.heavywork;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //List<Work> workList = List.of(new HeavyWork(), new HeavyWork(), new HeavyWork());
        List<Work> workList = List.of(new ProxyWork(), new ProxyWork(), new ProxyWork());
        workList.get(0).excute();
    }
}
