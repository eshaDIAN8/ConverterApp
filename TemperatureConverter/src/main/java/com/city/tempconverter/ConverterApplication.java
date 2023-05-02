package com.city.tempconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.city.tempconverter.controller",
	"com.city.tempconverter.serviceImpl","com.city.tempconverter.model","com.city.tempconverter.repository"})
public class ConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterApplication.class, args);
	}

}
