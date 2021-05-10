import Abstracts.GamerManager;
import Adapters.MernisServiceAdapter;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());

        Gamer gamer = new Gamer();
        LocalDate date = LocalDate.of(2000,12,20);
        gamer.setGamerName("Emine");
        gamer.setGamerLastName("Güneş");
        gamer.setDateOfBirth(date);
        gamer.setNationalityId("71452039147");
        Game game = new Game();
        game.setGameName("Lol");
        game.setId(1);
        game.setGamePrice(36);
        Campaign campaign = new Campaign();
        campaign.setGameName(game.getGameName());
        campaign.setCampaignName("Öğrenci");
        campaign.setCampaignPrice("8 Tl Düşüş");
        campaign.setId(2);
        gamerManager.sales(gamer);


    }
}
