package com.selenium.practice;
import org.testng.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Supritha.h\\Eclipse workplace\\SeleniumPractices\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		
		//Dynamic dropdown handling
		Thread.sleep(7000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@value='IXG'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXG']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
			
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("5");
		driver.findElement(By.id("divpaxinfo")).getText();
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		
		// Static dropdown handling
		Select ss=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    ss.selectByValue("INR");
	    ss.selectByIndex(3);
		
		
		//Handling checkboxes
				WebElement checkbox=driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
				checkbox.click();
				//System.out.println(checkbox.isSelected());
		        Assert.assertTrue(checkbox.isSelected());
				System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
				
				driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
	}
	
}