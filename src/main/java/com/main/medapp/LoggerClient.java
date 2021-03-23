package com.main.med_app;

import com.main.med_app.entities.Appointment;
import com.main.med_app.entities.Location;
import com.main.med_app.entities.MedicalSpecialist;
import com.main.med_app.entities.Patient;
import com.main.med_app.enums.AppointmentStatus;
import com.main.med_app.enums.Speciality;
import com.main.med_app.repositories.AppointmentRepository;
import com.main.med_app.repositories.LocationRepository;
import com.main.med_app.repositories.MedicalSpecialistRepository;
import com.main.med_app.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;
import java.util.Locale;

@Service
public class LoggerClient {

    @Autowired
    private CustomStarterLogger customStarterLogger;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private MedicalSpecialistRepository medicalSpecialistRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostConstruct
    public void setup(){
        customStarterLogger.print();

        Patient patient = new Patient();
        patient.setName("Vasile");
        patient.setSurName("Gigi");
        patient.setEmail("vasile.gigi@server.com");
        patientRepository.save(patient);

        Location location = new Location();
        location.setLocationName("Bucharest - Baneasa Trauma Center");
        locationRepository.save(location);

        MedicalSpecialist medicalSpecialist = new MedicalSpecialist();
        medicalSpecialist.setName("Andreea");
        medicalSpecialist.setSurName("Popescu");
        medicalSpecialist.setEmail("Andreea.Popescu@server.com");
        medicalSpecialist.setSpeciality(Speciality.CARDIOLOGY);
        medicalSpecialist.setLocation(location);
        medicalSpecialistRepository.save(medicalSpecialist);

        Appointment appointment = new Appointment();
        appointment.setMedicalSpecialist(medicalSpecialist);
        appointment.setPatient(patient);
        appointment.setStartTime(new Timestamp(2021,03,29,14,0,0,0));
        appointment.setEndTime(new Timestamp(2021,03,29,15,0,0,0));
        appointment.setStatus(AppointmentStatus.FREE);
        appointmentRepository.save(appointment);
    }
}