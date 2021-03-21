package com.main.MedApp.Repositories;

import com.main.MedApp.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}

