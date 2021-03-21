package com.main.MedApp.Models;

import com.main.MedApp.Enums.AppointmentStatus;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "medical_specialist_id")
    MedicalSpecialist medicalSpecialist;

    Long idPatient;

    Timestamp startTime;
    Timestamp endTime;

    @Enumerated(EnumType.STRING)
    AppointmentStatus status;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public MedicalSpecialist getMedicalSpecialist() {
        return medicalSpecialist;
    }

    public Long getIdPatient() {
        return idPatient;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}
