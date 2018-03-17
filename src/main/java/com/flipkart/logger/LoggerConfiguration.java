package com.flipkart.logger;

import java.util.*;

public class LoggerConfiguration {
	//TODO read from properties file
	
	private List<Logger> errorLogger = new ArrayList<Logger>();
	private List<Logger> warnLogger = new ArrayList<Logger>();
	private List<Logger> infoLogger = new ArrayList<Logger>();
	private List<Logger> debugLogger = new ArrayList<Logger>();
	
	public void addErrorLogger(Logger logger) {
		getErrorLogger().add(logger);
	}
	public void addWarnLogger(Logger logger) {
		getWarnLogger().add(logger);
	}
	public void addInfoLogger(Logger logger) {
		getInfoLogger().add(logger);
	}
	public void addDebugLogger(Logger logger) {
		getDebugLogger().add(logger);
	}
	
	public List<Logger> getErrorLogger() {
		return errorLogger;
	}
	
	public List<Logger> getWarnLogger() {
		return warnLogger;
	}
	
	public List<Logger> getInfoLogger() {
		return infoLogger;
	}
	
	public List<Logger> getDebugLogger() {
		return debugLogger;
	}
	
}
