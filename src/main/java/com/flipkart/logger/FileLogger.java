package com.flipkart.logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileLogger implements Logger{

	String filepath;
	
	public FileLogger(String filepath) throws IOException {
		File f = new File(filepath);
		if(!f.exists() && !f.isDirectory())
		{
		    f.createNewFile();
		}
		this.filepath = f.getAbsolutePath();
	}
	
	public void error(String str) {
		try {
			Files.write(Paths.get(filepath), ("[error] : "+str+"\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void error(String str, Throwable a) {
		try {
			Files.write(Paths.get(filepath), ("[error] : "+str+"\n"+a.getMessage()).getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void debug(String str) {
		try {
			Files.write(Paths.get(filepath), ("[debug] : "+str+"\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void warn() {
		// TODO Auto-generated method stub
		
	}

	public void warn(String message) {
		try {
			Files.write(Paths.get(filepath), ("[warn] : "+message+"\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void info(String message) {
		try {
			Files.write(Paths.get(filepath), ("[info] : "+message+"\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
