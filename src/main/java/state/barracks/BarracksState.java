package state.barracks;

import java.util.List;

public interface BarracksState {
    void productionButtonPush(NewBarracks barracks, Bionic bionic);
    void cancelButtonPush(NewBarracks barracks);
}
