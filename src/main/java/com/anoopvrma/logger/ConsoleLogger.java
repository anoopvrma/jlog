package com.anoopvrma.logger;

import java.io.Console;


public class ConsoleLogger implements Logger{

	Console console;
	
	public ConsoleLogger() {
		this.console = System.console();
	}
	
	public void error(String str) {
		if(console!=null)
			console.writer().write("[error] : "+str+"\n");
		else
			System.out.print("[error] : "+str+"\n");
	}

	public void error(String str, Throwable a) {
		if(console!=null)
			console.writer().write("[error] : "+str +"\n"+a.getMessage()+"\n");
		else
			System.out.print("[error] : "+str +"\n"+a.getMessage()+"\n");
	}

	public void debug(String str) {
		if(console!=null)
			console.writer().write("[debug] : "+str+"\n");
		else
			System.out.print("[debug] : "+str+"\n");
	}

	public void warn() {
		// TODO Auto-generated method stub
		
	}

	public void warn(String message) {
		if(console!=null)
			console.writer().write("[warn] : "+message+"\n");
		else
			System.out.print("[warn] : "+message+"\n");
	}

	public void info(String message) {
		if(console!=null)
			console.writer().write("[info] : "+message+"\n");
		else
			System.out.print("[info] : "+message+"\n");
	}
	
}
