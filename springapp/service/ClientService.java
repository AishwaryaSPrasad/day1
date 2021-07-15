package com.fis.springapp.service;
import org.springframework.stereotype.Component;

import com.fis.springapp.util.LoggingClass;
import com.fis.springapp.util.SecurityClass;
@Component
public class ClientService {
	
	public void doBookDevice()
	{
		
		System.out.println(" device booking code executing .... ");
		
	}
	
	public void doMakePayment()
	{
	
		System.out.println(" makePayment code executing .... ");
		
	}
	
	public void doMakePayment(String paymentType)
	{
	
		System.out.println(" makePayment code executing .... "+paymentType);
	
	}

}
