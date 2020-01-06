package com.deloitte.temperature;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deloitte.temperature.ConversionServiceImpl;

@Component ("celciusToFarenhiteImpl")
public class CelciusToFarenhiteImpl implements CelciusToFarenhite{
	private ConversionServiceImpl conversionService;
	
	public CelciusToFarenhiteImpl() {
		System.out.println("CelciusToFarenhiteImpl()");
	}
	
	@Autowired
	public CelciusToFarenhiteImpl(ConversionServiceImpl conversionService) {
		System.out.println("CelciusToFarenhiteImpl(cs)");
		this.conversionService = conversionService;
	}
	
	public double convert(double celcius){
		System.out.println("celciusToFarenhite()");	
		return celcius*conversionService.getConversionRate()+32;
	}
}
