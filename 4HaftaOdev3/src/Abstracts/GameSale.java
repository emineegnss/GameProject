package Abstracts;

import Entities.Game;
import Entities.Gamer;

public abstract class GameSale implements GamerService{


    public void sales(Gamer gamer){
        System.out.println(gamer.getGamerName() + " adlı oyuncuya oyun satıldı " );
    }
}
