package com.java.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          Properties prop=new Properties();
          FileInputStream fis=new FileInputStream("C:\\Users\\Supritha.h\\git\\Selenium-practices\\JavaPractices\\src\\data.properties");
          prop.load(fis);
          System.out.println(prop.getProperty("Browser"));
          System.out.println(prop.getProperty("URL"));
          
          prop.setProperty("Browser", "Firefox");
          System.out.println(prop.getProperty("Browser"));
          FileOutputStream fos=new FileOutputStream("C:\\Users\\Supritha.h\\git\\Selenium-practices\\JavaPractices\\src\\data.properties");
          prop.store(fos, null);

          
	}

}
