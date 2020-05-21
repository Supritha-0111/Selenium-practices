package CucumberAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

      public static WebDriver getDriver() {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supritha.h\\git\\Selenium-practices\\CucumberFrame\\drivers\\chromedriver.exe");
    	    driver=new ChromeDriver();
    	    return driver;
      }
}
