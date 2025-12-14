package com.Transpo.transpo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "buses")
public class Bus {

    @Id
    private String id;

   
    private String busNumber;

    private String busName;

    private int totalSeats;

    public Bus() {
    }

    public Bus(String busNumber, String busName, int totalSeats) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.totalSeats = totalSeats;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusName() {
        return busName;
    }
    public void setBusName(String busName) {
        this.busName = busName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
