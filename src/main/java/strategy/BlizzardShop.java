package strategy;

import java.util.List;

public class BlizzardShop {
    private Sale sale;

    public BlizzardShop(Sale sale){
        this.sale = sale;
    }

    public int cart(List<Game> games){
        int sum = 0;
        for(Game game : games){
            sum += sale.getPrice(game);
        }
        return sum;
    }
}
