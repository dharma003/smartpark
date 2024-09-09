package com.org.smart.park.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;
@Data
@AllArgsConstructor
@ToString
@Document
public class Parking {

    private VehileDetails vehileDetails;
    private String parkingId;
    private Date parkingTime;
    private Date unParkingTime;

}
