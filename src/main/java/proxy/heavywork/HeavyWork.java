package proxy.heavywork;

import java.time.LocalDateTime;

public class HeavyWork implements Work{

    public HeavyWork(){
        ready();
    }

    public void ready() {
        try{
            System.out.println("작업준비 : " + LocalDateTime.now());
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void excute() {
        System.out.println("작업시작 : " + LocalDateTime.now());
    }
}
