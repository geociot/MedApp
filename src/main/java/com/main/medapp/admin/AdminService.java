package com.main.medapp.admin;

import com.main.medapp.location.Location;
import com.main.medapp.medical_specialist.MedicalSpecialist;
import com.main.medapp.patient.Patient;

public interface AdminService {

    Location saveLocation(Location location);

    void deleteLocation(Location location);

    Patient savePatient(Patient patient);

    void deletePatient(Patient patient);

    MedicalSpecialist saveMedicalSpecialist(MedicalSpecialist medicalSpecialist);

    void deleteMedicalSpecialist(MedicalSpecialist medicalSpecialist);
}
