package com.org.smart.park.repo;

import com.org.smart.park.model.ParkingArea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingAreaRepo extends MongoRepository<ParkingArea,String> {
    List<ParkingArea> findByParkingPlace(String parkingPlace);
}
