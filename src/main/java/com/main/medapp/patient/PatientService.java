package com.main.medapp.patient;

import com.main.medapp.appointment.Appointment;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    void bookAppointment(Patient patient, Appointment appointment);

}
