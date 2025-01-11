package state.barracks;

public class Test {
    public static void main(String[] args) {
        NewBarracks barracks = new NewBarracks();
        barracks.productionButtonPush(new Marine());
        barracks.productionButtonPush(new Medic());
        barracks.productionButtonPush(new Firebat());
        barracks.productionButtonPush(new Ghost());
        barracks.productionButtonPush(new Marine());
        barracks.productionButtonPush(new Ghost());
        barracks.cancelButtonPush();
        barracks.cancelButtonPush();
        barracks.cancelButtonPush();
        barracks.cancelButtonPush();
        barracks.cancelButtonPush();
        barracks.cancelButtonPush();
    }
}
