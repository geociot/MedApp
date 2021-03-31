package com.main.medapp;

import com.main.medapp.appointment.AppointmentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MedAppApplicationTests {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Test
	void contextLoads() {
		Assert.assertNotNull(appointmentRepository);
	}

}
