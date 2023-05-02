package com.city.tempconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.city.tempconverter.model.Convert;

public interface ConvertRepo extends JpaRepository<Convert, Integer>{

	public double findByFromUnit_To_ToUnit(String fromUnit, String toUnit);

	//ResponseEntity<Object> findByUnit();

	

}
