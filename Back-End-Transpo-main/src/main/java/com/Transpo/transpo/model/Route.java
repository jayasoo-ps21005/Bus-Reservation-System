package com.Transpo.transpo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "routes")
public class Route {

    @Id
    private String id;

   
    private String origin;

    
    private String destination;

    public Route() {}

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
}
