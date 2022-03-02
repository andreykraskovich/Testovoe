package innow.repository;

import innow.entity.Advertiser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertiserRepository extends PagingAndSortingRepository<Advertiser, Long> {

}
