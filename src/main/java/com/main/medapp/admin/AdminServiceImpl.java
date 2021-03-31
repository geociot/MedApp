package com.main.medapp.admin;

import com.main.medapp.appointment.LocationRepository;
import com.main.medapp.location.Location;
import com.main.medapp.medical_specialist.MedicalSpecialist;
import com.main.medapp.medical_specialist.MedicalSpecialistRepository;
import com.main.medapp.patient.Patient;
import com.main.medapp.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private MedicalSpecialistRepository medicalSpecialistRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public MedicalSpecialist saveMedicalSpecialist(MedicalSpecialist medicalSpecialist) {
        return medicalSpecialistRepository.save(medicalSpecialist);
    }

    @Override
    public void deleteMedicalSpecialist(MedicalSpecialist medicalSpecialist) {
        medicalSpecialistRepository.delete(medicalSpecialist);
    }
}
