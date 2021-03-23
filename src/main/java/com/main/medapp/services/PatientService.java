package com.main.med_app.services;

import com.main.med_app.entities.Appointment;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    public abstract void bookAppointment(Appointment appointment);

}
