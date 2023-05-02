package com.city.tempconverter.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.city.tempconverter.repository.ConvertRepo;
import com.city.tempconverter.service.ConvertService;


@Component
public class LengthConverterServiceImpl implements ConvertService {
	
	@Autowired
	ConvertRepo repo;
	

	 double convertedValues;
	 double kmToMeter;

	@Override
	public double convertedMetric(String fromUnit, String toUnit, double value) {
		if(fromUnit.equalsIgnoreCase("km")&& toUnit.equalsIgnoreCase("meter")) {
			
			 kmToMeter = repo.findByFromUnit_To_ToUnit(fromUnit, toUnit);
			convertedValues = value* kmToMeter;	
			 
		}
		else 
			{
			convertedValues = value/kmToMeter;
		
			}
		return convertedValues;
		
	

	
		
	}

}
