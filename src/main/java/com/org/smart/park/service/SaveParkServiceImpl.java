package com.org.smart.park.service;

import com.org.smart.park.model.ParkingArea;
import com.org.smart.park.repo.ParkingAreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveParkServiceImpl {

    @Autowired
    private ParkingAreaRepo parkingAreaRepo;

    public String saveParkingArea(ParkingArea parkingArea){

        parkingAreaRepo.save(parkingArea);

        return "Success";
    }

}
