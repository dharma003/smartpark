package com.org.smart.park.service;

import ch.qos.logback.core.util.COWArrayList;
import com.org.smart.park.model.ParkingArea;
import com.org.smart.park.repo.ParkingAreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class SearchParkingAreaImpl {

    @Autowired
    private ParkingAreaRepo parkingAreaRepo;

    public List<ParkingArea> getParkingList(String parkingPlace){

        List<ParkingArea> parkingAreaList = new ArrayList<>();

        parkingAreaList =  parkingAreaRepo.findByParkingPlace(parkingPlace);

        return parkingAreaList;

    }

}
