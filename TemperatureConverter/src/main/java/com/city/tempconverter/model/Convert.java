package com.city.tempconverter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Convert {

	@Id
	@GeneratedValue
	@Column(name="METRICSID")
	private int metricsId;
	
	@Column(name ="INCHTOMETER")
	private double inchToMeter = 0.025;
	
	@Column(name ="FOOTTOMETER")
	private double footToMeter = 0.3048;
	
	@Column(name ="MILETOMETER")
	private double mileToMeter = 1609.344;

	@Column(name ="MMTOMETER")
	private double mmToMeter = 0.001;

	@Column(name ="CMTOMETER")
	private double cmToMeter = 0.01;

	@Column(name ="KMTOMETER")
	private double kmToMeter = 1000;
}
