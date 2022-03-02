package innow.service;

import innow.entity.Advertiser;
import innow.repository.AdvertiserRepository;
import net.bytebuddy.description.annotation.AnnotationValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdvertiserServiceImpl implements AdvertiserService {
    private AdvertiserRepository advertiserRepository;
    @Autowired
    public AdvertiserServiceImpl(AdvertiserRepository advertiserRepository){
        this.advertiserRepository = advertiserRepository;
    }
    @Override
    public Page<Advertiser> list(int value, String column) {
        Pageable firstPageWithTwoElements = PageRequest.of(value, 10);
        return advertiserRepository.findAll(firstPageWithTwoElements);
    }
}
