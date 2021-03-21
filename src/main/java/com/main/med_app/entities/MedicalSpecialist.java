package com.main.MedApp.Models;
import com.main.MedApp.Enums.Speciality;

import javax.persistence.*;

@Entity
@Table(name = "MedicalSpecialists")
public class MedicalSpecialist {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String name;
    String surName;
    String email;

    @OneToOne
    @JoinColumn(name = "location_id")
    Location location;

    @Enumerated(EnumType.STRING)
    Speciality speciality;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
