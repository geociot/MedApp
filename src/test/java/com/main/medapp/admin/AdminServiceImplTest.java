package com.main.medapp.admin;

import com.main.medapp.appointment.LocationRepository;
import com.main.medapp.location.Location;
import com.main.medapp.medical_specialist.MedicalSpecialist;
import com.main.medapp.medical_specialist.MedicalSpecialistRepository;
import com.main.medapp.medical_specialist.Speciality;
import com.main.medapp.patient.Patient;
import com.main.medapp.patient.PatientRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
class AdminServiceImplTest {

    @Autowired
    private AdminService adminService;

    @MockBean
    private LocationRepository locationRepository;

    @MockBean
    private PatientRepository patientRepository;

    @MockBean
    private MedicalSpecialistRepository medicalSpecialistRepository;

    private Location location;
    private Patient patient;
    private MedicalSpecialist medicalSpecialist;

    public void setupLocation() {
        location  = new Location();
        location.setId(1l);
        location.setLocationName("Location Test");
    }

    public void setupPatient() {
        patient  = new Patient();
        patient.setId(1l);
        patient.setName("Name Test");
        patient.setSurName("Surname Test");
        patient.setEmail("test.email@server.com");
        patientRepository.save(patient);
    }

    public void setupMedicalSpecialist() {
        medicalSpecialist = new MedicalSpecialist();
        medicalSpecialist.setId(1l);
        medicalSpecialist.setName("Test MD Name");
        medicalSpecialist.setSurName("Test MD Surname");
        medicalSpecialist.setEmail("medical.specialist@server.com");
        medicalSpecialist.setSpeciality(Speciality.CARDIOLOGY);
        setupLocation();
        medicalSpecialist.setLocation(location);
        medicalSpecialistRepository.save(medicalSpecialist);
    }

    @Test
    void saveLocation() {
        setupLocation();
        doReturn(location).when(locationRepository).save(any());

        Location returnedLocation = adminService.saveLocation(location);
        Assert.notNull(returnedLocation, "Returned Location is null");
    }

    @Test
    void deleteLocation() {
        setupLocation();
        Mockito.when(locationRepository.findById(location.getId())).thenReturn(Optional.of(location));
        locationRepository.deleteById(location.getId());
        Mockito.verify(locationRepository, times(1)).deleteById(location.getId());
    }

    @Test
    void savePatient() {
        setupPatient();
        doReturn(patient).when(patientRepository).save(any());

        Patient returnedPatient = adminService.savePatient(patient);
        Assert.notNull(returnedPatient, "Returned Patient is null");
    }

    @Test
    void deletePatient() {
        setupPatient();
        Mockito.when(patientRepository.findById(patient.getId())).thenReturn(Optional.of(patient));
        patientRepository.deleteById(patient.getId());
        Mockito.verify(patientRepository, times(1)).deleteById(patient.getId());
    }

    @Test
    void saveMedicalSpecialist() {
        setupMedicalSpecialist();
        doReturn(medicalSpecialist).when(medicalSpecialistRepository).save(any());

        MedicalSpecialist returnedMedicalSpecialist = adminService.saveMedicalSpecialist(medicalSpecialist);
        Assert.notNull(returnedMedicalSpecialist, "Returned Medical Specialist is null");
    }

    @Test
    void deleteMedicalSpecialist() {
        setupMedicalSpecialist();
        Mockito.when(medicalSpecialistRepository.findById(medicalSpecialist.getId())).thenReturn(Optional.of(medicalSpecialist));
        medicalSpecialistRepository.deleteById(medicalSpecialist.getId());
        Mockito.verify(medicalSpecialistRepository, times(1)).deleteById(medicalSpecialist.getId());
    }
}