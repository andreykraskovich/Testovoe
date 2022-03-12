package innow.service;

import innow.entity.Campaign;

import java.util.List;

public interface CampaignService {
    List<Campaign> list();
    Campaign add(Campaign campaign);
}
