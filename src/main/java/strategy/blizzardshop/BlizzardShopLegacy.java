package strategy.blizzardshop;

import java.util.List;

public class BlizzardShopLegacy {
    public int cart(boolean isChristmas, List<Game> games){
        int sum = 0;
        for(Game game : games){
            if(isChristmas){
                // 크리스마스 이벤트 50% 할인
                sum += (int) (game.getPrice() * 0.5);
            }else if(game.isOld()){
                // 고전 게임 20% 할인
                sum += (int) (game.getPrice() * 0.8);
            }else{
                sum += game.getPrice();
            }
        }
        return sum;
    }
}
