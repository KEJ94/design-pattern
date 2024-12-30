package decorator.macbook;

public class Test {

    public static void main(String[] args) {
        Macbook m4pro = new M4pro();
        m4pro = new SsdDecorator(m4pro);
        m4pro = new RamDecorator(m4pro);
        System.out.println(m4pro.getMacbook());
        System.out.println(m4pro.getPrice());
    }
}
