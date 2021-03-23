package com.main.med_app.repositories;

import com.main.med_app.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
