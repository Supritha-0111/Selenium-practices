package com.selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Supritha.h\\Eclipse workplace\\SeleniumPractices\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();
		
		System.out.println("Before switchin to child");
		System.out.println(driver.getTitle());
		
		Set<String>a=driver.getWindowHandles();
		Iterator<String>b=a.iterator();
		String parent = b.next();
		String child=b.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		
		
		

	}

}
