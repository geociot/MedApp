package com.main.medapp;

import com.main.medapp.admin.AdminService;
import com.main.medapp.appointment.Appointment;
import com.main.medapp.location.Location;
import com.main.medapp.medical_specialist.MedicalSpecialist;
import com.main.medapp.patient.Patient;
import com.main.medapp.appointment.AppointmentStatus;
import com.main.medapp.medical_specialist.Speciality;
import com.main.medapp.appointment.AppointmentRepository;
import com.main.medapp.appointment.LocationRepository;
import com.main.medapp.medical_specialist.MedicalSpecialistRepository;
import com.main.medapp.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;

@Service
public class LoggerClient {

    @Autowired
    private CustomStarterLogger customStarterLogger;

    @Autowired
    private AdminService adminService;



//
//    @Autowired
//    private PatientRepository patientRepository;
//
//    @Autowired
//    private LocationRepository locationRepository;
//
//    @Autowired
//    private MedicalSpecialistRepository medicalSpecialistRepository;
//
//    @Autowired
//    private AppointmentRepository appointmentRepository;

    @PostConstruct
    public void setup(){
        customStarterLogger.print();


//        Patient patient = new Patient();
//        patient.setName("Vasile");
//        patient.setSurName("Gigi");
//        patient.setEmail("vasile.gigi@server.com");
//        patientRepository.save(patient);
//
//        Location location = new Location();
//        location.setLocationName("Bucharest - Unirii Trauma Center");
//        adminService.addLocation(location);
//
//        MedicalSpecialist medicalSpecialist = new MedicalSpecialist();
//        medicalSpecialist.setName("Andreea");
//        medicalSpecialist.setSurName("Popescu");
//        medicalSpecialist.setEmail("Andreea.Popescu@server.com");
//        medicalSpecialist.setSpeciality(Speciality.CARDIOLOGY);
//        medicalSpecialist.setLocation(location);
//        medicalSpecialistRepository.save(medicalSpecialist);
//
//        Appointment appointment = new Appointment();
//        appointment.setMedicalSpecialist(medicalSpecialist);
//        appointment.setPatient(patient);
//        appointment.setStartTime(new Timestamp(2021,03,29,14,0,0,0));
//        appointment.setEndTime(new Timestamp(2021,03,29,15,0,0,0));
//        appointment.setStatus(AppointmentStatus.FREE);
//        appointmentRepository.save(appointment);
    }
}