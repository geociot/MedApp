package com.main.MedApp;

import com.main.MedApp.Models.Patient;
import com.main.MedApp.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class LoggerClient {

    @Autowired
    private CustomStarterLogger customStarterLogger;

    @Autowired
    private PatientRepository patientRepository;

    @PostConstruct
    public void setup(){
        customStarterLogger.print();
        Patient patient = new Patient();
        patient.setName("Vasile");
        patient.setSurName("Gigi");
        patient.setEmail("vasile.gigi@server.com");
        patientRepository.save(patient);
    }
}