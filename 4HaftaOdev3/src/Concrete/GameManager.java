package Concrete;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {


    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " oyunu" + game.getGamePrice() + " fiyatı ile eklendi.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " oyununu sildiniz.");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + " oyununuz güncellendi");
    }
}
