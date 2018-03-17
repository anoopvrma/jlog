package com.flipkart.logger;

public interface Logger {
	
	public void error(String str);
	
	public void error(String str, Throwable a);
	
	public void debug(String str);
	
	public void warn();
	
	public void warn(String message);
	
	public void info(String message);
	
}
