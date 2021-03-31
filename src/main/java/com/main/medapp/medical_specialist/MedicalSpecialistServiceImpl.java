package com.main.medapp.medical_specialist;

import com.main.medapp.appointment.Appointment;
import com.main.medapp.appointment.AppointmentRepository;
import com.main.medapp.appointment.AppointmentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class MedicalSpecialistServiceImpl implements MedicalSpecialistService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void approveAppointment(Appointment appointment) {
        appointment.setStatus(AppointmentStatus.APPROVED);
        appointmentRepository.save(appointment);
    }

    @Override
    public void rejectAppointment(Appointment appointment) {
        appointment.setPatient(null);
        appointment.setStatus(AppointmentStatus.FREE);
        appointmentRepository.save(appointment);
    }

    @Override
    public void newAppointment(MedicalSpecialist medicalSpecialist,Timestamp startTime, Timestamp endTime) {
        Appointment appointment = new Appointment();
        appointment.setMedicalSpecialist(medicalSpecialist);
        appointment.setStartTime(startTime);
        appointment.setEndTime(endTime);
        appointment.setStatus(AppointmentStatus.FREE);
        appointmentRepository.save(appointment);
    }
}
