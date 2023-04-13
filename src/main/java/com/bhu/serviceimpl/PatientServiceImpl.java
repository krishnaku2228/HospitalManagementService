package com.bhu.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhu.dto.Patient;
import com.bhu.entity.PatientEntity;
import com.bhu.repository.PatientRepository;
import com.bhu.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService
{
	@Autowired
	private PatientRepository repository;
	
	public Patient patientSignUp(Patient patient) 
	{
		PatientEntity entity=new PatientEntity();
		entity.setName(patient.getName());
		entity.setAddress(patient.getAddress());
		entity.setMobileNumber(patient.getMobileNumber());
		entity.setEmailId(patient.getEmailId());
		Date date =new Date();
		entity.setDate(date);
		
		repository.save(entity);
		return patient;
	}

}
