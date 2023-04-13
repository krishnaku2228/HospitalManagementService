package com.bhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhu.dto.Patient;
import com.bhu.service.PatientService;
import com.bhu.serviceimpl.PatientServiceImpl;

@RestController
@RequestMapping(value="patient")
public class MyController 
{
	@Autowired
	PatientServiceImpl PatientService;
	
	@PostMapping("addpatient")
	public ResponseEntity<Patient> patientSingUp(@RequestBody Patient patient)
	{
		Patient user=PatientService.patientSignUp(patient);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	}

}
