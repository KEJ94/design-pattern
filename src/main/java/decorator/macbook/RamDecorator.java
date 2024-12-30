package decorator.macbook;

public class RamDecorator extends MacbookDecorator{
    public RamDecorator(Macbook macbook) {
        super(macbook);
    }

    @Override
    public String getMacbook(){
        return super.getMacbook() + " RAM 32GB";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 600000;
    }
}
