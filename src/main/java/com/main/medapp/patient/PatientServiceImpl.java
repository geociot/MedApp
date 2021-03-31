package com.main.medapp.patient;

import com.main.medapp.appointment.Appointment;
import com.main.medapp.appointment.AppointmentRepository;
import com.main.medapp.appointment.AppointmentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void bookAppointment(Patient patient, Appointment appointment) {
        appointment.setPatient(patient);
        appointment.setStatus(AppointmentStatus.PENDING);
        appointmentRepository.save(appointment);
    }
}
