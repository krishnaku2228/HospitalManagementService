package com.bhu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhu.entity.PatientEntity;

@Repository
public interface PatientRepository extends CrudRepository<PatientEntity, Long>{

}
