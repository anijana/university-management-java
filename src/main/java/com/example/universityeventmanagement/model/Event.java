package com.example.universityeventmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {
    private int evenId;
    private String evenName;
    private String locationOfEven;
    private String date;
    private String startTime;
    private String endTime;

}
