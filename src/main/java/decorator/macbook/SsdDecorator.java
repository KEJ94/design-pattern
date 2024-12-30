package decorator.macbook;

public class SsdDecorator extends MacbookDecorator{
    public SsdDecorator(Macbook macbook) {
        super(macbook);
    }

    @Override
    public String getMacbook(){
        return super.getMacbook() + " 1TB SSD";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 300000;
    }
}
