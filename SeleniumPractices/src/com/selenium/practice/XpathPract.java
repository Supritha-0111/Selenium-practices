package com.selenium.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Supritha.h\\Eclipse workplace\\SeleniumPractices\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//sibling travers
		driver.findElement(By.xpath("//li[@class='myspice_trip']/following-sibling::li")).click();
		
		//child to parent travers
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='text-label']/parent::a")).click();
	}

}
