package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewTest2 {
	
	public static final Logger log = LogManager.getLogger(NewTest2.class);
	public static void main(String[] args) {
		
		log.info("This is info message1");
		log.debug("This is debug message1");
		log.error("This is eror message1");
		
	}
}
