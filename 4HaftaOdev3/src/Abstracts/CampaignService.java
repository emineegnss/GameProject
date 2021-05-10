package Abstracts;

import Entities.Campaign;

public interface CampaignService {
    void login(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
}
