package state.barracks;

import java.util.ArrayList;
import java.util.List;

public class NewBarracks {
    List<Bionic> bionics;
    BarracksState barracksState;

    public NewBarracks(){
        this.bionics = new ArrayList<>();
        this.barracksState = new EmptyState();
    }

    public void setBarracksState(BarracksState barracksState) {
        this.barracksState = barracksState;
    }

    public void updateState() {
        if(bionics.size() == 5){
            setBarracksState(new FullState());
        }else if (bionics.isEmpty()){
            setBarracksState(new EmptyState());
        }else{
            setBarracksState(new ProducingState());
        }
    }

    public void productionButtonPush(Bionic bionic) {
        barracksState.productionButtonPush(this, bionic);
    }

    public void cancelButtonPush() {
        barracksState.cancelButtonPush(this);
    }
}
