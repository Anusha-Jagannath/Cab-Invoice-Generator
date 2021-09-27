package com.service.cab_invoice_generator;

import org.junit.Test;

import junit.framework.Assert;

public class CabServiceGeneratorTest {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
		double fare = cabServiceGenerator.calculateFare(distance,time);
		Assert.assertEquals(25.0, fare);
		
		
	}
	
}
