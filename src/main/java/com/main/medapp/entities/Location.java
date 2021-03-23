package com.main.med_app.entities;

import javax.persistence.*;

@Entity
@Table(name = "Locations")
public class Location {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String locationName;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}