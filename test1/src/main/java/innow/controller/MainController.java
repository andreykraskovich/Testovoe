package innow.controller;

import innow.entity.Advertiser;
import innow.entity.Campaign;
import innow.entity.User;
import innow.service.AdvertiserServiceImpl;
import innow.service.CampaignServiceImpl;
import innow.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    private UserServiceImpl userService;
    private AdvertiserServiceImpl advertiserService;
    private CampaignServiceImpl campaignService;
    @Autowired
    public MainController(AdvertiserServiceImpl advertiserService, UserServiceImpl userService, CampaignServiceImpl campaignService){
        this.advertiserService = advertiserService;
        this.userService = userService;
        this.campaignService = campaignService;
    }

    @GetMapping("/user/advertisers/page={value}sort={column}")
    public Page <Advertiser> getAll(@PathVariable int value, @PathVariable String column){
        return advertiserService.list(value, column);
    }

    @GetMapping("/admin/users")
    public List<User> getUsers(){
        return userService.list();
    }

    @PostMapping("/user/advertisers/")
    public Advertiser addAdvertiser(Advertiser advertiser){
        return advertiserService.add(advertiser);
    }

    @GetMapping("/user/campaigns")
    public List<Campaign> getCampaigns(){
        return campaignService.list();
    }

}
