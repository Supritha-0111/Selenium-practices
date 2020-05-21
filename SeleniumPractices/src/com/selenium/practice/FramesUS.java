package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FramesUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Supritha.h\\Eclipse workplace\\SeleniumPractices\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
//		//Handling Https/ssl certification code
//		
//		//Capabilities - to set generice chrome profiles
//		DesiredCapabilities c=new DesiredCapabilities();
//		//c.acceptInsecureCerts();
//		c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		
//		//to set local chrome setting
//		ChromeOptions ch=new ChromeOptions();
//		ch.merge(c);
//		WedDriver driver=new ChromeDriver(ch);
		

	}

}
