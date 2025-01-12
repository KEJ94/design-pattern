package abstractfactory.devices;

public class Test {
    public static void main(String[] args) {
        DevicesFactory factory;
        // 삼성공장
        factory = new SamsungFactory();
        Keyboard samsungKeyboard = factory.createKeyboard();
        Mouse samsungMouse = factory.createMouse();
        System.out.println(samsungKeyboard.getClass().getName());
        System.out.println(samsungMouse.getClass().getName());
        // 엘지공장
        factory = new LGFactory();
        Keyboard lgKeyboard = factory.createKeyboard();
        Mouse lgMouse = factory.createMouse();
        System.out.println(lgKeyboard.getClass().getName());
        System.out.println(lgMouse.getClass().getName());
    }
}
