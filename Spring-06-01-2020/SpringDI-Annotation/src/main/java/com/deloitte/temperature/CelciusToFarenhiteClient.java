package com.deloitte.temperature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CelciusToFarenhiteClient{
	public static void main(String[] args) throws Exception{
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		CelciusToFarenhite CtoF = (CelciusToFarenhite) factory.getBean("celciusToFarenhiteImpl");
		double farenhite = CtoF.convert(37.0);
		System.out.println("37.0 degree celius is "+farenhite+" degree farenhite");
	}

}
