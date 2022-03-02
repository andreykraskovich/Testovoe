package innow.controller;

import innow.entity.Advertiser;
import innow.entity.User;
import innow.repository.UserRepository;
import innow.service.AdvertiserServiceImpl;
import innow.service.UserService;
import innow.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class MainController {
    private UserServiceImpl userService;
    private AdvertiserServiceImpl advertiserService;
    @Autowired
    public MainController(AdvertiserServiceImpl advertiserService, UserServiceImpl userService){
        this.advertiserService = advertiserService;
        this.userService = userService;
    }

    @GetMapping("/advertisers/page={value}sort={column}")
    public Page <Advertiser> getAll(@PathVariable int value, @PathVariable String column){
        return advertiserService.list(value, column);
    }

    @GetMapping("/admin/users")
    public List<User> getAll(){
        return userService.list();
    }
}
