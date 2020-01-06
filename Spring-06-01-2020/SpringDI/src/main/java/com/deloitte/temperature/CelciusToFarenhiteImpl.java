package com.deloitte.temperature;

public class CelciusToFarenhiteImpl implements CelciusToFarenhite{
	private double conversionFactor;

	public CelciusToFarenhiteImpl(double conversionFactor) {
		System.out.println("CelciusToFarenhiteImpl() double Parameter");
		this.conversionFactor = conversionFactor;
	}
	
	public double convert(double celcius){
		System.out.println("celciusToFarenhite()");	
		return celcius*conversionFactor+32;
	}

}
