package com.darshitpatel.springdemo.serviceimpl;

import java.util.Random;

import com.darshitpatel.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName
				+ " provides an outstanding Ecommerce platform. " + 
					"\n The annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
