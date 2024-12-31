package strategy;

public class ChristmasSaleImpl implements Sale {
    @Override
    public int getPrice(Game game) {
        // 크리스마스 이벤트 50% 세일
        return (int) (game.getPrice() * 0.5);
    }
}
