package com.selenium.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Supritha.h\\Eclipse workplace\\SeleniumPractices\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.beallsflorida.com");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("QuickLinks_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1"))
				.sendKeys("Shalingegowda@beallsinc.com");
		// driver.findElement(By.cssSelector("input[name*='logonPassword']")).sendKeys("Password@2");
		driver.findElement(By.name("logonPassword")).sendKeys("Password@2");
		// driver.findElement(By.xpath("//ul[@id='quickLinksBar']/li/a/span")).click(); // using absolute xpath
		// driver.findElement(By.xpath("//a[text()='forgot your password?']")).click();
//		driver.findElement(By.id("QuickLinks_GlobalLogin_WC_AccountDisplay_links_1")).click();
		driver.findElement(By.id("QuickLinks_GlobalLogin_WC_AccountDisplay_links_2")).click();
		System.out.println(driver.getTitle());
		// driver.close();
	}

}
