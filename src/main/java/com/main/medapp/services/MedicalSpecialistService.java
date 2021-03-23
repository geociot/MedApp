package com.main.med_app.services;

import com.main.med_app.entities.Appointment;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;

@Service
public interface MedicalSpecialistService {

    public abstract void approveAppointment(Appointment appointment);

    public abstract void rejectAppointment(Appointment appointment);

    public abstract void createAppointment(Timestamp startTime, Timestamp endTime);
}
