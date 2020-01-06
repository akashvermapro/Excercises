package com.deloitte.temperature;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import com.deloitte.temperature.CelciusToFarenhite;

public class CelciusToFarenhiteClient {
	public static void main(String[] args){
		Resource res =new ClassPathResource("practice.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CelciusToFarenhite CtoF = (CelciusToFarenhite) factory.getBean("convertToFarenhite");
		double farenhite = CtoF.convert(37.0);
		System.out.println("37.0 degree celius is "+farenhite+" degree farenhite");
	}

}
