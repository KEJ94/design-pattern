package state.barracks;

import java.util.ArrayList;
import java.util.List;

public class Barracks {

    public List<Bionic> bionics;

    public Barracks(){
        this.bionics = new ArrayList<>();
    }

    public void setState(List<Bionic> bionics) {
        this.bionics = bionics;
    }

    public void productionButtonPush(Bionic bionic) {
        if(bionics.size() < 5){
            System.out.println(bionic.getName() + "생산");
            bionics.add(bionic);
        }else{
            System.out.println("생산불가(MAX)");
        }
    }

    public void cancelButtonPush(){
        if(bionics.isEmpty()){
            System.out.println("취소불가(MIN)");
        }else{
            System.out.println(bionics.get(bionics.size() - 1).getName() + "취소");
            bionics.remove(bionics.size() - 1);
        }
    }
}
