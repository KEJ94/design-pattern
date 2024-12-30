package decorator.macbook;

public abstract class MacbookDecorator implements Macbook {

    private Macbook macbook;

    public MacbookDecorator(Macbook macbook){
        this.macbook = macbook;
    }

    @Override
    public String getMacbook() {
        return macbook.getMacbook();
    }

    @Override
    public int getPrice() {
        return macbook.getPrice();
    }
}
