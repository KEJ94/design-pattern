package state.barracks;

public class FullState implements BarracksState{
    @Override
    public void productionButtonPush(NewBarracks barracks, Bionic bionic) {
        System.out.println("생산불가(MAX)");
    }

    @Override
    public void cancelButtonPush(NewBarracks barracks) {
        System.out.println(barracks.bionics.get(barracks.bionics.size() - 1).getName() + "취소");
        barracks.bionics.remove(barracks.bionics.size() - 1);
        barracks.updateState();
    }
}
