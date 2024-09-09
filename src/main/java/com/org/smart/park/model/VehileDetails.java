package com.org.smart.park.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@Document
public class VehileDetails {
    private String type;
    private String RegNo;
    private String parkticketId;
    private Boolean parkStatus;
    private Date inTime;
    private Date outTime;
}
