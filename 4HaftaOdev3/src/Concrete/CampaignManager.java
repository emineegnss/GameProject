package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

    @Override
    public void login(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyasından yararlanabilirsiniz!!");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getGameName() +  "oyunundaki " + campaign.getCampaignName() + " kampanyası silindi!!");
    }

    @Override
    public void update(Campaign campaign) {

        System.out.println(campaign.getCampaignName() + " Kampanyanız güncellendi!!");
    }


}

