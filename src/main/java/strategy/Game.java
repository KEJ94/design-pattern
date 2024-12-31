package strategy;

public class Game {

    int price = 0;
    boolean old = true;

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public boolean isOld(){
        return old;
    }

    public void setOld(boolean old){
        this.old = old;
    }

    public Game(){

    }
}
