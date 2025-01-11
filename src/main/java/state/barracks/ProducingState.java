package state.barracks;

import java.util.List;

public class ProducingState implements BarracksState{
    @Override
    public void productionButtonPush(NewBarracks barracks, Bionic bionic) {
        System.out.println(bionic.getName() + "생산");
        barracks.bionics.add(bionic);
        barracks.updateState();
    }

    @Override
    public void cancelButtonPush(NewBarracks barracks) {
        System.out.println(barracks.bionics.get(barracks.bionics.size() - 1).getName() + "취소");
        barracks.bionics.remove(barracks.bionics.size() - 1);
        barracks.updateState();
    }
}
