package innow.service;

import innow.entity.Advertiser;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AdvertiserService {
    Page<Advertiser> list(int value, String column);
}
