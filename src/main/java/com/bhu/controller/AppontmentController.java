package com.bhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhu.entity.Appointment;
import com.bhu.service.AppointmentService;

@RestController
@RequestMapping("/book")
public class AppontmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("appontment")
	public Appointment bookAppointment(@RequestBody Appointment appointment) {
		
		return appointmentService.book(appointment);
		
	}

}
