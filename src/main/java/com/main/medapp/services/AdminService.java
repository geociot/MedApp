package com.main.med_app.services;

import com.main.med_app.entities.Appointment;
import com.main.med_app.entities.Location;
import com.main.med_app.entities.MedicalSpecialist;
import com.main.med_app.entities.Patient;

public interface AdminService {

    public abstract void addLocation(Location location);

    public abstract void updateLocation(Location location);

    public abstract void removeLocation(Location location);

    public abstract void addPatient(Patient patient);

    public abstract void updatePatient(Patient patient);

    public abstract void modifyPatient(Patient patient);

    public abstract void addMedicalSpecialist(MedicalSpecialist medicalSpecialist);

    public abstract void updateMedicalSpecialist(MedicalSpecialist medicalSpecialist);

    public abstract void modifyMedicalSpecialist(MedicalSpecialist medicalSpecialist);
}
