package com.flipkart;

import com.flipkart.logger.Logger;
import com.flipkart.logger.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	    	
        Logger logger = LoggerFactory.getLogger();
        
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.error("This is error message");
    }
    
}
