package com.main.med_app.entities;

import com.main.med_app.enums.AppointmentStatus;

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

    @ManyToOne
    @JoinColumn(name = "patient_id")
    Patient patient;

    Timestamp startTime;
    Timestamp endTime;

    @Enumerated(EnumType.STRING)
    AppointmentStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MedicalSpecialist getMedicalSpecialist() {
        return medicalSpecialist;
    }

    public void setMedicalSpecialist(MedicalSpecialist medicalSpecialist) {
        this.medicalSpecialist = medicalSpecialist;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
