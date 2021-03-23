package com.main.med_app.repositories;

import com.main.med_app.entities.MedicalSpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSpecialistRepository extends JpaRepository<MedicalSpecialist, Integer> {
}
