package com.bhu.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment_info")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id", referencedColumnName = "id")
	private PatientEntity patientEntity;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PatientEntity getPatientEntity() {
		return patientEntity;
	}

	public void setPatientEntity(PatientEntity patientEntity) {
		this.patientEntity = patientEntity;
	}


	

}
