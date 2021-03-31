package com.main.medapp.medical_specialist;

import com.main.medapp.appointment.Appointment;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public interface MedicalSpecialistService {

    void approveAppointment(Appointment appointment);

    void rejectAppointment(Appointment appointment);

    void newAppointment(MedicalSpecialist medicalSpecialist,Timestamp startTime, Timestamp endTime);
}
