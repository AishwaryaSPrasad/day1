package com.fis.springapp.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springapp.model.ElectronicDevice;
import com.fis.springapp.model.Client;
import com.fis.springapp.service.ClientService;


public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
ClientService clientService = (ClientService)spring.getBean("clientService");
		
		System.out.println(" \n\n------------New AOP Approach --------- \n\n");
		clientService.doBookDevice();
		
		System.out.println(" \n\n--------- No Argument call ---------\n\n");
		clientService.doMakePayment();
		
		System.out.println(" \n\n--------- make payment with argument ---------\n\n");
		clientService.doMakePayment("Paytm");
	}

}
