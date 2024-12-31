package strategy;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        BlizzardShop blizzardShop = new BlizzardShop(new ChristmasSaleImpl());

        Game game = new Game();
        game.setPrice(16500);

        List<Game> games = new ArrayList<>();
        games.add(game);

        int price = blizzardShop.cart(games);

        System.out.println(price);

        BlizzardShopLegacy blizzardShopLegacy = new BlizzardShopLegacy();
        int legacyPrice = blizzardShopLegacy.cart(Boolean.TRUE, games);

        System.out.println(legacyPrice);

    }
}
