package sg.edu.ntu.m3project.m3project.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import sg.edu.ntu.m3project.m3project.entity.ItineraryItem;

@Repository
public interface ItineraryItemRepository extends CrudRepository<ItineraryItem, Integer>{

}
