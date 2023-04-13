package com.bhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhu.entity.Appointment;
import com.bhu.repository.AppointmentRepository;
@Service
public class AppointmentService {
	
	@Autowired 	
	private AppointmentRepository appointmentRepository;
	
	public Appointment book(Appointment appointment) {
		return appointmentRepository.save(appointment);
		
	}
	

}
