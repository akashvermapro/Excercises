package com.deloitte.temperature;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("conversionService")
public class ConversionServiceImpl implements ConversionService {
	@Value("1.8")//<property name=""
	private double conversionRate;
	
	public ConversionServiceImpl() {
		System.out.println("ConversionServiceImpl()");
	}
	
	public double getConversionRate() {
		System.out.println("getConversionRate()");
		return conversionRate;
	}

}
