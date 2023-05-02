package com.city.tempconverter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.city.tempconverter.model.Convert;
import com.city.tempconverter.repository.ConvertRepo;
import com.city.tempconverter.service.ConvertService;

@RestController
@RequestMapping("/converter")
public class ConvertController {
	
	@Autowired
	ConvertService convertService ;
	
	

	@Autowired
	ConvertRepo convertRepo;
	
	//HttpServletRequest req,
	
	@GetMapping("/{fromUnit}/{toUnit}/{value}")
	public  ResponseEntity<Object> getUnitValue(@PathVariable String fromUnit,
			@PathVariable String toUnit, @PathVariable double value) {
		
		double toValueResult = convertService.convertedMetric(fromUnit,toUnit,value);
	//	double FromValueResult = convertService.convertFromMetric(fromUnit,toUnit,value);
		//Convert temp = new Convert(tempInCelcius,tempInFahrenheit);
		
		//return convertRepo.findByUnit(fromUnit,toUnit);
		return ResponseEntity.ok(toValueResult);
	}

}
