package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewTest {
	
	public static final Logger log = LogManager.getLogger(NewTest.class);
	public static void main(String[] args) {
		
		log.info("This is info message");
		log.debug("This is debug message");
		log.error("This is eror message");
		
	}
}
