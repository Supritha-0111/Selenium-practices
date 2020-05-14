package com.selenium.practice;
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
		// Static dropdown handling
//		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//	    s.selectByValue("INR");
//	    s.selectByIndex(3);
		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(3000);
//			
//		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		s.selectByValue("5");
		
		//Handling checkboxes
		WebElement checkbox=driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		//Dynamic dropdown handling
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@value='IXG'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXG']")).click();
		
		
		
	}

}
