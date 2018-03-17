package com.flipkart.logger;

import java.io.IOException;

public class LoggerFactory {
	
	public static Logger getLogger(){
		
		Logger fileLogger = null;
		try {
			fileLogger = new FileLogger("E:/log.txt");
		} catch (IOException e) {
			//TODO file logger could not be initiated
			e.printStackTrace();
		}
		Logger consoleLogger = new ConsoleLogger();
		
		
		LoggerConfiguration configuration = new LoggerConfiguration();
		if(fileLogger!=null){
			configuration.addErrorLogger(fileLogger);
		}
		configuration.addErrorLogger(consoleLogger);
		configuration.addDebugLogger(consoleLogger);
		configuration.addInfoLogger(consoleLogger);
		
		return new LogManager(configuration);
	}
	
	
	
}
