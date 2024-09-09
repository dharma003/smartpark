package com.org.smart.park.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Document
@NoArgsConstructor
public class ParkingArea {
    private String parkingPlace;
    private ArrayList<ParkingLot> parkingLot;

}
