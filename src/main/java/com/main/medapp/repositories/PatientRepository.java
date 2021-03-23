package com.main.med_app.repositories;

import com.main.med_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}

