package Abstracts;

import Abstracts.GameSale;
import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Adapters.MernisServiceAdapter;
import Concrete.GamerCheckManager;
import Entities.Gamer;


public class GamerManager extends GameSale {
    private GamerCheckService gamerCheckService;
    public GamerManager(GamerCheckService gamerCheckService){
        this.gamerCheckService = gamerCheckService;

    }



    @Override
    public void sales(Gamer gamer) {
        if (gamerCheckService.checkIfRealPerson(gamer)){
            super.sales(gamer);
        }else{
            System.out.println("Kaydedilmedi...");
        }

    }




    @Override
    public void playerRegistratio(Gamer gamer) {
        System.out.println(gamer.getGamerName() + " Adlı oyuncunun kaydı alındı");
    }

    @Override
    public void updateİnformatioe(Gamer gamer) {
        System.out.println(gamer.getGamerName() + " Adlı oyuncunun bilgileri güncellendi");
    }



    @Override
    public void deleteRecord(Gamer gamer) {
        System.out.println(gamer.getGamerName() + " Adlı oyuncunun kaydı silindi");
    }
}
