package decorator.macbook;

public class M4pro implements Macbook{
    @Override
    public String getMacbook() {
        return "MacbookM4pro";
    }

    @Override
    public int getPrice() {
        return 2390000;
    }
}
