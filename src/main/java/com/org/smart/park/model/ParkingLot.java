package com.org.smart.park.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@ToString
@Document
public class ParkingLot {

    private Integer id;
    private List<ParkingSlot> parkingSlot;
    private String level;

}
