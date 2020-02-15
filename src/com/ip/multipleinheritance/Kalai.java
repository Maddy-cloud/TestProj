package com.ip.multipleinheritance;

import java.util.logging.Logger;

public class Kalai implements Madhi, Sankari{
	private static final Logger LOGGER = Logger.getLogger(Madhi.class.getName());
	
	
	@Override
	public void calm() {
		
		LOGGER.info("Kalai is calm like his father");
		
	}

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		
		LOGGER.info("Kalai is anagry like his mother");
		
	}
	
	public void character() {
		
		LOGGER.info("Kalai is good boy");
	}

}
