package com.anoopvrma;

import com.anoopvrma.logger.Logger;
import com.anoopvrma.logger.LoggerFactory;

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
