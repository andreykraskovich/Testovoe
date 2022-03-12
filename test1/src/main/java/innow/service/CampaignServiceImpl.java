package innow.service;

import innow.entity.Campaign;
import innow.entity.User;
import innow.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class CampaignServiceImpl implements CampaignService{
    private CampaignRepository campaignRepository;
    @Autowired
    public CampaignServiceImpl(CampaignRepository campaignRepository){
        this.campaignRepository = campaignRepository;
    }

    @Override
    public List<Campaign> list() {
        Iterable<Campaign> list = campaignRepository.findAll();
        return new ArrayList<>((Collection<? extends Campaign>) list);
    }

    @Override
    public Campaign add(Campaign campaign) {
        return campaignRepository.save(campaign);
    }
}
