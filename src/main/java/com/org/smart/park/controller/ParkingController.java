package com.org.smart.park.controller;

import com.org.smart.park.model.ParkingArea;
import com.org.smart.park.service.SaveParkServiceImpl;
import com.org.smart.park.service.SearchParkingAreaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private SaveParkServiceImpl saveParkService;

    @Autowired
    private SearchParkingAreaImpl searchParkingArea;

    @GetMapping("/checkAvailability")
    public ResponseEntity<List<ParkingArea>> searchParkingList(@RequestParam String parkingPlace) {


        List<ParkingArea> parkingAreaList = searchParkingArea.getParkingList(parkingPlace);

        return new ResponseEntity<>(parkingAreaList, HttpStatus.FOUND);

    }


    @PostMapping("/saveParkingArea")
    public ResponseEntity<String> saveParkingArea(@RequestBody ParkingArea parkingArea){

        saveParkService.saveParkingArea(parkingArea);

        return new ResponseEntity<>("Successfully saved in database",HttpStatus.CREATED);
    }


}
