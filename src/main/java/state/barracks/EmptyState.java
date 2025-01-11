package state.barracks;

public class EmptyState implements BarracksState {
    @Override
    public void productionButtonPush(NewBarracks barracks, Bionic bionic) {
        System.out.println(bionic.getName() + "생산");
        barracks.bionics.add(bionic);
        barracks.updateState();
    }

    @Override
    public void cancelButtonPush(NewBarracks barracks) {
        System.out.println("취소불가(MIN)");
    }
}