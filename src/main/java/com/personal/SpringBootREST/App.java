package com.personal.SpringBootREST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(RestServiceController.class);
    public static void main( String[] args )
    {
    	log.info("entered application");
        SpringApplication.run(App.class, args);
    
    }
}
