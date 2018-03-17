package com.anoopvrma.logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LogManager implements Logger{

	private LoggerConfiguration configuration;

	ExecutorService executorService;

	public LogManager(LoggerConfiguration configuration) {
		this.configuration = configuration;
		this.executorService = Executors.newFixedThreadPool(1);
	}

	public void error(final String str) {
		executorService.execute(new Runnable() {
			public void run() {
				for (Logger logger : configuration.getErrorLogger()) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					logger.error(str);
				}
			}
		}
				);
	}

	public void error(final String str, final Throwable a) {
		executorService.execute(new Runnable() {
			public void run() {
				for (Logger logger : configuration.getErrorLogger()) {
					logger.error(str, a);
				}
			}
		}
				);
	}

	public void debug(final String str) {
		executorService.execute(new Runnable() {
			public void run() {
				for (Logger logger : configuration.getDebugLogger()) {
					logger.debug(str);
				}

			}
		}
				);
	}

	public void warn() {
		executorService.execute(new Runnable() {
			public void run() {
				for (Logger logger : configuration.getWarnLogger()) {
					logger.warn();
				}

			}
		}
				);
	}

	public void warn(final String message) {
		executorService.execute(new Runnable() {
			public void run() {
				for (Logger logger : configuration.getWarnLogger()) {
					logger.warn(message);
				}		

			}
		}
				);
	}

	public void info(final String message) {
		executorService.execute(new Runnable() {
			public void run() {
				for (Logger logger : configuration.getInfoLogger()) {
					logger.info(message);
				}
			}
		}
				);
	}

}
